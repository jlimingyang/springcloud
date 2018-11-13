package com.item1024.test.fallBack;

import com.item1024.test.feignClient.TestServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestServiceFallback implements TestServiceClient {
    @Override
    public String testOne(String msg) {
        log.info("失败了", msg);
        return null;
    }
}
