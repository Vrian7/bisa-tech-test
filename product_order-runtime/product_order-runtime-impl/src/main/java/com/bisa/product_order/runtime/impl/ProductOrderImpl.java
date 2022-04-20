package com.bisa.product_order.runtime.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import com.bisa.product_order.product_order.domain.model.Order;
import com.bisa.product_order.product_order.domain.model.Product;
import com.bisa.product_order.runntime.local.OrderLocal;
import com.bisa.product_order.runntime.local.ProductLocal;
import com.bisa.product_order.runtime.data.OrderSource;
import com.bisa.product_order.runtime.data.ProductSource;
import com.bisa.product_order.runtime.mapper.OrderMapper;
import com.bisa.product_order.runtime.mapper.ProductMapper;
import com.bisa.product_order.runtime.serv.ProductOrderProvider;
import com.bisa.product_order.tools.error.ErrorException;

@Stateless(name = ProductOrderProvider.NAME)
@Local(ProductOrderProvider.class)
public class ProductOrderImpl implements ProductOrderProvider {

    @EJB
    private ProductLocal productLocal;

    @EJB
    private OrderLocal orderLocal;

    @Override
    public ProductSource createProduct(ProductSource productSource) throws ErrorException {
        Product product = ProductMapper.mapperToProduct(productSource);
        product = productLocal.create(product);
        return ProductMapper.mapperToProductSource(product);
    }

    @Override
    public ProductSource updateProduct(ProductSource productSource) throws ErrorException {
        Product product = ProductMapper.mapperToProduct(productSource);
        product = productLocal.update(product);
        return ProductMapper.mapperToProductSource(product);
    }

    @Override
    public Boolean deleteProduct(ProductSource productSource) throws ErrorException {
        Product product = ProductMapper.mapperToProduct(productSource);
        Boolean result = productLocal.delete(product);
        return result;
    }

    @Override
    public List<ProductSource> productList() throws ErrorException {
        List<Product> productList = productLocal.list();
        return ProductMapper.mapperToProductSourceList(productList);
    }

    @Override
    public List<ProductSource> productListByOrder(OrderSource orderSource) throws ErrorException {
        Order order = OrderMapper.mapperToOrder(orderSource);
        List<Product> productList = productLocal.listByOrder(order);
        return ProductMapper.mapperToProductSourceList(productList);
    }

    @Override
    public OrderSource createOrder(OrderSource orderSource) throws ErrorException {
        Order order = OrderMapper.mapperToOrder(orderSource);
        order = orderLocal.create(order);
        return OrderMapper.mapperToOrderSource(order);
    }

    @Override
    public OrderSource updateOrder(OrderSource orderSource) throws ErrorException {
        Order order = OrderMapper.mapperToOrder(orderSource);
        order = orderLocal.update(order);
        return OrderMapper.mapperToOrderSource(order);
    }

    @Override
    public Boolean deleteOrder(OrderSource orderSource) throws ErrorException {
        Order order = OrderMapper.mapperToOrder(orderSource);
        Boolean result = orderLocal.delete(order);
        return result;
    }

    @Override
    public List<OrderSource> orderList() throws ErrorException {
        List<Order> orderList = orderLocal.list();
        return OrderMapper.mapperToOrderSourceList(orderList);
    }

    @Override
    public List<OrderSource> orderListByProduct(ProductSource productSource) throws ErrorException {
        Product product = ProductMapper.mapperToProduct(productSource);
        List<Order> orderList = orderLocal.listByProuct(product);
        return OrderMapper.mapperToOrderSourceList(orderList);
    }

}
