package com.nickwww.model.vo.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Validate Code VO")
public class ValidateCodeVo {

    @Schema(description = "Code key")
    private String codeKey;

    @Schema(description = "Code Value")
    private String codeValue;
}
