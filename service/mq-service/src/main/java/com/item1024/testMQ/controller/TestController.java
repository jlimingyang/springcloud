package com.item1024.testMQ.controller;

import lombok.extern.slf4j.Slf4j;
import mjson.Json;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/MQController")
@Slf4j
public class TestController {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @GetMapping("/one")
    public void testOne(@RequestParam("msg") String msg) throws InterruptedException {
       log.info("arg:{}",msg);
        Json json = Json.object().set("a","aaaaa").set("b","bbbbbb");
        amqpTemplate.convertAndSend("test",json.toString());
    }
}
