package com.ccc.demoboot.controller;

import com.ccc.demoboot.common.MyProperties1;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

//@RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
@Controller
public class HelloWorldController2 {

    @Resource(name = "myProperties1")
    MyProperties1 myProperties1;

    @RequestMapping("/aa")
    public String aa(HttpServletRequest request) {
        System.out.println("aaa好aaa");
        request.setAttribute("a","a啊aaabb");
        return "aa";
    }


}
