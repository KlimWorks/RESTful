package com.bell.restful.resources;

import static java.util.Collections.singletonMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * The REST resource implementation class.
 */

@Path("resources")
public class RESTfulResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {
        Map<String, String> response = singletonMap("message",
        "Building Web Services with Java EE 8.");
    return Response.ok(response).build();
    }


}
