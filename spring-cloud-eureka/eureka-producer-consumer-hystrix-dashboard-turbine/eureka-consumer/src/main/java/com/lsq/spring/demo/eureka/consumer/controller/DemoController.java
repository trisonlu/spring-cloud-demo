package com.lsq.spring.demo.eureka.consumer.controller;

import com.lsq.spring.demo.eureka.consumer.remote.DemoRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LUSHUQIN443 on 2018/4/26.
 */
@RestController
public class DemoController {
    @Autowired
    private DemoRemote demoRemote;

    @RequestMapping("/demo/{message}")
    public String demo(@PathVariable("message") String message) {
        return demoRemote.demo(message);
    }
}
