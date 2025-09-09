package com.example.orders;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrdersController {
    public final OrdersService ordersService;
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }
    @PostMapping("/orders/{orderId}")
    public String createOrder(@PathVariable String orderId,
                              @RequestParam String country,
                              @RequestParam String city,
                              @RequestBody OrdersClass order) {
        return ordersService.myMetod(orderId, country, city, order);
    }
}
