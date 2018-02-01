package com.wxm.unifyplatform.pojo.entity.authority;

import java.util.Date;

import com.wxm.base.pojo.dataobject.BaseDO;

/**
 * <b>Title:</b> 用户 <br>
 * <b>Description:</b> 权限管理用户<br>
 * <b>Date:</b> 2018年2月1日 下午3:11:39 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
public class AmUser extends BaseDO {
    private String username; // 用户名
    private String cnName; // 中文名
    private String enName; // 英文名
    private Integer sex; // 性别[0:未知][1:男][2:女]
    private String mobilePhone; // 手机号码
    private String email; // 电子邮件
    private Date birthday; // 出生年月

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
