package com.example.orders;

import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    public String myMetod(String orderId, OrdersClass order) {
        return "Номер заказа " + orderId + " Товар " + order.getProductName() + " Количество " + order.getQuantity() + " Цена " + order.getPrice();
    }
}
