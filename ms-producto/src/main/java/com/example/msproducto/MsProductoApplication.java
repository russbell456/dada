package com.example.msproducto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class MsProductoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsProductoApplication.class, args);
    }
}




