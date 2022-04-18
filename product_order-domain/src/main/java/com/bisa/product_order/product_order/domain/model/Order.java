package com.bisa.product_order.product_order.domain.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author brian.barrera
 */
@Entity
@Table(name = "order")
public class Order implements Serializable{

    @Column(name = "order_id")
    @Id
    Long orderId;

    @Column(name = "date")
    @Basic
    @Temporal(TemporalType.DATE)
    Date date;

    @Column(name = "description")
    @Basic
    String description;

    @ManyToMany
    @JoinColumn(name = "product_id")
    List<Product> productList;

    public Order() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
