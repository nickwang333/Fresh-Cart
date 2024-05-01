package com.nickwww.model.dto.h5;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description="User Register DTO")
public class UserRegisterDto {

    @Schema(description = "Username")
    private String username;

    @Schema(description = "Password")
    private String password;

    @Schema(description = "Nickname")
    private String nickName;

    @Schema(description = "Verification Code")
    private String code;
}
