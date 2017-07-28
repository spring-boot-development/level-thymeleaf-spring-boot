package com.thymeleaf001.models;

/**
 * Created by hiemseyha on 7/28/17.
 */
public class Address {

    private String city;
    private Integer no;

    public Address() {
        city = "Phnom penh";
        no = 24;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }
}
