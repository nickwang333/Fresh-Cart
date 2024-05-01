package com.nickwww.model.entity.product;

import com.nickwww.model.entity.base.BaseEntity;
import lombok.Data;

@Data
public class ProductDetails extends BaseEntity {
	private Long productId;
	private String imageUrls;
}
