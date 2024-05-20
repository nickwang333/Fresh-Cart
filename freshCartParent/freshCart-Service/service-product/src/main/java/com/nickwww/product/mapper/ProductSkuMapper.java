package com.nickwww.product.mapper;

import com.nickwww.model.entity.product.ProductSku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductSkuMapper {
    List<ProductSku> selectProductSkuBySale();
}
