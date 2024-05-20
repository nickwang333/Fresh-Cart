package com.nickwww.product.service.Impl;

import com.nickwww.model.entity.product.Category;
import com.nickwww.product.mapper.CategoryMapper;
import com.nickwww.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> selectOneCategory() {
        return categoryMapper.selectOneCategory();
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
