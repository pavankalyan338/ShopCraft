package com.example.shopcraft.controller;

import com.example.shopcraft.model.UserOrder;
import com.example.shopcraft.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public UserOrder placeOrder(@RequestBody UserOrder order) {
        order.setStatus("PLACED");
        return orderRepository.save(order);
    }

    @GetMapping("/user/{userId}")
    public List<UserOrder> getUserOrders(@PathVariable Long userId) {
        return orderRepository.findByUserId(userId);
    }
}