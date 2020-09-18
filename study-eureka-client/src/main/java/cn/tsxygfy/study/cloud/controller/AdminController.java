package cn.tsxygfy.study.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guofy4
 * @date 2020/09/18
 */
@RestController
public class AdminController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String sayHi(@RequestParam(value = "message") String message) {
        return String.format("Hi, your message is: %s. I am from port: %s, my name is %s.", message, port, applicationName);
    }

}
