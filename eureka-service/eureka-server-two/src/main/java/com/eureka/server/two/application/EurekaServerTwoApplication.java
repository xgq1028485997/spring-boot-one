package com.eureka.server.two.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(scanBasePackages = {"com.eureka.server.two"})
@EnableEurekaServer
public class EurekaServerTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerTwoApplication.class, args);
    }
}
