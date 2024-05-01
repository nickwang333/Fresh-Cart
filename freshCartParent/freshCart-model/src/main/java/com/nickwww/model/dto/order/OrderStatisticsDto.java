package com.nickwww.model.dto.order;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Order Statistics DTO")
public class OrderStatisticsDto {

    @Schema(description = "Create Time Begin")
    private String createTimeBegin;

    @Schema(description = "Create Time End")
    private String createTimeEnd;

}
