package com.nickwww.model.dto.product;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Category Brand DTO")
public class CategoryBrandDto {

	@Schema(description = "Brand ID")
	private Long brandId;

	@Schema(description = "Category ID")
	private Long categoryId;
}
