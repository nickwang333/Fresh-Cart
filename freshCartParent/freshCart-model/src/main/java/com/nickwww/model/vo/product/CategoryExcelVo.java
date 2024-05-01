package com.nickwww.model.vo.product;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryExcelVo {

	@ExcelProperty(value = "id" ,index = 0)
	private Long id;

	@ExcelProperty(value = "Name" ,index = 1)
	private String name;

	@ExcelProperty(value = "Image URL" ,index = 2)
	private String imageUrl ;

	@ExcelProperty(value = "Parent ID" ,index = 3)
	private Long parentId;

	@ExcelProperty(value = "Status" ,index = 4)
	private Integer status;

	@ExcelProperty(value = "Order Number" ,index = 5)
	private Integer orderNum;
}