package com.bisa.product_order.product_order.api.impl;

import com.bisa.product_order.api.data.OrderData;
import com.bisa.product_order.api.data.ProductData;
import com.bisa.product_order.api.serv.FilterServ;
import com.bisa.product_order.product_order.api.mapper.OrderMapper;
import com.bisa.product_order.product_order.api.mapper.ProductMapper;
import com.bisa.product_order.runtime.data.OrderSource;
import com.bisa.product_order.runtime.data.ProductSource;
import com.bisa.product_order.runtime.serv.ProductOrderProvider;
import com.bisa.product_order.tools.error.ErrorException;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 *
 * @author brian.barrera
 */
@Stateless
@Local(FilterServ.class)
public class FilterImpl implements FilterServ {
    @EJB(name = ProductOrderProvider.NAME)
    private ProductOrderProvider provider;

    public List<ProductData> searchByOrder(OrderData orderData) throws ErrorException {
        OrderSource orderSource = OrderMapper.mapperToOrderSource(orderData);
        List<ProductSource> productSourceList = provider.productListByOrder(orderSource);
        ErrorException error = new ErrorException("API IMPL");
        error.isNullOrEmpty(productSourceList, "Sin resultados");
        error.throwException();
        return ProductMapper.mapperToProductDataList(productSourceList);
    }

    public List<OrderData> searchByProduct(ProductData productData) throws ErrorException {
        ProductSource productSource = ProductMapper.mapperToProductSource(productData);
        List<OrderSource> orderSourceList = provider.orderListByProduct(productSource);
        ErrorException error = new ErrorException("API IMPL");
        error.isNullOrEmpty(orderSourceList, "Sin resultados");
        error.throwException();
        return OrderMapper.mapperToOrderDataList(orderSourceList);
    }

    public List<ProductData> search(String filter) throws ErrorException {
        throw new ErrorException("No implemented");
    }
}
