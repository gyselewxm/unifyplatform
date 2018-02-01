package com.wxm.unifyplatform.pojo.entity.authority;

import com.wxm.base.pojo.dataobject.BaseDO;

/**
 * <b>Title:</b> 菜单 <br>
 * <b>Description:</b> 权限管理菜单 <br>
 * <b>Date:</b> 2018年2月1日 下午3:28:40 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
public class AmMenu extends BaseDO {
    private String parentId; // 父ID
    private String menuName; // 菜单名称
    private String menuCode; // 菜单编码
    private Integer level; // 级别
    private String url; // 链接地址
    private String remark; // 备注

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
