package com.nickwww.product.service;

import com.github.pagehelper.PageInfo;
import com.nickwww.model.dto.h5.ProductSkuDto;
import com.nickwww.model.dto.product.SkuSaleDto;
import com.nickwww.model.entity.product.ProductSku;
import com.nickwww.model.vo.h5.ProductItemVo;

import java.util.List;

public interface ProductService {
    List<ProductSku> selectProductSkuBySale();

    PageInfo<ProductSku> findByPage(Integer page, Integer limit, ProductSkuDto productSkuDto);

    ProductItemVo item(String skuId);

    ProductSku getBySkuId(Long skuId);

    Boolean updateSkuSaleNum(List<SkuSaleDto> skuSaleDtoList);
}
