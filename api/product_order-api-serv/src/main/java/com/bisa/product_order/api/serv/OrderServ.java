/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.product_order.api.serv;

import com.bisa.product_order.api.data.OrderData;
import com.bisa.product_order.tools.error.ErrorException;

import java.util.List;

/**
 *
 * @author brian.barrera
 */
public interface OrderServ {

    String NAME = "OrderServ";

    OrderData create(OrderData productData) throws ErrorException;

    OrderData edit(OrderData productData) throws ErrorException;

    Boolean delete(Long code) throws ErrorException;

    List<OrderData> getList() throws ErrorException;
}
