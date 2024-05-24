package com.nickwww.product.service.Impl;

import com.alibaba.fastjson.JSON;
import com.nickwww.model.entity.product.Category;
import com.nickwww.product.mapper.CategoryMapper;
import com.nickwww.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Cacheable(value = "category", key = "'all'")
    @Override
    public List<Category> selectOneCategory() {
        String listJson = redisTemplate.opsForValue().get("category:one");
        if(!StringUtils.hasText(listJson)){
            List<Category> ret = JSON.parseArray(listJson, Category.class);
            return ret;
        }
        else {
            List<Category> ret = categoryMapper.selectOneCategory();
            redisTemplate.opsForValue().set("category:one", JSON.toJSONString(ret), 7, TimeUnit.DAYS);
            return ret;
        }
    }

    @Override
    public List<Category> findCategoryTree() {
        List<Category> allList = categoryMapper.findAll();

        List<Category> oneList = allList.stream()
                .filter(item -> item.getParentId().longValue() == 0)
                .collect(Collectors.toList());

        oneList.forEach(one ->{
            List<Category> twoList = allList.stream()
                    .filter(item -> item.getParentId().longValue() == one.getId())
                    .collect(Collectors.toList());
            one.setChildren(twoList);

            twoList.forEach(two ->{
                List<Category> threeList = allList.stream()
                        .filter(item -> item.getParentId().longValue() == two.getId())
                        .collect(Collectors.toList());
                two.setChildren(threeList);
            });
        });
        return oneList;
    }
}
