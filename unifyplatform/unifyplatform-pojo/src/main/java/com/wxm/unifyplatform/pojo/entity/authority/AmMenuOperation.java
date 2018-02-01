package com.wxm.unifyplatform.pojo.entity.authority;

/**
 * <b>Title:</b> 菜单操作 <br>
 * <b>Description:</b> 权限管理菜单操作 <br>
 * <b>Date:</b> 2018年2月1日 下午3:32:02 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
public class AmMenuOperation {
    private String menuId; // 菜单ID
    private String operationId; // 操作ID
    private boolean deleted; // 是否删除

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

}
