package me.onee.springcloud.controller;

import me.onee.springcloud.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VOREVER
 * Date: 2019/1/23 11:03
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHi(name);
    }

}
