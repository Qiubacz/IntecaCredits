package com.inteca.java.credit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class zloInfoOKredycie {

    @RequestMapping("/")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String pageTwo(){
        return "cześć!";
    }
}
