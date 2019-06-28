package com.qhr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Test {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/toPage")
    public String toPage(HttpServletRequest request){
        String url = request.getParameter("url");
        return url;
    }
}
