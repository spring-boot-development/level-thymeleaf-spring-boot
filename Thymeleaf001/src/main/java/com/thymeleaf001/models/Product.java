package com.thymeleaf001.models;

/**
 * Created by hiemseyha on 7/28/17.
 */
public class Product {

    private String name;

    private  Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public  Product() {
        name = "Product List 001";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
