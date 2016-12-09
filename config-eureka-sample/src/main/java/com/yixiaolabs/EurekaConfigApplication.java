package com.yixiaolabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by jun on 2016/12/8.
 */

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaConfigApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaConfigApplication.class, args);
    }
}
