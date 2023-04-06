package com.naumovets.patterns.Builder;

import java.math.BigDecimal;

public class OrderItemDto {
    private Long id;
    private String productTitle;
    private Long orderId;
    private int quantity;
    private BigDecimal pricePerProduct;
    private BigDecimal price;

    public OrderItemDto(Long id, String productTitle, Long orderId, int quantity, BigDecimal pricePerProduct, BigDecimal price) {
        this.id = id;
        this.productTitle = productTitle;
        this.orderId = orderId;
        this.quantity = quantity;
        this.pricePerProduct = pricePerProduct;
        this.price = price;
    }

    @Override
    public String toString() {
        return "id = " + id +
               ", productTitle = " + productTitle +
               ", orderId = " + orderId +
               ", quantity = " + quantity +
               ", pricePerProduct = " + pricePerProduct +
               ", price = " + price;
    }
}
