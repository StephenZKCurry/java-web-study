package com.zhukai.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate配置类
 *
 * @author zhukai
 * @date 2021/4/11
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    // 基于Ribbon的负载均衡
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
