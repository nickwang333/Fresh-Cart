package com.nickwww.model.entity.user;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "User Address Entity")
public class UserAddress extends BaseEntity {

   private static final long serialVersionUID = 1L;

   @Schema(description = "User ID")
   private Long userId;

   @Schema(description = "Name")
   private String name;

   @Schema(description = "Phone Number")
   private String phone;

   @Schema(description = "Tag Name")
   private String tagName;

   @Schema(description = "State Code")
   private String stateCode;

   @Schema(description = "City Code")
   private String cityCode;

   @Schema(description = "District Code")
   private String districtCode;

   @Schema(description = "Address")
   private String address;

   @Schema(description = "Full Address")
   private String fullAddress;

   @Schema(description = "Is Default Address (0: No, 1: Yes)")
   private Integer isDefault;
}
