package com.kavya.ecommerce.controller;

import com.kavya.ecommerce.model.Order;
import com.kavya.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getFilteredOrders(
            @RequestParam(required = false) String orderId,
            @RequestParam(required = false) String customer,
            @RequestParam(required = false) String orderItem,
            @RequestParam(required = false) String startDate,
            @RequestParam(required = false) String endDate,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(required = false) String status
    ) {
        List<Order> orders = orderService.getFilteredOrders(orderId, customer, orderItem, startDate, endDate, minPrice, maxPrice, status);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
}
