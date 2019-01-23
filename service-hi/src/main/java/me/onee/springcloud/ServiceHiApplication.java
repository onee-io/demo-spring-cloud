package me.onee.springcloud;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by VOREVER
 * Date: 2019/1/22 21:47
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public Sampler defaultSampler() {
        // 调用上报 zipkin
        return Sampler.ALWAYS_SAMPLE;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name") String name) {
        return "hi " + name + "! I am service-hi.";
    }

    @RequestMapping("/hello")
    public String callMiya() {
        return restTemplate.getForObject("http://localhost:8084/miya", String.class);
    }

    @RequestMapping("/info")
    public String info() {
        return "I'm service-hi.";
    }


}
