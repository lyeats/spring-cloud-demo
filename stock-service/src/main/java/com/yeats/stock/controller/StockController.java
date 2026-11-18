package com.yeats.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类文件业务描述
 *
 * @author liming
 * @since 2025/11/25 0:21
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/deduct")
    public String deduct() {
        System.out.println("扣减库存成功.");
        return "扣减库存成功 " + port;
    }
}
