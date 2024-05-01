package com.nickwww.model.dto.h5;

import com.nickwww.model.entity.order.OrderItem;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderInfoDto {

    private Long userAddressId;

    private BigDecimal freightFee;

    private String remark;

    private List<OrderItem> orderItemList;
}
