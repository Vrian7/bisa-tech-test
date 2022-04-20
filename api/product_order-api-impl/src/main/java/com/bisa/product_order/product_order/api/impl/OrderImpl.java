/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.product_order.product_order.api.impl;

import com.bisa.product_order.api.data.OrderData;
import com.bisa.product_order.api.serv.OrderServ;
import com.bisa.product_order.product_order.api.mapper.OrderMapper;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import com.bisa.product_order.runtime.data.OrderSource;
import com.bisa.product_order.runtime.data.ProductSource;
import com.bisa.product_order.runtime.serv.ProductOrderProvider;
import com.bisa.product_order.tools.error.ErrorException;
import com.bisa.product_order.tools.message.ValidationMessage;

/**
 *
 * @author brian.barrera
 */
@Stateless
@Local(OrderServ.class)
public class OrderImpl implements OrderServ {
    @EJB(name = ProductOrderProvider.NAME)
    private ProductOrderProvider provider;

    @Override
    public OrderData create(OrderData productData) throws ErrorException {
        ErrorException error = new ErrorException("API IMPL");
        error.isNull(productData.getDescription(), "Orden sin descripcion");
        error.throwException();
        OrderSource orderSource = OrderMapper.mapperToOrderSource(productData);
        orderSource = provider.createOrder(orderSource);
        return OrderMapper.mapperToOrderData(orderSource);
    }

    @Override
    public OrderData edit(OrderData productData) throws ErrorException {
        ErrorException error = new ErrorException("API IMPL");
        error.isNull(productData.getCode(), "Orden no existe");
        error.throwException();
        OrderSource orderSource = OrderMapper.mapperToOrderSource(productData);
        orderSource = provider.updateOrder(orderSource);
        return OrderMapper.mapperToOrderData(orderSource);
    }

    @Override
    public Boolean delete(Long code) throws ErrorException {
        ErrorException error = new ErrorException("API IMPL");
        error.isNull(code, "Orden no existe");
        error.throwException();
        OrderSource orderSource = new OrderSource();
        orderSource.setOrderId(code);
        orderSource = provider.createOrder(orderSource);
        return true;
    }

    @Override
    public List<OrderData> getList() throws ErrorException {
        List<OrderSource> orderSourceList = provider.orderList();
        return OrderMapper.mapperToOrderDataList(orderSourceList);
    }
}
