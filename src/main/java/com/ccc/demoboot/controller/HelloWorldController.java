package com.ccc.demoboot.controller;

import com.ccc.demoboot.common.MyProperties1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
//@RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
@RestController
public class HelloWorldController {

    @Resource(name = "myProperties1")
    MyProperties1 myProperties1;

    @RequestMapping("/hello")
    public String index() {
        System.out.println("aaa好");
        return "Hello World";
    }

    @RequestMapping("/hello2")
    public List index2() {
        System.out.println("list");
        List list=new ArrayList();
        list.add("你");
        list.add("aa");
        list.add(""+myProperties1.getAge()+"=="+myProperties1.getName()+"f方");
        return list;
    }
}
