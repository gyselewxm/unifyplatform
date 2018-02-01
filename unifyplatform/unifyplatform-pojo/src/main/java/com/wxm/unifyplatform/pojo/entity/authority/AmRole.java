package com.wxm.unifyplatform.pojo.entity.authority;

import com.wxm.base.pojo.dataobject.BaseLogicDO;

/**
 * <b>Title:</b> 角色<br>
 * <b>Description:</b> 权限管理角色<br>
 * <b>Date:</b> 2018年2月1日 下午3:20:37 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
public class AmRole extends BaseLogicDO {
    private String roleName; // 角色名称
    private String roleCode; // 角色编码

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

}
