package com.zx.springfox.controller;

import com.zx.springfox.model.Stock;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {
    Stock stock;

    @PostMapping("/stock/create")
    public void CreateStock(@RequestBody Stock stock){
        System.out.println("股票上市，信息：" + stock);
        this.stock = stock;
    }

    @RequestMapping("/stock/get")
    public Stock GetStock(){
        if (stock == null){
            stock = Stock.builder()
                    .no("199")
                    .name("create myself")
                    .price(100).build();
        }
        return stock;
    }
}
