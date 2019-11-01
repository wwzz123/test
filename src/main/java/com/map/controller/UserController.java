package com.map.controller;

import com.map.model.User;
import com.map.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("{id}")
    @ResponseBody
    /**
     * 通过id查询用户的信息
     */
    public User userInfo(@PathVariable() Integer id){
        User user = new User("map","123");
        user.setId(id);
        int i = 10/0;
        return user;
    }

    /*public static void main(String[] args) {
        //启动springboot项目
        SpringApplication.run(UserController.class,args);
    }*/

    @Autowired
    private IUserService userService;
    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){
        userService.register(username,password);
        return "success";
    }

    @RequestMapping("find")
    @ResponseBody
    public User find(String username){
        return userService.findByUsername(username);
    }
}
