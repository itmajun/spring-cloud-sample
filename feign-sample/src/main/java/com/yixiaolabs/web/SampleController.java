package com.yixiaolabs.web;

import com.yixiaolabs.domain.User;
import com.yixiaolabs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jun on 2016/12/12.
 */
@RestController
public class SampleController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public User hello(){
        return userService.findById(1L);
    }


}
