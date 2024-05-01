package com.nickwww.model.entity.system;

import com.nickwww.model.entity.base.BaseEntity;
import lombok.Data;

@Data
public class SysRoleUser extends BaseEntity {

    private Long roleId;
    private Long userId;

}
