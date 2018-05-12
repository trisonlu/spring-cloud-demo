/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.trisonlu.spring.demo.cloud.eureka.cluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by trison on 2018/4/24.
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaApplication.class, args);
    }
}
