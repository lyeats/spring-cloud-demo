package com.yeats.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-service", path = "/product")
public interface ProductService {

    @RequestMapping("/getProduct/{id}")
    String getProduct(@PathVariable("id")int id);
}
