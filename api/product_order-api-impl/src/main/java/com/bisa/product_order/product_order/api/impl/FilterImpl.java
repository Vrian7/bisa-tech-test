package com.bisa.product_order.product_order.api.impl;

import com.bisa.product_order.api.data.OrderData;
import com.bisa.product_order.api.data.ProductData;
import com.bisa.product_order.api.serv.FilterServ;
import java.util.List;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author brian.barrera
 */
public class FilterImpl implements FilterServ{
    public List<ProductData> searchByOrder(OrderData orderData){
        return null;
    }

    public List<OrderData> searchByProduct(ProductData productData){
        return null;
    }

    public List<ProductData> search(String filter){
        return null;
    }
}
