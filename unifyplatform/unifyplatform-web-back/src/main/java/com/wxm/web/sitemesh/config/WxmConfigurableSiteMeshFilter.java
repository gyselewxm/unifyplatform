package com.wxm.web.sitemesh.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

import com.wxm.web.sitemesh.content.tagrules.HtmlTagRuleBundle;

/**
 * <b>标题: </b> 自定义SiteMesh页面布局过滤器 <br/>
 * <b>描述: </b> <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2017年10月15日 下午6:23:44 <br/>
 * <b>版本: </b>1.0
 */
public class WxmConfigurableSiteMeshFilter extends ConfigurableSiteMeshFilter {

    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addExcludedPath("/css/*")
        // 忽略js
                .addExcludedPath("/js/*")
                // 忽略fonts
                .addExcludedPath("/fonts/*")
                // 忽略img
                .addExcludedPath("/img/*")
                // 忽略images
                .addExcludedPath("/images/*")
                // 忽略errors
                .addExcludedPath("/errors/*")
                // 忽略base
                .addExcludedPath("/base/*")
                // 添加自定义Html标签
                .addTagRuleBundle(new HtmlTagRuleBundle())
                // 默认装饰器，当下面的路径都不匹配时，启用该装饰器进行装饰
                .addDecoratorPath("/*", "/sitemesh/tpl-default");
    }

}
