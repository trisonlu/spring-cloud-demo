package com.lsq.spring.demo.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LUSHUQIN443 on 2018/5/11.
 */
@RestController
public class ConfigClientController {

    @Value("${env}")
    private String env;

    @RequestMapping("/env")
    public String env() {
        return this.env;
    }
}
