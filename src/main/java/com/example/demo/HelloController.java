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
    
     @RequestMapping("/test2")
    public String test2(){
        return "你好!master22";
    }
    
    @RequestMapping("/test3")
    public String test3(){
        return "你好!master33";
    }
    
}
