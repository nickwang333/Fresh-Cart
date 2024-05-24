package com.nickwww.product.mapper;

import com.nickwww.model.dto.h5.ProductSkuDto;
import com.nickwww.model.entity.product.ProductSku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductSkuMapper {
    List<ProductSku> selectProductSkuBySale();

    List<ProductSku> findByPage(ProductSkuDto productSkuDto);

    ProductSku getById(Long valueOf);

    List<ProductSku> findByProductId(Long productId);
}
