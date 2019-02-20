package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/toindex")
    public String toindex(){
        System.out.println(222222);
        return "index";
    }

}
