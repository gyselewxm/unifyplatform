package com.wxm.unifyplatform.pojo.entity.authority;

import com.wxm.base.pojo.dataobject.BaseLogicDO;

/**
 * <b>Title:</b> 操作 <br>
 * <b>Description:</b> 权限管理操作 <br>
 * <b>Date:</b> 2018年2月1日 下午3:34:30 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
public class AmOperation extends BaseLogicDO {
    private String operationName; // 操作名称
    private String operationCode; // 操作代码

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

}
