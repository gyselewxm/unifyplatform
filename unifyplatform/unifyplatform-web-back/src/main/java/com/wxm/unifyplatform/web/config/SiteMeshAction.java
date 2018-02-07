package com.wxm.unifyplatform.web.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>Title:</b> SiteMesh管理 <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2018年2月6日 下午3:31:09 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
@Controller
@RequestMapping("sitemesh")
public class SiteMeshAction {

    @GetMapping("tpl-default")
    public String tplDefault() {
        return "tpl-default";
    }
}
