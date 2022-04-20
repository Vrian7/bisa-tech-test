/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.product_order.api.data;

import java.util.Date;
import java.util.List;

/**
 *
 * @author brian.barrera
 */
public class OrderData {
    private Long code;
    private Date date;
    private String description;
    private List<ProductData> productList;

    public Long getCode() {
        return this.code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProductData> getProductList() {
        return this.productList;
    }

    public void setProductList(List<ProductData> productList) {
        this.productList = productList;
    }

}
