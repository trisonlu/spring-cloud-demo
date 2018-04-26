package com.lsq.spring.demo.eureka.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LUSHUQIN443 on 2018/4/26.
 */
@RestController
public class DemoController {

    @RequestMapping("/demo")
    public String demo(@RequestParam String message) {
        return String.format("producer produce message:%s", message);
    }
}
