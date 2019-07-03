package com.ldw.bootdemo.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 11:20 2019/7/3
 * @Modified By :
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @Transactional
    @GetMapping("/sw")
    public String test(){
        return  "sw";
    }
}
