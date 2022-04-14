package com.bisa.product_order.api.rest;

import com.bisa.product_order.api.data.OrderData;
import com.bisa.product_order.api.data.ProductData;
import com.bisa.product_order.api.serv.OrderServ;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author brian.barrera
 */

@Path("/order")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrderService  {
    
    @EJB(name = OrderServ.NAME)
    private OrderServ productServ;

    @POST
    @Path("/create")
    public Response create(){
        OrderData result= productServ.create(null);
        return Response.status(Response.Status.OK).entity(result).build();
    }

    @POST
    @Path("/edit")
    public Response edit(){
        OrderData result= productServ.edit(null);
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
        List<OrderData>  result= productServ.getList();
        return Response.status(Response.Status.OK).entity(result).build();
    }
}
