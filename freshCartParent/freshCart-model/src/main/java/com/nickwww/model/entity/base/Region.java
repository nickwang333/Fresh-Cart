package com.nickwww.model.entity.base;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Region Entity")
public class Region extends BaseEntity {

	@Schema(description = "code")
	private String code;

	@Schema(description = "parent code")
	private Long parentCode;

	@Schema(description = "parent name")
	private String name;

	@Schema(description = "level")
	private Integer level;
}
