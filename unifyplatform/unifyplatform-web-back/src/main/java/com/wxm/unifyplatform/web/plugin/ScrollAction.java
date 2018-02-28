package com.wxm.unifyplatform.web.plugin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>Title:</b> 滚动条管理 <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2018年2月27日 下午10:02:30 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
@Controller
@RequestMapping("scroll")
public class ScrollAction {

    @GetMapping
    public String scroll() {
        return "plugin/scroll/index";
    }
}
