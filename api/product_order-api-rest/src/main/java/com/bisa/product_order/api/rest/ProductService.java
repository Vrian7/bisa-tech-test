package com.bisa.product_order.api.rest;

import com.bisa.product_order.api.data.ProductData;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.bisa.product_order.api.serv.ProductServ;
import java.util.List;
import javax.ws.rs.POST;
import com.bisa.product_order.runtime.api.ProductProvider;

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

    @EJB(name = ProductProvider.NAME)
    private ProductProvider prov;

    @GET
    @Path("/demo")
    public String demo(){
        prov.hi();
        return "print demo string prodddct";
    }

    @GET
    @Path("/create")
    public Response create(){
        ProductData  result= productServ.create(null);
        return Response.status(Response.Status.OK).entity(result).build();
    }

    @POST
    @Path("/edit")
    public Response edit(){
        ProductData result= productServ.edit(null);
        return Response.status(Response.Status.OK).entity(result).build();
    }

    @POST
    @Path("/delete")
    public Response delete(){
        Boolean  result= productServ.delete(0L);
        return Response.status(Response.Status.OK).entity(result).build();
    }

    @POST
    @Path("/list")
    public Response list(){
        List<ProductData>  result= productServ.getList();
        return Response.status(Response.Status.OK).entity(result).build();
    }
}
