package com.nickwww.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "System Operation Log")
public class SysOperLogDto {

    @Schema(description = "Title")
    private String title;

    @Schema(description = "Operation Name")
    private String operName;

    @Schema(description = "Time begins")
    private String createTimeBegin;

    @Schema(description = "Time ends")
    private String createTimeEnd;
}
