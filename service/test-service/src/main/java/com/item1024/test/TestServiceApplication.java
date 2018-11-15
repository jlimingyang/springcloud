package com.item1024.test;

import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Bean;

@SpringCloudApplication
public class TestServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TestServiceApplication.class).web(true).run(args);
    }

    @Autowired
    public ConnectionFactory connectionFactory;
}
