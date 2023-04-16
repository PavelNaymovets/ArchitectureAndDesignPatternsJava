package com.naumovets.patterns.DataMapper.dto;

import java.math.BigDecimal;

public class ProductDto {
    private Long id;
    private String title;
    private BigDecimal cost;
    private String categoryTitle;

    public ProductDto(Long id, String title, BigDecimal cost, String categoryTitle) {
        this.id = id;
        this.title = title;
        this.cost = cost;
        this.categoryTitle = categoryTitle;
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

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                "title: " + title + "\n" +
                "cost:" + cost + "\n" +
                "categoryTitle:" + categoryTitle;
    }
}
