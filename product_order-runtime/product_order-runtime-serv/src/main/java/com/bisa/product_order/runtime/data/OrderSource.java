package com.bisa.product_order.runtime.data;

import java.util.Date;
import java.util.List;

public class OrderSource {
    private Long orderId;
    private Date date;
    private String description;
    private List<ProductSource> productList;

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public List<ProductSource> getProductList() {
        return this.productList;
    }

    public void setProductList(List<ProductSource> productList) {
        this.productList = productList;
    }

}
