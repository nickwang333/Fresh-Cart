package com.nickwww.model.entity.base;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Product Unit Entity")
public class ProductUnit extends BaseEntity {

	@Schema(description = "Name")
	private String name;
}
