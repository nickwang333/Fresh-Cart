package com.nickwww.model.vo.h5;

import com.nickwww.model.entity.product.Category;
import com.nickwww.model.entity.product.ProductSku;
import lombok.Data;

import java.util.List;

@Data
public class IndexVo {
    private List<Category> categoryList;
    private List<ProductSku> productSkuList;
}