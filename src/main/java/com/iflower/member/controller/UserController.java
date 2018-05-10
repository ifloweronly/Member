package com.iflower.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @RequestMapping("/getUserinfo")
    public String getUserInfo(){
        return "hello";
    }

}
