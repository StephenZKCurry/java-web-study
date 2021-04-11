package com.zhukai.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Eureka Client服务消费者启动类
 *
 * @author zhukai
 * @date 2021/4/10
 */
@SpringBootApplication
public class ServerConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConsumerApplication.class, args);
    }
}
