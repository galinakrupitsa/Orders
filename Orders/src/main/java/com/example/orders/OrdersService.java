package com.example.orders;

import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    public String myMetod(String orderId,
                          String country,
                          String city,
                          OrdersClass order) {
        return "Номер заказа " + orderId + " Страна " + country + " Город " + city + " Товар " + order.getProductName() + " Количество " + order.getQuantity() + " Цена " + order.getPrice();
    }
}
