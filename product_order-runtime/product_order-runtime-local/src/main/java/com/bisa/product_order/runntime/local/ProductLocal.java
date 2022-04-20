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
public class ProductLocal {
    @PersistenceContext(unitName = Env.PERSISTENCE_UNIT)
    private EntityManager em;

    public Product create(Product product) throws ErrorException {
        ErrorException error = new ErrorException("ProductLocal");
        error.isNull(product, "Product empty");
        error.throwException();
        em.persist(product);
        return product;
    }

    public Product update(Product product) throws ErrorException {
        ErrorException error = new ErrorException("ProductLocal");
        error.isNull(product, "Product empty");
        error.throwException();
        error.isNull(product.getProductId(), "Product does not exists");
        error.throwException();
        em.merge(product);
        return product;
    }

    public Boolean delete(Product product) throws ErrorException {
        ErrorException error = new ErrorException("ProductLocal");
        error.isNull(product, "Product empty");
        error.throwException();
        error.isNull(product.getProductId(), "Product does not exists");
        error.throwException();
        em.remove(product);
        return true;
    }

    public List<Product> list() throws ErrorException {
        ErrorException error = new ErrorException("ProductLocal");
        List<Product> list = new ArrayList<>();
        String statement = "SELECT p FROM Product";
        Query query = em.createQuery(statement);
        list = query.getResultList();
        error.isNullOrEmpty(list, "Not products were found");
        error.throwException();
        return list;
    }

    public List<Product> listByOrder(Order order) throws ErrorException {
        ErrorException error = new ErrorException("ProductLocal");
        List<Product> list = new ArrayList<>();
        String statement = "SELECT p FROM Product";
        Query query = em.createQuery(statement);
        list = query.getResultList();
        error.isNullOrEmpty(list, "Not products were found");
        error.throwException();
        return list;
    }
}
