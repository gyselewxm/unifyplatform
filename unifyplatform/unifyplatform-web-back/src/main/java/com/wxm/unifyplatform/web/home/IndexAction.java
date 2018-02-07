package com.wxm.unifyplatform.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>Title:</b> 首页管理 <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2018年2月7日 下午2:02:21 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
@Controller
@RequestMapping("home")
public class IndexAction {

    @GetMapping("index")
    public String index() {
        return "home/index";
    }

    @GetMapping("main")
    public String main() {
        return "home/main";
    }
}
