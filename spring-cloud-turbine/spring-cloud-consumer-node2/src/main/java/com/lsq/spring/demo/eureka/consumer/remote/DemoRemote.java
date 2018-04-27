package com.lsq.spring.demo.eureka.consumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by LUSHUQIN443 on 2018/4/26.
 */
@FeignClient(name = "spring-cloud-producer2", fallback = DemoRemoteHystrix.class)
public interface DemoRemote {
    @RequestMapping(value = "/demo")
    public String demo2(@RequestParam(value = "message") String message);
}
