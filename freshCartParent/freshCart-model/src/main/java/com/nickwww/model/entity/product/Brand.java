package com.nickwww.model.entity.product;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Brand Entity")
public class Brand extends BaseEntity {

	@Schema(description = "Brand Name")
	private String name;

	@Schema(description = "Brand Logo")
	private String logo;
}
