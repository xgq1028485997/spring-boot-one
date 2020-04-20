package com.app.one.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.app.one"})
public class AppOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppOneApplication.class, args);
    }
}
