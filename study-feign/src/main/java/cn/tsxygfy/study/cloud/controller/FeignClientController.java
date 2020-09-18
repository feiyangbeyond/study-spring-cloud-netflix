package cn.tsxygfy.study.cloud.controller;

import cn.tsxygfy.study.cloud.feign.AdminFeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author guofy4
 * @date 2020/09/18
 */
@RestController
public class FeignClientController {

    private final AdminFeignClient adminFeignClient;

    public FeignClientController(AdminFeignClient adminFeignClient) {
        this.adminFeignClient = adminFeignClient;
    }

    @GetMapping("hi")
    public String sayHi(@RequestParam String message) {
        return adminFeignClient.sayHi(message);
    }
}
