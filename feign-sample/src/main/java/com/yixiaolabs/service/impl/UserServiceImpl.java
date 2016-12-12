package com.yixiaolabs.service.impl;

import com.yixiaolabs.client.UserClient;
import com.yixiaolabs.domain.User;
import com.yixiaolabs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jun on 2016/12/12.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserClient userClient;

    @Override
    public User findById(Long id) {
        return userClient.findById(id);
    }
}
