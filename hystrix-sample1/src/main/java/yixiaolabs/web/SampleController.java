package yixiaolabs.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jun on 2016/12/10.
 */
@RestController
public class SampleController {

    @GetMapping("/")
    @HystrixCommand(groupKey = "SampleController1",commandKey = "hello1")
    public String hello(){
        return "1";
    }
}
