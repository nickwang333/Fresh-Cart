package com.nickwww.model.entity.product;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Category Brand Entity")
public class CategoryBrand extends BaseEntity {

	@Schema(description = "Brand ID")
	private Long brandId;

	@Schema(description = "Category ID")
	private Long categoryId;

	@Schema(description = "Category Name")
	private String categoryName;

	@Schema(description = "Brand Name")
	private String brandName;

	@Schema(description = "Logo")
	private String logo;
}
