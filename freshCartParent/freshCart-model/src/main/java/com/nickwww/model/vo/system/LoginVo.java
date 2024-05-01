package com.nickwww.model.vo.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Login VO")
public class LoginVo {

    @Schema(description = "Token")
    private String token ;

    @Schema(description = "Refresh Token (Can be NULL)")
    private String refresh_token ;

}
