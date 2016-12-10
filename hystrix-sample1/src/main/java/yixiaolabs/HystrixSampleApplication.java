package yixiaolabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by jun on 2016/12/9.
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
public class HystrixSampleApplication {

    public static void main(String [] args){
        SpringApplication.run(HystrixSampleApplication.class, args);
    }

}
