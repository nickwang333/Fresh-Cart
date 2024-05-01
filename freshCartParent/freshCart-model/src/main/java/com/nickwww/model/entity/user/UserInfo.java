package com.nickwww.model.entity.user;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
@Schema(description = "User Info Entity")
public class UserInfo extends BaseEntity {

   private static final long serialVersionUID = 1L;

   @Schema(description = "Username")
   private String username;

   @Schema(description = "Password")
   private String password;

   @Schema(description = "Nickname")
   private String nickName;

   @Schema(description = "Avatar")
   private String avatar;

   @Schema(description = "Sex")
   private Integer sex;

   @Schema(description = "Phone Number")
   private String phone;

   @Schema(description = "Memo")
   private String memo;

   @Schema(description = "Open ID")
   private String openId;

   @Schema(description = "UnionId")
   private String unionId;

   @Schema(description = "Last Login Ip")
   private String lastLoginIp;

   @Schema(description = "Last Login Time")
   private Date lastLoginTime;

   @Schema(description = "Status: 1 is normal, 0 is forbidden")
   private Integer status;
}
