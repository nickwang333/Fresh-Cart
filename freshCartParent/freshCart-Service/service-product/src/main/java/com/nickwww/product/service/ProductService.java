package com.nickwww.product.service;

import com.nickwww.model.entity.product.ProductSku;

import java.util.List;

public interface ProductService {
    List<ProductSku> selectProductSkuBySale();
}
