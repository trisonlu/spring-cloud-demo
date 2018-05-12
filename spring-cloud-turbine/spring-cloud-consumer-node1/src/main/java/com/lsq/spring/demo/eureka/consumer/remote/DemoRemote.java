package com.lsq.spring.demo.eureka.consumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by trison on 2018/4/26.
 */
@FeignClient(name = "spring-cloud-producer", fallback = DemoRemoteHystrix.class)
public interface DemoRemote {
    @RequestMapping(value = "/demo")
    public String demo(@RequestParam(value = "message") String message);
}
