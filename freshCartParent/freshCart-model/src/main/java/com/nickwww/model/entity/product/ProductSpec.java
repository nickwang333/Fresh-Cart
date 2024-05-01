package com.nickwww.model.entity.product;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Product Spec Entity")
public class ProductSpec extends BaseEntity {

	@Schema(description = "SpecName")
	private String specName;

	@Schema(description = "SpecName")
	private String specValue;
}
