package com.bisa.product_order.product_order.domain.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author brian.barrera
 */
@Entity
@Table(name = "product")
public class Product {
    @Column(name = "product_id")
    @Id
    Long productId;

    @Column(name = "description")
    @Basic
    String name;

    public Product() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
