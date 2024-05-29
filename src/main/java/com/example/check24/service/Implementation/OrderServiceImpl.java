package com.example.check24.service.Implementation;

import com.example.check24.model.Customer;
import com.example.check24.model.MyOrder;
import com.example.check24.model.Product;
import com.example.check24.repository.CustomerRepository;
import com.example.check24.repository.OrderRepository;
import com.example.check24.repository.ProductRepository;
import com.example.check24.service.IOrderService;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Order placeOrder(Long customer_id, Long product_id, int quantity) {
        MyOrder order = new MyOrder();
        Product product = productRepository.findById(product_id).get();
        Customer customer = customerRepository.findById(customer_id).get();

        System.out.println(product.getProductName());
        System.out.println(customer.getFirstName());

        order.setCustomer(customer);
        order.setProduct(product);
        order.setQuantity(quantity);
        order.setOrderDate(new Date());
        orderRepository.save(order);
        return null;
    }
}
