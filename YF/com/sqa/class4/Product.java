package com.sqa.class4;

import java.math.BigDecimal;

public class Product {
    private String name;
    private Integer size;
    private BigDecimal price;

    public Product(String name, Integer size, BigDecimal price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
