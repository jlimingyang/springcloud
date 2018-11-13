package com.item1024.test.feignClient;

import com.item1024.test.fallBack.TestServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name = "test-service",fallback= TestServiceFallback.class)
public interface TestServiceClient {
    @GetMapping("/test/one")
    String testOne(@RequestParam("msg") String msg);
}
