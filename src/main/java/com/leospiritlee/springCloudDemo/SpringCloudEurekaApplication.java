package com.leospiritlee.springCloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Project: SpringCloudDemo
 * @ClassName SpringCloudEurekaApplication
 * @description: cloud eureka 启动application
 * @author: leospiritlee
 * @create: 2020-06-14 18:28
 **/
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaApplication.class, args);
    }
}
