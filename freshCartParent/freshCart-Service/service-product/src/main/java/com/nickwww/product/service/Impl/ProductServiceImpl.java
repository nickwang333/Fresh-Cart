package com.nickwww.product.service.Impl;

import com.nickwww.model.entity.product.ProductSku;
import com.nickwww.product.mapper.ProductSkuMapper;
import com.nickwww.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductSkuMapper productSkuMapper;

    @Override
    public List<ProductSku> selectProductSkuBySale() {
        return productSkuMapper.selectProductSkuBySale();
    }
}
