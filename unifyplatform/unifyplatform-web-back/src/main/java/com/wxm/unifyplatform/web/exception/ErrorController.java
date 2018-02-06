package com.wxm.unifyplatform.web.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>Title:</b> 异常管理 <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2018年2月5日 下午3:32:45 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
@Controller
@RequestMapping("error")
public class ErrorController {

    @GetMapping("500")
    public String error500() {
        return "/exception/error/500";
    }

    @GetMapping("404")
    public String error404() {
        return "/exception/error/404";
    }
}
