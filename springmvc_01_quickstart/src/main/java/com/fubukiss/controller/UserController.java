package com.fubukiss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * FileName: UserController
 * Date: 2022/11/29
 * Time: 21:50
 * Author: river
 */

// 定义controller 使用@Controller定义bean
@Controller
public class UserController {

    @RequestMapping("/save")    // 设置当前操作的访问路径
    @ResponseBody                 // 设置当前操作的返回值类型
    public String save() {
        System.out.println("user save ...");
        return "{'module':'springmvc'}";
    }
}
