package com.zhukai.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Eureka Client服务提供者启动类
 *
 * @author zhukai
 * @date 2021/4/10
 */
@SpringBootApplication
public class ServerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerProviderApplication.class, args);
    }
}
