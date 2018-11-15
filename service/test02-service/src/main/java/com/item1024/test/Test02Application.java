package com.item1024.test;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class Test02Application {

	public static void main(String[] args) {
		 new SpringApplicationBuilder(Test02Application.class).web(true).run(args);
	}

}
