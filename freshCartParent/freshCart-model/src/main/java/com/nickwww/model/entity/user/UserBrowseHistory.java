package com.nickwww.model.entity.user;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "User Browse History Entity")
public class UserBrowseHistory extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Schema(description = "User ID")
    private Long userId;

    @Schema(description = "SKU ID")
    private Long skuId;
}
