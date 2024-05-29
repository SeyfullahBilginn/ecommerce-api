package com.example.check24.service;

import org.hibernate.query.Order;

public interface IOrderService {
    Order placeOrder(Long customer_id, Long product_id, int quantity);

}