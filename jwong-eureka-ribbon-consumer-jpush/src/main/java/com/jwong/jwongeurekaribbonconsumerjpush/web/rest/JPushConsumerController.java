package com.jwong.jwongeurekaribbonconsumerjpush.web.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * JPushConsumerController class
 *
 * @author J.Wong
 * @date 2018/08/08
 */
@RestController
public class JPushConsumerController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/ribbon-consumer-hello")
    public String ribbonConsumerHello() {
        String url = "http://JWONG-JPUSH-SERVICE/hello";
        // return restTemplate.getForEntity(url, String.class).getBody();
        return restTemplate.getForObject(url, String.class);
    }

}
