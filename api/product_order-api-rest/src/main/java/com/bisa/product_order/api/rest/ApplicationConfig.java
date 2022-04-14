package com.bisa.product_order.api.rest;

import javax.ws.rs.core.Application;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author brian.barrera
 */
@javax.ws.rs.ApplicationPath("/v1")
public class ApplicationConfig extends Application{
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources = new HashSet<>();
        addRestResourceClasses(resources);
        //resources.add(com.bisa.product_order.api.rest.ProductService.class);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources){
        resources.add(com.bisa.product_order.api.rest.FilterService.class);
        resources.add(com.bisa.product_order.api.rest.OrderService.class);
        resources.add(com.bisa.product_order.api.rest.ProductService.class);
    }
}
