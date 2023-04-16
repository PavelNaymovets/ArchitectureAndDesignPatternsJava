package com.naumovets.patterns.DataMapper.entity;

import java.math.BigDecimal;

public class Product {
    private Long id;
    private String title;
    private BigDecimal cost;
    private Category category;

    public Product(Long id, String title, BigDecimal cost, Category category) {
        this.id = id;
        this.title = title;
        this.cost = cost;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
