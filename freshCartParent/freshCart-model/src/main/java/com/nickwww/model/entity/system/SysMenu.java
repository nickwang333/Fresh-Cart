package com.nickwww.model.entity.system;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Schema(description = "System Menu")
@Data
public class SysMenu extends BaseEntity {

	@Schema(description = "Parent ID")
	private Long parentId;

	@Schema(description = "Title")
	private String title;

	@Schema(description = "Component")
	private String component;

	@Schema(description = "Sort Value")
	private Integer sortValue;

	@Schema(description = "Status (0: Forbidden, 1: Normal)")
	private Integer status;

	@Schema(description = "Children")
	private List<SysMenu> children;
}
