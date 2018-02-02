package com.wxm.unifyplatform.service.authority.impl;

import org.springframework.stereotype.Service;

import com.wxm.service.base.abs.ACRUDService;
import com.wxm.unifyplatform.pojo.bo.authority.AmUserPasswordBO;
import com.wxm.unifyplatform.pojo.entity.authority.AmUserPassword;
import com.wxm.unifyplatform.service.authority.IAmUserPasswordService;

/**
 * <b>Title:</b> 用户密码 <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2018年2月1日 下午6:37:46 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
@Service
public class AmUserPasswordServiceImpl extends ACRUDService<AmUserPassword, AmUserPasswordBO> implements
        IAmUserPasswordService {

}
