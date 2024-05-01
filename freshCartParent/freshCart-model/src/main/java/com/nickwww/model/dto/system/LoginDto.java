package com.nickwww.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Login DTO")
public class LoginDto {

    @Schema(description = "Username")
    private String userName ;

    @Schema(description = "Password")
    private String password ;

    @Schema(description = "Captcha")
    private String captcha ;

    @Schema(description = "Code key")
    private String codeKey ;
}
