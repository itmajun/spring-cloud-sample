package com.yixiaolabs.service;

import com.yixiaolabs.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.yixiaolabs.repository.UserRepository;

/**
 * Created by jun on 2016/12/8.
 */
public interface UserService {

    User findById(Long id);
    User save(User u);
    Boolean deleteById(Long id);
    User update(User u);

}
