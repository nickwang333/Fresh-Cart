package com.nickwww.model.vo.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "System Menu VO")
public class SysMenuVo {

    @Schema(description = "Title of system menu")
    private String title;

    @Schema(description = "Name of system menu")
    private String name;

    @Schema(description = "Children of system menu")
    private List<SysMenuVo> children;
}
