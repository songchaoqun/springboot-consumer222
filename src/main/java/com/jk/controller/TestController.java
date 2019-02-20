package com.jk.controller;

import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("/test")
    public void findData(){
        String say=testService.say("你吃了吗?");
        System.out.println(say);
    }
}
