package com.wxm.unifyplatform.pojo.entity.authority;

import com.wxm.base.pojo.dataobject.BaseUUIDDO;

/**
 * <b>Title:</b> 用户密码 <br>
 * <b>Description:</b> 权限管理用户密码 <br>
 * <b>Date:</b> 2018年2月1日 下午3:16:26 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
public class AmUserPassword extends BaseUUIDDO {
    private String password; // 密码

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
