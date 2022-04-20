package com.bisa.product_order.api.serv;

import com.bisa.product_order.api.data.ProductData;
import com.bisa.product_order.tools.error.ErrorException;

import java.util.List;

/**
 *
 * @author brian.barrera
 */
public interface ProductServ {

    String NAME = "ProductServ";

    ProductData create(ProductData productData) throws ErrorException;

    ProductData edit(ProductData productData) throws ErrorException;

    Boolean delete(Long code) throws ErrorException;

    List<ProductData> getList() throws ErrorException;

}
