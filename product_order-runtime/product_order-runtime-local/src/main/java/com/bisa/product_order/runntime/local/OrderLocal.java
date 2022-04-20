package com.bisa.product_order.runntime.local;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.bisa.product_order.product_order.domain.model.Order;
import com.bisa.product_order.product_order.domain.model.Product;
import com.bisa.product_order.tools.Config.Env;
import com.bisa.product_order.tools.error.ErrorException;

import javax.persistence.Query;

/**
 *
 * @author brian.barrera
 */
@Stateless
@LocalBean
public class OrderLocal {
    @PersistenceContext(unitName = Env.PERSISTENCE_UNIT)
    private EntityManager em;

    public Order create(Order order) throws ErrorException {
        ErrorException error = new ErrorException("OrderLocal");
        error.isNull(order, "Order empty");
        error.throwException();
        em.persist(order);
        return order;
    }

    public Order update(Order order) throws ErrorException {
        ErrorException error = new ErrorException("OrderLocal");
        error.isNull(order, "Order empty");
        error.throwException();
        error.isNull(order.getOrderId(), "Order does not exists");
        error.throwException();
        em.merge(order);
        return order;
    }

    public Boolean delete(Order order) throws ErrorException {
        ErrorException error = new ErrorException("OrderLocal");
        error.isNull(order, "Order empty");
        error.throwException();
        error.isNull(order.getOrderId(), "Order does not exists");
        error.throwException();
        em.remove(order);
        return true;
    }

    public List<Order> list() throws ErrorException {
        ErrorException error = new ErrorException("OrderLocal");
        List<Order> list = new ArrayList<>();
        String statement = "SELECT order FROM Order";
        Query query = em.createQuery(statement);
        list = query.getResultList();
        error.isNullOrEmpty(list, "Not products were found");
        error.throwException();
        return list;
    }

    public List<Order> listByProuct(Product product) throws ErrorException {
        ErrorException error = new ErrorException("OrderLocal");
        List<Order> list = new ArrayList<>();
        String statement = "SELECT o FROM Order WHERE o.productList.productId = :productId";
        Query query = em.createQuery(statement);
        query.setParameter("productId", product.getProductId());
        list = query.getResultList();
        error.isNullOrEmpty(list, "Not orders were found");
        error.throwException();
        return list;
    }
}
