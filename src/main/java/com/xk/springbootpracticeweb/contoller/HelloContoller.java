package com.xk.springbootpracticeweb.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloContoller {

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("1","2","3"));

    return "success";
    }
}
