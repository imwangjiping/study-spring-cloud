package com.jwong.jwongeurekaproviderjpush.web.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * JPushController class
 *
 * @author J.Wong
 * @date 2018/08/08
 */
@RestController
public class JPushController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/hello")
    public String hello() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello" +
                ", host: " + serviceInstance.getHost() +
                ", serviceId: " + serviceInstance.getServiceId());
        return "hello world";
    }

}
