package com.nickwww.model.entity.pay;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Schema(description = "Payment Info Entity")
public class PaymentInfo extends BaseEntity {

   private static final long serialVersionUID = 1L;

   @Schema(description = "User ID")
   private Long userId;

   @Schema(description = "Order Number")
   private String orderNo;

   @Schema(description = "Payment Type")
   private Integer payType;

   @Schema(description = "Trade Number")
   private String outTradeNo;

   @Schema(description = "Amount")
   private BigDecimal amount;

   @Schema(description = "Content")
   private String content;

   @Schema(description = "Payment Status: 0 - Unpaid, 1 - Paid")
   private Integer paymentStatus;

   @Schema(description = "Callback Time")
   private Date callbackTime;

   @Schema(description = "Callback Content")
   private String callbackContent;
}
