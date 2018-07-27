package org.example.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

// Root path for resource method
@Path("/bank")
public class HelloService {

    // HTTP method
    @GET
    // resource path of the request.
    @Path("/{name}")
    /*By using @PathParam anotation we instruct the framework to pass the
    value which comes as the path parameter as the method argument.*/
    public String hello(@PathParam("name") String name) {
        return "Hello " + name;
    }

    @POST
    @Path("/account")
    // Define Message format of the request message
    @Consumes("application/json")
    // Define message format of the response message
    @Produces("application/json")
    /*
       Creating Transaction object and mapping incoming payload to the object is handled by the framework.
       Attributes of the Transaction class should match the request payload attributes.
     */
    public Transaction createTransaction(Transaction transaction) {
        System.out.print(" Post Payload = " + transaction.toString());
        return transaction;

    }

}