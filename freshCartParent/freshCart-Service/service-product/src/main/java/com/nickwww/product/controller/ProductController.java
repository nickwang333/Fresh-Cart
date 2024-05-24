package com.nickwww.product.controller;

import com.github.pagehelper.PageInfo;
import com.nickwww.model.dto.h5.ProductSkuDto;
import com.nickwww.model.dto.product.SkuSaleDto;
import com.nickwww.model.entity.product.ProductSku;
import com.nickwww.model.entity.user.UserBrowseHistory;
import com.nickwww.model.vo.common.Result;
import com.nickwww.model.vo.common.ResultCodeEnum;
import com.nickwww.model.vo.h5.ProductItemVo;
import com.nickwww.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Product List")
@RestController
@RequestMapping(value="/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Operation(summary = "Search by page")
    @GetMapping(value = "/{page}/{limit}")
    public Result<PageInfo<ProductSku>> findByPage(@Parameter(name = "page", description = "page number", required = true) @PathVariable Integer page,
                                                   @Parameter(name = "limit", description = "page limit", required = true) @PathVariable Integer limit,
                                                   @Parameter(name = "productSkuDto", description = "search entity", required = false) ProductSkuDto productSkuDto) {
        PageInfo<ProductSku> pageInfo = productService.findByPage(page, limit, productSkuDto);
        return Result.build(pageInfo , ResultCodeEnum.SUCCESS) ;
    }

    @Operation(summary = "Item info")
    @GetMapping("item/{skuId}")
    public Result<ProductItemVo> item(@PathVariable String skuId) {
        ProductItemVo productItemVo;
        productItemVo = productService.item(skuId);

        return Result.build(productItemVo , ResultCodeEnum.SUCCESS);
    }

    @Operation(summary = "Get SKU by id")
    @GetMapping("getBySkuId/{skuId}")
    public ProductSku getBySkuId(@Parameter(name = "skuId", description = "SKU ID", required = true) @PathVariable Long skuId) {
        ProductSku productSku = productService.getBySkuId(skuId);
        return productSku;
    }

    @Operation(summary = "Update SKU Sale number")
    @PostMapping("updateSkuSaleNum")
    public Boolean updateSkuSaleNum(@RequestBody List<SkuSaleDto> skuSaleDtoList) {
        return productService.updateSkuSaleNum(skuSaleDtoList);
    }
}
