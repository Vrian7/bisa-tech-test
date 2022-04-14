package com.bisa.product_order.product_order.api.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;
import com.bisa.product_order.api.serv.ProductServ;
import javax.ejb.LocalBean;


/**
 *
 * @author brian.barrera
 */
//
@Stateless
@Local(ProductServ.class)
public class ProductImpl implements ProductServ{

    @Override
    public String getList(){
        return "serving from impl";
    }
}
