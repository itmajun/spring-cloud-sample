package com.yixiaolabs.web;

import com.yixiaolabs.domain.User;
import com.yixiaolabs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jun on 2016/12/8.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/info/{id}")
    public User info(@PathVariable Long id){
        if(id == null){
            return null;
        }
        return userService.findById(id);
    }

    @PostMapping("/save")
    public User save(User u){

        if(u ==null){
            return null;
        }
        return userService.save(u);
    }
    @PostMapping("/update")
    public User update(User u){
        return userService.update(u);
    }

    @PostMapping("/delete")
    public String delete(Long id){
        boolean result = userService.deleteById(id);
        if (result){
            return "1";
        }
        return "-1";
    }
}
