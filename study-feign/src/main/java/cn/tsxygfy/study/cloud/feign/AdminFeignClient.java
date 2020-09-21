package cn.tsxygfy.study.cloud.feign;

import cn.tsxygfy.study.cloud.feign.hystrix.AdminFeignClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guofy4
 * @date 2020/09/18
 */
@FeignClient(value = "Eureka-Client", fallback = AdminFeignClientHystrix.class)
public interface AdminFeignClient {

    /**
     * Say hi.
     *
     * @param message String
     * @return String
     */
    @GetMapping("hi")
    String sayHi(@RequestParam(value = "message") String message);

}
