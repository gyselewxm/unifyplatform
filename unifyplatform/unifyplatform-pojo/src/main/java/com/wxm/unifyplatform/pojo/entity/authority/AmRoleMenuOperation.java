package com.wxm.unifyplatform.pojo.entity.authority;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * <b>Title:</b> 角色菜单操作<br>
 * <b>Description:</b> 权限管理角色菜单操作<br>
 * <b>Date:</b> 2018年2月1日 下午3:25:27 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
public class AmRoleMenuOperation {
    @Id
    private String roleId; // 角色ID
    @Id
    private String menuOperationId; // 菜单操作ID
    @Column(name = "is_deleted")
    private boolean deleted; // 是否删除

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMenuOperationId() {
        return menuOperationId;
    }

    public void setMenuOperationId(String menuOperationId) {
        this.menuOperationId = menuOperationId;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

}
