package com.nickwww.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "Assign Role DTO")
public class AssignRoleDto {

    @Schema(description = "User ID")
    private Long userId;

    @Schema(description = "Role ID List")
    private List<Long> roleIdList;
}
