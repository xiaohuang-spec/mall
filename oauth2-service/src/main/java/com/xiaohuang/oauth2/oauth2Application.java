package com.xiaohuang.oauth2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class oauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(oauth2Application.class, args);
    }
}
