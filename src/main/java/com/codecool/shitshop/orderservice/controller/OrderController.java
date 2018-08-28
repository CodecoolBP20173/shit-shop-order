package com.codecool.shitshop.orderservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @PostMapping(value = "/order")
    public String getOrder() {


        return "OK";
    }

    @GetMapping(value = "/orderhistory")
    public String getHistory() {

        return "";
    }
}
