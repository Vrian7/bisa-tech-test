package com.bisa.product_order.api.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author brian.barrera
 */
@Path("/product")
public class ProductService {

    @GET
    @Path("/lists")
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(){
        //return "working with string";
        return Response.status(Response.Status.OK).entity("service working json").build();
    }
}
