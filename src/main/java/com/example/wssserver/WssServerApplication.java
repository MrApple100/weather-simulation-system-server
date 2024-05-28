package com.example.wssserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class WssServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WssServerApplication.class, args);
    }
}