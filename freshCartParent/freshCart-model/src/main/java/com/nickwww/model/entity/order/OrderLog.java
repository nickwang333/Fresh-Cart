package com.nickwww.model.entity.order;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Order Log Entity")
public class OrderLog extends BaseEntity {

   private static final long serialVersionUID = 1L;

   @Schema(description = "Order ID")
   private Long orderId;

   @Schema(description = "Operator: User; System; Administrator")
   private String operateUser;

   @Schema(description = "Order Status")
   private Integer processStatus;

   @Schema(description = "Note")
   private String note;
}
