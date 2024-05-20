package com.nickwww.product.service;

import com.nickwww.model.entity.product.Category;

import java.util.List;

public interface CategoryService  {
    List<Category> selectOneCategory();

    List<Category> findCategoryTree();
}
