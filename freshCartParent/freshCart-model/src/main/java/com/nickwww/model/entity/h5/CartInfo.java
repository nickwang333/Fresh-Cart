package com.nickwww.model.entity.h5;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "Cart Entity")
public class CartInfo extends BaseEntity {
   
   private static final long serialVersionUID = 1L;

   @Schema(description = "User ID")
   private Long userId;

   @Schema(description = "SKU ID")
   private Long skuId;

   @Schema(description = "price when added to the cart")
   private BigDecimal cartPrice;

   @Schema(description = "Quantity")
   private Integer skuNum;

   @Schema(description = "Image URL")
   private String imgUrl;

   @Schema(description = "Full SKU name")
   private String skuName;

   @Schema(description = "isChecked")
   private Integer isChecked;
    
}