package com.nickwww.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "System Role DTO")
public class SysRoleDto {

    @Schema(description = "Role Name")
    private String roleName;
}
