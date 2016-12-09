package com.yixiaolabs.repository;

import com.yixiaolabs.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jun on 2016/12/8.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
