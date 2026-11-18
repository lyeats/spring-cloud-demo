package com.yeats.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类文件业务描述
 *
 * @author liming
 * @since 2025/11/27 12:58
 */
//@Configuration
public class FeignConfig {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Bean
    public Logger.Level getLoggerLevel(){
        return Logger.Level.FULL;
    }
}
