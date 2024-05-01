package com.nickwww.model.vo.h5;

import com.alibaba.fastjson.JSONArray;
import com.nickwww.model.entity.product.Product;
import com.nickwww.model.entity.product.ProductSku;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Schema(description = "Product Item VO")
public class ProductItemVo {

   @Schema(description = "Product SKU Information")
   private ProductSku productSku;

   @Schema(description = "Product")
   private Product product;

   @Schema(description = "Slider URL List")
   private List<String> sliderUrlList;

   @Schema(description = "Details Image URL List")
   private List<String> detailsImageUrlList;

   @Schema(description = "Spec Value List")
   private JSONArray specValueList;

   @Schema(description = "SKU Spec Value Map")
   private Map<String,Object> skuSpecValueMap;
}
