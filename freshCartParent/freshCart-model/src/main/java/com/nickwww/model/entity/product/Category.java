package com.nickwww.model.entity.product;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "Category Entity")
public class Category extends BaseEntity {

	@Schema(description = "Category Name")
	private String name;

	@Schema(description = "Image URL")
	private String imageUrl;

	@Schema(description = "Parent ID")
	private Long parentId;

	@Schema(description = "Category Status: Whether to Display [0 - Not Displayed, 1 - Displayed]")
	private Integer status;

	@Schema(description = "Order Number")
	private Integer orderNum;

	@Schema(description = "hasChildren")
	private Boolean hasChildren;

	@Schema(description = "Children")
	private List<Category> children;
}
