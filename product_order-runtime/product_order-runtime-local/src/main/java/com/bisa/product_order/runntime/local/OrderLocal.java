package com.bisa.product_order.runntime.local;

/**
 *
 * @author brian.barrera
 */
@Stateless
@LocalBean
public class OrderLocal {
    @PersistenceContetext(Env.PERSITENCE_UNIT)
    private EntityManager em;
}
