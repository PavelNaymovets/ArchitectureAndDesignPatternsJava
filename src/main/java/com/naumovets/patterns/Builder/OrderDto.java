package com.naumovets.patterns.Builder;

import java.math.BigDecimal;
import java.util.List;

public class OrderDto {
    private Long id;
    private String username;
    private List<OrderItemDto> items;

    private String address;

    private String phone;

    private BigDecimal totalPrice;

    private Integer sequenceNumber;

    public static class OrderDtoBuilder {
        private Long id;
        private String username;
        private List<OrderItemDto> items;
        private String address;
        private String phone;
        private BigDecimal totalPrice;
        private Integer sequenceNumber;

        public OrderDtoBuilder() {
        }

        public OrderDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public OrderDtoBuilder username(String username) {
            this.username = username;
            return this;
        }

        public OrderDtoBuilder items(List<OrderItemDto> items) {
            this.items = items;
            return this;
        }

        public OrderDtoBuilder address(String address) {
            this.address = address;
            return this;
        }

        public OrderDtoBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public OrderDtoBuilder totalPrice(BigDecimal totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public OrderDtoBuilder sequenceNumber(Integer sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }

        public OrderDto build() {
            return new OrderDto(this.id, this.username, this.items, this.address, this.phone, this.totalPrice, this.sequenceNumber);
        }
    }

    public OrderDto(Long id, String username, List<OrderItemDto> items, String address, String phone, BigDecimal totalPrice, Integer sequenceNumber) {
        this.id = id;
        this.username = username;
        this.items = items;
        this.address = address;
        this.phone = phone;
        this.totalPrice = totalPrice;
        this.sequenceNumber = sequenceNumber;
    }

    public static OrderDtoBuilder builder() {
        return new OrderDtoBuilder();
    }

    @Override
    public String toString() {
        return "id = " + id + "\n" +
               "username = " + username + "\n" +
               "items = " + items + "\n" +
               "address = " + address + "\n" +
               "phone = " + phone + "\n" +
               "totalPrice = " + totalPrice + "\n" +
               "sequenceNumber = " + sequenceNumber;
    }
}

