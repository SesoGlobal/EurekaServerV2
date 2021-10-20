package com.sesoglobal.sesoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SesoEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SesoEurekaServerApplication.class, args);
    }

}

