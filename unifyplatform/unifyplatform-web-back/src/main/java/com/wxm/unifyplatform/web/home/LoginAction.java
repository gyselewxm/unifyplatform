package com.wxm.unifyplatform.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>Title:</b> 登录管理 <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2018年2月7日 下午2:46:10 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
@Controller
@RequestMapping("login")
public class LoginAction {

    @GetMapping
    public String login() {
        return "home/login";
    }
}
