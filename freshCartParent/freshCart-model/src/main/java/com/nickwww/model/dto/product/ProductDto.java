package com.nickwww.model.dto.product;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Product DTO")
public class ProductDto extends BaseEntity {

    @Schema(description = "Brand ID")
    private Long brandId;

    @Schema(description = "Category One ID")
    private Long category1Id;

    @Schema(description = "Category Two ID")
    private Long category2Id;

    @Schema(description = "Category Three ID")
    private Long category3Id;
}
