package cn.tsxygfy.study.cloud.feign.hystrix;

import cn.tsxygfy.study.cloud.feign.AdminFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author guofy4
 * @date 2020/09/18
 */
@Component
public class AdminFeignClientHystrix implements AdminFeignClient {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
