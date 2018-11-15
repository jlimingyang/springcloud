package com.item1024.test.mqReceiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MQReceverTest {

    @RabbitListener(queues = "test")
    @RabbitHandler
    public void process(String arg){
        log.info("接收到消息:{}",arg);
    }
}
