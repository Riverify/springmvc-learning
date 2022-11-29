package com.fubukiss.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;


/**
 * FileName: ServletContainersInitConfig
 * Date: 2022/11/29
 * Time: 21:58
 * Author: river
 */
//定义一个servlet容器的启动配置类，在里面加载spring的配置

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    // 加载springMVC容器配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //加载指定配置类
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    // 设置哪些请求归属springMVC处理(Mapping)
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // 加载spring容器配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
