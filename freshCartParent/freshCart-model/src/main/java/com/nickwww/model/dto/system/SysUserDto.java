package com.nickwww.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "System User DTO")
public class SysUserDto {

    @Schema(description = "Keyword")
    private String keyword ;

    @Schema(description = "Time begins")
    private String createTimeBegin ;

    @Schema(description = "Time ends")
    private String createTimeEnd;
}
