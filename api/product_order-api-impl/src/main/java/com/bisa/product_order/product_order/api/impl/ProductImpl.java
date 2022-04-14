package com.bisa.product_order.product_order.api.impl;

import com.bisa.product_order.api.data.ProductData;
import javax.ejb.Local;
import javax.ejb.Stateless;
import com.bisa.product_order.api.serv.ProductServ;
import java.util.List;
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
    public ProductData create(ProductData productData){
        return null;
    }

    @Override
    public ProductData edit(ProductData productData){
        return null;
    }

    @Override
    public Boolean delete(Long code){
        return null;
    }

    @Override
    public List<ProductData> getList(){
        return null;
    }
}
