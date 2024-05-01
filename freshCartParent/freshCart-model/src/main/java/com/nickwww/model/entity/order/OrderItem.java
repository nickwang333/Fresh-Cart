package com.nickwww.model.entity.order;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "Order Item Entity")
public class OrderItem extends BaseEntity {

   private static final long serialVersionUID = 1L;

   @Schema(description = "Order Id")
   private Long orderId;

   @Schema(description = "SKU ID")
   private Long skuId;

   @Schema(description = "SKU Name")
   private String skuName;

   @Schema(description = "SKU Image")
   private String thumbImg;

   @Schema(description = "SKU Price")
   private BigDecimal skuPrice;

   @Schema(description = "SKU Number")
   private Integer skuNum;
}
