package com.yixiaolabs.service;

import com.yixiaolabs.domain.User;
import com.yixiaolabs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jun on 2016/12/8.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        User u = userRepository.findOne(id);
        if(u != null){
            return u;
        }
        return null;
    }

    @Override
    public User save(User u) {
        User user = userRepository.save(u);
        return user;
    }

    @Override
    public Boolean deleteById(Long id) {
        try{
            userRepository.delete(id);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public User update(User u) {
        User user = userRepository.save(u);
        return user;
    }
}
