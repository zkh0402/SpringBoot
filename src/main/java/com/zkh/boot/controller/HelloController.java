package com.zkh.boot.controller;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zkh
 * @date 2022/5/29 -16:50
 */
//@ResponseBody  浏览器返回字符串
//@Controller

@RestController  //等于@ResponseBody+@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello SpringBoot2";
    }

}
