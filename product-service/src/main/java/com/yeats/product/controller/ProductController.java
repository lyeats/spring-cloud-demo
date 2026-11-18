package com.yeats.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类文件业务描述
 *
 * @author liming
 * @since 2025/11/25 0:21
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/getProduct/{id}")
    public String getProduct(@PathVariable("id")int id) {
        System.out.println("获取商品信息成功，商品ID=" + id);
        return "获取商品信息成功，商品ID=" + id + ",port=" + port;
    }

    @RequestMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id")int id) {
        System.out.println("删除商品成功，商品ID=" + id);
        return "删除商品成功，商品ID=" + id + ",port=" + port;
    }
}
