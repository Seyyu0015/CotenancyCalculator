package com.example.controller;

import com.example.common.CommonResult;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Seyyu
 * @version 1.0
 * @date 2022-9-10
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public CommonResult selectUserList(){
        return userService.queryUserList();
    }

    @GetMapping("/addUser")
    @ResponseBody
    public CommonResult addUser(String username){
        return userService.addUser(username);
    }

    @GetMapping("/delUser")
    @ResponseBody
    public CommonResult delUser(String username){
        return userService.delUser(username);
    }
}
