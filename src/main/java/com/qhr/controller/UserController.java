package com.qhr.controller;

import com.qhr.entity.User;
import com.qhr.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/addUser")
    @ResponseBody
    public int addUser(User user){
        user.setUserName("张三丰");
        user.setUserAge("100");
        return userService.addUser(user);
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public int deleteUser(User user){
        user.setUserId(2);
        return userService.deleteUser(user);
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public int updateUser(User user){
        user.setUserAge("13");
        user.setUserName("查明");
        user.setUserId(3);
        return userService.updateUser(user);
    }

    @RequestMapping("/findUser")
    @ResponseBody
    public User findUser(User user){
        user.setUserId(4);
        return userService.findUser(user);
    }

    @RequestMapping("/selectUsers")
    @ResponseBody
    public List<User> selectUsers(){
        return userService.selectUsers();
    }
}
