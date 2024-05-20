package com.nickwww.product.controller;

import com.nickwww.model.entity.product.Category;
import com.nickwww.model.entity.product.ProductSku;
import com.nickwww.model.vo.common.Result;
import com.nickwww.model.vo.common.ResultCodeEnum;
import com.nickwww.model.vo.h5.IndexVo;
import com.nickwww.product.service.CategoryService;
import com.nickwww.product.service.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Tag(name = "Index page")
@RestController
@RequestMapping(value="/api/product/index")
public class IndexController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @GetMapping
    public Result index(){
        List<Category> categoryList = categoryService.selectOneCategory();

        List<ProductSku> productSkuList = productService.selectProductSkuBySale();

        IndexVo indexVo = new IndexVo();
        indexVo.setCategoryList(categoryList);
        indexVo.setProductSkuList(productSkuList);

        return Result.build(indexVo, ResultCodeEnum.SUCCESS);
    }
}
