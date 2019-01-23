package me.onee.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by VOREVER
 * Date: 2019/1/23 11:01
 */
@FeignClient("service-hi")
public interface SchedualServiceHi {

    @GetMapping("/hi")
    String sayHi(@RequestParam(value = "name") String name);

}
