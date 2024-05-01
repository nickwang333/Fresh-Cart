package com.nickwww.model.dto.h5;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "User Login DOT")
public class UserLoginDto {

    @Schema(description = "Username")
    private String username ;

    @Schema(description = "Password")
    private String password ;
}