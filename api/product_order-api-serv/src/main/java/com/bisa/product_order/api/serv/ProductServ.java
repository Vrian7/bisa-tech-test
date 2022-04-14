package com.bisa.product_order.api.serv;

import com.bisa.product_order.api.data.ProductData;
import java.util.List;

/**
 *
 * @author brian.barrera
 */
public interface ProductServ {
    
    String NAME = "ProductServ";

    ProductData create(ProductData productData);

    ProductData edit(ProductData productData);

    Boolean delete(Long code);

    List<ProductData> getList();

}
