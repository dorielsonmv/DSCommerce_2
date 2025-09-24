package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;
import jakarta.persistence.criteria.CriteriaBuilder;

public class OrderItemDTO {
    private Long ProductID;
    private String name;
    private Double price;
    private Integer quantity;

    public OrderItemDTO(Long productID, String name, Double price, Integer quantity) {
        ProductID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderItemDTO(OrderItem intity) {
        ProductID = intity.getProduct().getId();
        name = intity.getProduct().getName();
        price = intity.getPrice();
        quantity = intity.getQuantity();
    }

    public Long getProductID() {
        return ProductID;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public Double getSubTotal(){
        return price*quantity;
    }

}
