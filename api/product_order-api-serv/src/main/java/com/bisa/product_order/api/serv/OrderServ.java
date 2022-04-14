/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.product_order.api.serv;

import com.bisa.product_order.api.data.OrderData;
import java.util.List;

/**
 *
 * @author brian.barrera
 */
public interface OrderServ {
    
    String NAME = "OrderServ";

    OrderData create(OrderData productData);

    OrderData edit(OrderData productData);

    Boolean delete(Long code);

    List<OrderData> getList();
}
