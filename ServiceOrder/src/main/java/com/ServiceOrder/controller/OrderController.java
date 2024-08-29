package com.ServiceOrder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/{id}")
    public String getOrder(@PathVariable String id) {
        // Simulate fetching order by ID
        return "Order with ID: " + id;
    }
}
