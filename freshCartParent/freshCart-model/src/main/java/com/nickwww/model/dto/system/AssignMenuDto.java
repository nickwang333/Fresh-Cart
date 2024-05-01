package com.nickwww.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Schema(description = "Assign Menu DTO")
public class AssignMenuDto {

    @Schema(description = "Role ID")
    private Long roleId;

    @Schema(description = "List Contains selected menu IDs")
    private List<Map<String , Number>> menuIdList;
    // Collection of selected menu IDs; Map's key represents the menu's ID, the value indicates if it is half-open; 0 no, 1 yes.
    // In List<Map<String, Number>>
    // First column key: id   value: menu ID value
    // First column key: isHalf   value: 0 or 1
    // If all menus are selected, it is 0 (fully open); otherwise, it is 1 (half-open).
}
