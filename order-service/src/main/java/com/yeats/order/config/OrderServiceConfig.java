package com.yeats.order.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 类文件业务描述
 *
 * @author liming
 * @since 2025/11/25 0:42
 */
@SpringBootConfiguration
@EnableAutoConfiguration
public class OrderServiceConfig {

    @Bean(value = "restTemplate")
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
