package com.nickwww.model.vo.product;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Schema(description = "Product SKU VO")
public class ProductSkuVO {

	@Schema(description = "SKU ID")
	private Long skuID;

	@Schema(description = "skuName")
	private String skuName;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Schema(description = "Time of Creation")
	private Date createTime;

	@Schema(description = "Thumb Image")
	private String thumbImg;

	@Schema(description = "Sales Price")
	private BigDecimal salePrice;
}
