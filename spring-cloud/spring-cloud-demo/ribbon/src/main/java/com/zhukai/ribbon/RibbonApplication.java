package com.zhukai.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Ribbon客户端负载均衡启动类
 *
 * @author zhukai
 * @date 2021/4/11
 */
@SpringBootApplication
public class RibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }
}
