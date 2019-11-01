package com.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "login";
    }

    /*public static void main(String[] args) {
        //启动springboot项目
        SpringApplication.run(HelloController.class,args);...ll333555666
        222
        333
        444
        555
    }*/
}
