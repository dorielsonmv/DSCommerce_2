package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;
import jakarta.persistence.criteria.CriteriaBuilder;

public class OrderItemDTO {
    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;

    public OrderItemDTO() {
    }

    public OrderItemDTO(Long productID, String name, Double price, Integer quantity,String imgUrl) {
        productId = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderItemDTO(OrderItem entity) {
        productId = entity.getProduct().getId();
        name = entity.getProduct().getName();
        price = entity.getPrice();
        quantity = entity.getQuantity();
//        imgUrl = entity.getProduct().getImgUrl();
    }

    public Long getProductId() {
        return productId;
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
