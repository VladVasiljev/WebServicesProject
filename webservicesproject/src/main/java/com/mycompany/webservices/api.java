/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

/**
 *
 * @author Vladislavs Vasiljevs
 */
@Path("/weather")
public class api {
    
        @GET
    @Path("/q={city}&mode={mode}")
    public Response getWeather(@PathParam("city") String city, @PathParam("mode") String mode) {
        String URL = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&mode=" + mode + "&appid=5862c5b7badb7604d908a212edf84826";
        System.out.println(URL);
        Client c = ClientBuilder.newClient();
        Response r = c.target(URL).request().get();
        return r;
    }
}
