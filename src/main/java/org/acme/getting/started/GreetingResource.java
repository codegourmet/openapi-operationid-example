package org.acme.getting.started;

import javax.ws.rs.Path;

@Path("/hello")
public class GreetingResource implements GreetingInterface {

    public String hello() {
        return "Hello RESTEasy";
    }

}
