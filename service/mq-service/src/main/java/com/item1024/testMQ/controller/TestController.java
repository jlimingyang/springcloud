package com.item1024.test.controller;

import com.item1024.test.feignClient.TestServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testController")
@Slf4j
public class TestController {

    @Autowired
    private TestServiceClient testServiceClient;

    @GetMapping("/one")
    public String testOne(@RequestParam("a") String a){
        log.info("test:{}",a);
        String res = testServiceClient.testOne(a);
        log.info("res:{}",res);
        return res;
    }
}
