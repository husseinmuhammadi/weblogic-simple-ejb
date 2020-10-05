package com.javastudio.tutorial.j2ee.web.api;

import com.javastudio.tutorial.api.ProductService;
import com.javastudio.tutorial.dto.Product;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/users")
public class UserResource {

    @Inject
    Logger logger;

    @Inject
    ProductService service;

    @GET
    @Path("/list")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response list() {
        logger.info("List of users is going to be populated ...");
        List<Product> products = service.findAll();
        return Response.ok(products).build();
    }
}
