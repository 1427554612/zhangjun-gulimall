package com.zhangjun.guli.gulimallSecutiry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acl")
public class AclController {

    @GetMapping("/hello")
    public String hello(){
        return "index";
    }
}
