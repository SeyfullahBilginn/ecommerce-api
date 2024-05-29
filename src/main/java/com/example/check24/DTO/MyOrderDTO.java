package com.example.check24.DTO;

public class MyOrderDTO {

    private Long product_id;

    private Long customer_id;

    private  int quantity;

    public MyOrderDTO() {
    }

    public MyOrderDTO(Long product_id, Long customer_id, int quantity) {
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.quantity = quantity;
    }

    public Long getProduct_id() {
        return product_id;

    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }
}
