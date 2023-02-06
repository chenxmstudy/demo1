package com.xmstudy.demo1.controller;



import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SSOController {

    public void testGit() {
        System.out.println("first");
    }

    //session
    @RequestMapping("/sso1")
    public String test1(HttpServletRequest httpServletRequest) {
/*        HttpSession session = httpServletRequest.getSession();
        //session.setAttribute("token","11223344");
        System.out.println(session.getId());
        // 模拟redis
        Map map= new HashMap();
        map.put(session.getId(),"11223344");*/
        return "Hello Session";
    }

    //cookie
    @RequestMapping("/sso2")
    public String test2(HttpServletResponse response) {
        Cookie cookie = new Cookie("token","11223344");
        response.addCookie(cookie);
        return "Hello cookie";
    }

}
