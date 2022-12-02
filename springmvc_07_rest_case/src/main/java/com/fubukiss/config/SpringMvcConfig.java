package com.fubukiss.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * FileName: SpringMvcConfig
 * Date: 2022/12/02
 * Time: 15:20
 * Author: river
 */

@Configuration
@EnableWebMvc
@ComponentScan({"com.fubukiss.controller", "com.fubukiss.config"})
public class SpringMvcConfig {
}
