package com.yixiaolabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by jun on 2016/12/10.
 */
@SpringBootApplication
@EnableTurbine
public class HystrixTurbineApplication {

    public static void main(String [] args){
        SpringApplication.run(HystrixTurbineApplication.class, args);
    }
}
