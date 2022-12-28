package com.example.filterservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FilterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilterServiceApplication.class, args);
    }


    //DONT FORGET TO ADD MODEL MAPPER
    

}
