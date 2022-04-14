package com.bisa.product_order.api.rest;

import com.bisa.product_order.api.data.OrderData;
import com.bisa.product_order.api.data.ProductData;
import com.bisa.product_order.api.serv.FilterServ;
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
@Path("/filter")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FilterService {
    
    @EJB(name = FilterServ.NAME)
    private FilterServ productServ;

    @POST
    @Path("/filter")
    public Response list(){
        List<ProductData>  result= productServ.search("");
        return Response.status(Response.Status.OK).entity(result).build();
    }

    @POST
    @Path("/searchOrderByProduct")
    public Response searchByProduct(){
        List<OrderData>  result= productServ.searchByProduct(null);
        return Response.status(Response.Status.OK).entity(result).build();
    }

    @POST
    @Path("/searchProductByOrder")
    public Response searchByOrder(){
        List<ProductData> result= productServ.searchByOrder(null);
        return Response.status(Response.Status.OK).entity(result).build();
    }

}
