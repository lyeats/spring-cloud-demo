package com.yeats.order.controller;

import com.yeats.order.feign.ProductService;
import com.yeats.order.feign.StockService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 类文件业务描述
 *
 * @author liming
 * @since 2025/11/24 21:15
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    StockService stockService;

    @Resource
    ProductService productService;

    @RequestMapping("/add")
    public String add() {
        System.out.println("创建订单成功");
        String s = stockService.deduct();
        String p = productService.getProduct(1);
        return "hello feign." + s +","+ p;
    }
}
