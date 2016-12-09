package com.yixiaolabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by jun on 2016/12/9.
 */
@SpringBootApplication
@EnableEurekaServer
public class PeerEurekaServerApplication {

    public static void main(String[] args){
        SpringApplication.run(PeerEurekaServerApplication.class, args);
    }
}
