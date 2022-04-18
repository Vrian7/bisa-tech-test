package com.bisa.product_order.runtime.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;

import com.bisa.product_order.runtime.serv.ProductProvider;

@Stateless(name = ProductProvider.NAME)
@Local(ProductProvider.class)
public class ProductImpl implements ProductProvider {

    @Override
    public String hi() {
        return "this is a provider string";
    }
}