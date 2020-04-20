package com.eureka.client.two.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.eureka.client.two"})
@EnableDiscoveryClient
public class EurekaClientTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientTwoApplication.class, args);
    }
}
