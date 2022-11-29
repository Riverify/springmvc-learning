package com.fubukiss.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * FileName: SpringConfig
 * Date: 2022/11/29
 * Time: 21:56
 * Author: river
 */

// 创建springmvc的配置文件，加载controller的对应的bean
@Configuration
@ComponentScan("com.fubukiss.controller")
public class SpringMvcConfig {
}
