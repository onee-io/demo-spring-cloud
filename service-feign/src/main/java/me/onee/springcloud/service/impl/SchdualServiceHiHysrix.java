package me.onee.springcloud.service.impl;

import me.onee.springcloud.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by VOREVER
 * Date: 2019/1/23 11:26
 */
@Component
public class SchdualServiceHiHysrix implements SchedualServiceHi {

    @Override
    public String sayHi(String name) {
        return "sorry " + name + "!";
    }

}
