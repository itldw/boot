package com.example.bootdemo.constroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {


    @GetMapping("/hello")
    public  String hello(){
        return "hello";
    }

}
