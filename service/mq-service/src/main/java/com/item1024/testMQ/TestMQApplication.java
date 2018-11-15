package com.item1024.testMQ;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Queue;
@SpringCloudApplication
@EnableFeignClients
public class TestMQApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(TestMQApplication.class).web(true).run(args);
    }

    @Bean
    public Queue testQueue() {
        return new Queue("test",true,false,false,null);
    }

}
