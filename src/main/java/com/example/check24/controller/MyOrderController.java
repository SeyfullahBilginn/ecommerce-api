package com.example.check24.controller;


import com.example.check24.DTO.MyOrderDTO;
import com.example.check24.model.MyOrder;
import com.example.check24.service.IOrderService;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/orders")
public class MyOrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping("/placeOrder")
    public Order placeOrder(@RequestBody MyOrderDTO myOrderDto) {
        return orderService.placeOrder(myOrderDto.getCustomer_id(), myOrderDto.getProduct_id(),1);
    }
}
