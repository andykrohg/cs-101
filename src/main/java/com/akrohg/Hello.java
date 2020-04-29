package com.akrohg;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello!";
    }

    @GET @Path("{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String specialHello(@PathParam("name") String name) {

        // Print name in UPPERCASE
        // name = name.toUpperCase();

        // Print name backwards
        // name = Utils.reverseLetters(name);

        // Shuffle letters
        // name = Utils.shuffleLetters(name);

        return "Hello, " + name + "!";
    }
}