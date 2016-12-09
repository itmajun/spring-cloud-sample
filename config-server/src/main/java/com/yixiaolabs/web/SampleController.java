package com.yixiaolabs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jun on 2016/12/8.
 */
@RestController
public class SampleController {

    @Value("${foo}")
    private String foo;

    @GetMapping("/hello")
    public String hello(){
        return foo;
    }
}
