package com.zhukai.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul网关服务启动类
 *
 * @author zhukai
 * @date 2021/4/11
 */
// 设置该类是网关的启动类，此外还有一个@EnableZuulServer注解
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
