package com.tyc.update;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class UpdateApplication {

    public static void main(String[] args) {

        SpringApplication.run(UpdateApplication.class, args);
    }

}
