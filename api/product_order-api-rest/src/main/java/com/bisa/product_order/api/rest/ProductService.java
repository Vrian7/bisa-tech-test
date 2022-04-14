package com.bisa.product_order.api.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.bisa.product_order.api.serv.ProductServ;

/**
 *
 * @author brian.barrera
 */
@Path("/product")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductService {

    @EJB(name = ProductServ.NAME)
    private ProductServ productServ;

    @GET
    @Path("/lists")
    public Response list(){
        //return "working with string";
        String result= productServ.getList();
        return Response.status(Response.Status.OK).entity(result).build();
    }
}
