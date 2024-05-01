package com.nickwww.model.entity.product;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "Product Entity")
public class Product extends BaseEntity {

	@Schema(description = "Product Name")
	private String name;

	@Schema(description = "Brand Id")
	private Long brandId;

	@Schema(description = "Category one Id")
	private Long category1Id;

	@Schema(description = "Category two Id")
	private Long category2Id;

	@Schema(description = "Category three Id")
	private Long category3Id;

	@Schema(description = "Unit Name")
	private String unitName;

	@Schema(description = "Slider Urls")
	private String sliderUrls;

	@Schema(description = "Spec Value")
	private String specValue;

	@Schema(description = "Online Status: 0 - Initial Value, 1 - Listed, -1 - Self-Removed")
	private Integer status;

	@Schema(description = "Audit Status")
	private Integer auditStatus;

	@Schema(description = "Audit Message")
	private String auditMessage;

	@Schema(description = "Brand Name")
	private String brandName;

	@Schema(description = "Category One Name")
	private String category1Name;

	@Schema(description = "Category Two Name")
	private String category2Name;

	@Schema(description = "Category Three Name")
	private String category3Name;

	@Schema(description = "Product SKU List")
	private List<ProductSku> productSkuList;

	@Schema(description = "Detailed Image Urls")
	private String detailsImageUrls;
}
