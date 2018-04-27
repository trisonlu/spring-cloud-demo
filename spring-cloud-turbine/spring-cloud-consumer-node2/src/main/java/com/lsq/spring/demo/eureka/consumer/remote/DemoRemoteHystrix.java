package com.lsq.spring.demo.eureka.consumer.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by LUSHUQIN443 on 2018/4/26.
 */
@Component
public class DemoRemoteHystrix implements DemoRemote {

    @Override
    public String demo2(@RequestParam(value = "message") String message) {
        return String.format("producers produce message:%s fail..", message);
    }

}
