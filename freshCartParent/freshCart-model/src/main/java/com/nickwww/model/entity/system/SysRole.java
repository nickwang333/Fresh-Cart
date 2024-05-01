package com.nickwww.model.entity.system;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "System Role Entity")
public class SysRole extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Schema(description = "Role Name")
    private String roleName;

    @Schema(description = "Role Code")
    private String roleCode;

    @Schema(description = "Description")
    private String description;
}
