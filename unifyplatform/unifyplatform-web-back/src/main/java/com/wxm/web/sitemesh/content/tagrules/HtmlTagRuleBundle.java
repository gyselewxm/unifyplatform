package com.wxm.web.sitemesh.content.tagrules;

import org.sitemesh.SiteMeshContext;
import org.sitemesh.content.ContentProperty;
import org.sitemesh.content.tagrules.TagRuleBundle;
import org.sitemesh.content.tagrules.html.ExportTagToContentRule;
import org.sitemesh.tagprocessor.State;

/**
 * <b>标题: </b> SiteMesh自定义Html标签 <br/>
 * <b>描述: </b> <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2017年10月15日 下午7:47:15 <br/>
 * <b>版本: </b>1.0
 */
public class HtmlTagRuleBundle implements TagRuleBundle {

    @Override
    public void cleanUp(State paramState, ContentProperty paramContentProperty, SiteMeshContext paramSiteMeshContext) {
    }

    @Override
    public void install(State paramState, ContentProperty paramContentProperty, SiteMeshContext paramSiteMeshContext) {
        // 页面标题
        paramState.addRule("sm-title", new ExportTagToContentRule(paramSiteMeshContext, paramContentProperty.getChild("sm-title"), false));
        // 页面body标签的class属性
        paramState.addRule("sm-body-cls", new ExportTagToContentRule(paramSiteMeshContext, paramContentProperty.getChild("sm-body-cls"), false));
        // 页面脚本
        paramState.addRule("sm-script", new ExportTagToContentRule(paramSiteMeshContext, paramContentProperty.getChild("sm-script"), false));
    }

}
