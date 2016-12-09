package com.yixiaolabs.web;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jun on 2016/12/9.
 */
@RestController
public class SampleController {

    /**
     *  注入eurekaClient 来进行访问其他服务.
     *  一般情况下,我们不使用eurekaClient 对象,大部分情况下我们使用Feign ,RestTemplate 都包装了eurekaClient.
     *  当然 ,也可以使用 discoveryClient 对象.
     */
    @Autowired
    private EurekaClient discoveryClient;


    @GetMapping("/")
    public String hello(){
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("user-service", false);
        return instance.getHomePageUrl();
    }
}
