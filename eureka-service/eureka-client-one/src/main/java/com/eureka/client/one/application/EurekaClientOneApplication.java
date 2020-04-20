package com.eureka.client.one.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.eureka.client.one"})
@EnableDiscoveryClient
public class EurekaClientOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientOneApplication.class, args);
    }
}
