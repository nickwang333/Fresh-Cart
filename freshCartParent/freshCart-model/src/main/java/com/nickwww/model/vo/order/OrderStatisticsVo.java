package com.nickwww.model.vo.order;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Schema(description = "Order Statistic VO")
public class OrderStatisticsVo {

    @Schema(description = "List of Date")
    private List<String> dateList ;

    @Schema(description = "List of Amount")
    private List<BigDecimal> amountList ;
}
