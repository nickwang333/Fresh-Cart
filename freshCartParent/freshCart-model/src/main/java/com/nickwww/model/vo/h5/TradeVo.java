package com.nickwww.model.vo.h5;

import com.nickwww.model.entity.order.OrderItem;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Schema(description = "Trade VO Entity")
public class TradeVo {

    @Schema(description = "Total Amount")
    private BigDecimal totalAmount;

    @Schema(description = "Ordered Item List")
    private List<OrderItem> orderItemList;
}
