package com.nickwww.model.entity.system;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "System User Entity")
public class SysUser extends BaseEntity {

	@Schema(description = "Username")
	private String userName;

	@Schema(description = "Password")
	private String password;

	@Schema(description = "Name")
	private String name;

	@Schema(description = "Phone Number")
	private String phone;

	@Schema(description = "Avatar")
	private String avatar;

	@Schema(description = "Description")
	private String description;

	@Schema(description = "Status (1: Normal, 0: Disabled)")
	private Integer status;
}
