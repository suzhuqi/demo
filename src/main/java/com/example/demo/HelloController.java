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


    @RequestMapping("/branch")
    public String branch(){
        return "你好!suzhuqi--分支";
    }

    @RequestMapping("/tsetBranch")
    public String tsetBranch(){
        return "你好!tsetBranch--分支";
    }

    @RequestMapping("/tsetBranch2")
    public String tsetBranch2(){
        return "你好!tsetBranch2--分支";
    }
}
