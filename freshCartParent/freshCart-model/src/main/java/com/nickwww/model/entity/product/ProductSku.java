package com.nickwww.model.entity.product;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Schema(description = "Product SKU")
public class ProductSku extends BaseEntity {

	@Schema(description = "SKU Code")
	private String skuCode;

	@Schema(description = "SKU Name")
	private String skuName;

	@Schema(description = "Product Id")
	private Long productId;

	@Schema(description = "Thumb Image")
	private String thumbImg;

	@Schema(description = "Sales Price")
	private BigDecimal salePrice;

	@Schema(description = "Market Price")
	private BigDecimal marketPrice;

	@Schema(description = "Cost Price")
	private BigDecimal costPrice;

	@Schema(description = "Stock Number")
	private Integer stockNum;

	@Schema(description = "Sales Number")
	private Integer saleNum;

	@Schema(description = "SKU Spec")
	private String skuSpec;

	@Schema(description = "Weight")
	private String weight;

	@Schema(description = "Volume")
	private String volume;

	@Schema(description = "Online Status: 0 - Initial, 1 - On Shelf, -1 - Voluntarily Withdrawn")
	private Integer status;
}
