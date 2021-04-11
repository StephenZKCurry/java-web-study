package com.zhukai.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server服务启动类
 *
 * @author zhukai
 * @date 2021/4/10
 */
@SpringBootApplication
// 该注解声明该类是Eureka Server服务，提供服务注册和服务发现功能，即注册中心
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
