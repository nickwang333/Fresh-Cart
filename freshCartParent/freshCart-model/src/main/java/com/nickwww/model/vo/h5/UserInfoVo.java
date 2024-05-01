package com.nickwww.model.vo.h5;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "User Info VO")
public class UserInfoVo {

   @Schema(description = "Nickname")
   private String nickName;

   @Schema(description = "Avatar")
   private String avatar;

}