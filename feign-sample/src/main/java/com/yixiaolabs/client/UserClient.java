package com.yixiaolabs.client;

import com.yixiaolabs.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jun on 2016/12/12.
 */

@FeignClient(name = "user-service")
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/user/info/{id}")
    User findById(@PathVariable("id") Long id);
}
