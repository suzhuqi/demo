package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "你好，SptingBootDemo!";
    }

    @RequestMapping("/test")
    public String test(){
        return "你好!master";
    }

    @RequestMapping("/branch")
    public String branch(){
        return "你好!suzhuqi--分支";
    }


}
