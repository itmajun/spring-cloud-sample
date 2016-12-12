package com.yixiaolabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by jun on 2016/12/12.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulProxyApplication {

    public static void main(String [] args){
        SpringApplication.run(ZuulProxyApplication.class, args);
    }
}
