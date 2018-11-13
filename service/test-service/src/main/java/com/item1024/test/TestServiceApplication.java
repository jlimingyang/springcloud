package com.item1024.test;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
public class TestServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TestServiceApplication.class).web(true).run(args);
    }
}
