package com.nickwww.model.entity.system;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "System Operation Log")
public class SysOperLog extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Schema(description = "Title")
	private String title;

	@Schema(description = "Method")
	private String method;

	@Schema(description = "Request Method")
	private String requestMethod;

	@Schema(description = "Business Type (0 Other, 1 Add, 2 Modify, 3 Delete)")
	private Integer businessType;

	@Schema(description = "Operation Type (0 Other, 1 Backend User, 2 Mobile User)")
	private String operatorType;

	@Schema(description = "Operator Name")
	private String operName;

	@Schema(description = "Operation URL")
	private String operUrl;

	@Schema(description = "Operation IP")
	private String operIp;

	@Schema(description = "Operation Parameter")
	private String operParam;

	@Schema(description = "返回参数")
	private String jsonResult;

	@Schema(description = "Operation Status (0 Normal, 1 Abnormal)")
	private Integer status;

	@Schema(description = "Error Message")
	private String errorMsg;
}
