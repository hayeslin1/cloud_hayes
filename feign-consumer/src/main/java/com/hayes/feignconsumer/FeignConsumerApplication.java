package com.hayes.feignconsumer;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FeignConsumerApplication {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }



    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication.class, args);
    }

}
