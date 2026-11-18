package com.yeats.order.feign;

import com.yeats.order.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-service", path = "/stock", configuration = FeignConfig.class)
public interface StockService {

    @RequestMapping("/deduct")
    String deduct();
}
