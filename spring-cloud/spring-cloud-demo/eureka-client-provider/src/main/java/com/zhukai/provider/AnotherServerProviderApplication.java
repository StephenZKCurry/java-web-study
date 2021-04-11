package com.zhukai.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 创建两个Eureka Client服务提供者启动类，模拟多服务的场景
 *
 * @author zhukai
 * @date 2021/4/10
 */
@SpringBootApplication
public class AnotherServerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnotherServerProviderApplication.class, args);
    }
}
