package com.bisa.product_order.runtime.serv;

import java.util.List;

import com.bisa.product_order.tools.error.ErrorException;
import com.bisa.product_order.runtime.data.OrderSource;
import com.bisa.product_order.runtime.data.ProductSource;

public interface ProductOrderProvider {
    String NAME = "ProductOrderProvider";

    ProductSource createProduct(ProductSource productSource) throws ErrorException;

    ProductSource updateProduct(ProductSource productSource) throws ErrorException;

    Boolean deleteProduct(ProductSource productSource) throws ErrorException;

    List<ProductSource> productList() throws ErrorException;

    List<ProductSource> productListByOrder(OrderSource orderSource) throws ErrorException;

    OrderSource createOrder(OrderSource orderSource) throws ErrorException;

    OrderSource updateOrder(OrderSource orderSource) throws ErrorException;

    Boolean deleteOrder(OrderSource orderSource) throws ErrorException;

    List<OrderSource> orderList() throws ErrorException;

    List<OrderSource> orderListByProduct(ProductSource productSource) throws ErrorException;

}
