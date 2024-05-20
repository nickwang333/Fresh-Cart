package com.nickwww.product.controller;

import com.nickwww.model.entity.product.Category;
import com.nickwww.model.vo.common.Result;
import com.nickwww.model.vo.common.ResultCodeEnum;
import com.nickwww.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/findCategoryTree")
    public Result findCategoryTree(){
        List<Category> list = categoryService.findCategoryTree();
        return Result.build(list, ResultCodeEnum.SUCCESS);
    }

}
