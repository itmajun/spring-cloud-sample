package com.yixiaolabs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;

/**
 * Created by jun on 2016/12/10.
 */
@RestController
public class SampleController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private LoadBalancerClient loadBalancer;
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/")
    public String hello(){
        String fortune = restTemplate.getForObject("http://hystrix-sample", String.class);
        logger.info("fortune====="+ fortune);
        return fortune;
    }

    private String fetchFortuneServiceUrl() {
        ServiceInstance instance = loadBalancer.choose("hystrix-sample");
        return instance.getUri().toString();
    }
}
