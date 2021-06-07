package org.acme.getting.started;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface GreetingInterface {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello();

}
