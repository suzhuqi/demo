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
    
     @RequestMapping("/test4")
    public String test4(){
        return "你好!master44";
    }

    @RequestMapping("/branch")
    public String branch(){
        return "你好!suzhuqi--分支";
    }

    @RequestMapping("/tsetBranch")
    public String tsetBranch(){
        return "你好!tsetBranch--分支";
    }

    @RequestMapping("/tsetBranch333")
    public String tsetBranch2(){
        return "你好!tsetBranch33334--分支";
    }

    @RequestMapping("/tsetBranch444")
    public String tsetBranch3(){
         return "你好!tsetBranch4444--分支";
    }

    @RequestMapping("/tsetBranch555")
    public String tsetBranch5(){
        return "你好!tsetBranch5555--分支";
    }

}
