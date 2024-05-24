package com.nickwww.product.service.Impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nickwww.model.dto.h5.ProductSkuDto;
import com.nickwww.model.dto.product.SkuSaleDto;
import com.nickwww.model.entity.product.Product;
import com.nickwww.model.entity.product.ProductDetails;
import com.nickwww.model.entity.product.ProductSku;
import com.nickwww.model.vo.h5.ProductItemVo;
import com.nickwww.product.mapper.ProductDetailsMapper;
import com.nickwww.product.mapper.ProductMapper;
import com.nickwww.product.mapper.ProductSkuMapper;
import com.nickwww.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductSkuMapper productSkuMapper;

    @Autowired
    private ProductDetailsMapper productDetailsMapper;

    @Autowired
    private  ProductMapper productMapper;


    @Override
    public List<ProductSku> selectProductSkuBySale() {
        return productSkuMapper.selectProductSkuBySale();
    }

    @Override
    public PageInfo<ProductSku> findByPage(Integer page, Integer limit, ProductSkuDto productSkuDto) {
        PageHelper.startPage(page, limit);
        List<ProductSku> productSkuList = productSkuMapper.findByPage(productSkuDto);
        return new PageInfo<>(productSkuList);
    }

    @Override
    public ProductItemVo item(String skuId) {
        ProductItemVo productItemVo = new ProductItemVo();

        ProductSku productSku = productSkuMapper.getById(Long.valueOf(skuId));

        Product product = productMapper.getById(productSku.getProductId());

         ProductDetails productDetails = productDetailsMapper.getByProductId(productSku.getProductId());

        Map<String,Object> skuSpecValueMap = new HashMap<>();

        List<ProductSku> productSkuList = productSkuMapper.findByProductId(productSku.getProductId());
        productSkuList.forEach(item -> {
            skuSpecValueMap.put(item.getSkuSpec(), item.getId());
        });

        productItemVo.setProductSku(productSku);
        productItemVo.setProduct(product);
        productItemVo.setSkuSpecValueMap(skuSpecValueMap);

        productItemVo.setDetailsImageUrlList(Arrays.asList(productDetails.getImageUrls().split(",")));

        productItemVo.setSliderUrlList(Arrays.asList(product.getSliderUrls().split(",")));
        productItemVo.setSpecValueList(JSON.parseArray(product.getSpecValue()));

        return productItemVo;
    }

    @Override
    public ProductSku getBySkuId(Long skuId) {
        return null;
    }

    @Override
    public Boolean updateSkuSaleNum(List<SkuSaleDto> skuSaleDtoList) {
        return null;
    }
}
