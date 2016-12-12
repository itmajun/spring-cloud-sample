package com.yixiaolabs.service;

import com.yixiaolabs.domain.User;

/**
 * Created by jun on 2016/12/12.
 */
public interface UserService {

    User findById(Long id);
}
