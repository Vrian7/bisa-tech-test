package com.bisa.product_order.runntime.local;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.bisa.product_order.product.order.tools.Config.Env;
import com.bisa.product_order.product.order.tools.error.ErrorException;
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

public Order find(Long id) throws ErrorException{
    ErrorException error = new ErrorException("ORDER LOCAL ERROR");
    List<Order> list = new Order();
    String statement = "";
        Query query = em.createQuery(statement);
    list = query.getResultList();
    error.isNullOrEmpty(list, "ORDER");
    error.throwException();
    return list.get(0);
}
}
