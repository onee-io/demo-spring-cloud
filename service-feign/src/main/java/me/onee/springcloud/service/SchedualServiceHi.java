package me.onee.springcloud.service;

import me.onee.springcloud.service.hystrix.SchdualServiceHiHysrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by VOREVER
 * Date: 2019/1/23 11:01
 */
@FeignClient(value = "service-hi", fallback = SchdualServiceHiHysrix.class)
public interface SchedualServiceHi {

    @GetMapping("/hi")
    String sayHi(@RequestParam(value = "name") String name);

}
