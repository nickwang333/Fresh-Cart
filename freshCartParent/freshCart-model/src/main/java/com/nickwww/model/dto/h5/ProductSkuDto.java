package com.nickwww.model.dto.h5;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Product SKU DTO")
public class ProductSkuDto {

    @Schema(description = "Keyword")
    private String keyword;

    @Schema(description = "Brand ID")
    private Long brandId;

    @Schema(description = "Category One ID")
    private Long category1Id;

    @Schema(description = "Category Two ID")
    private Long category2Id;

    @Schema(description = "Category Three ID")
    private Long category3Id;

    @Schema(description = "Sorting (Comprehensive sorting: 1, Price ascending: 2, Price descending: 3)")
    private Integer order = 1;
}
