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
@Path("/weather")//http://127.0.0.1:49000/api/weather/
public class api {
    
        @GET
    @Path("/q={city}&mode={mode}")//http://127.0.0.1:49000/api/weather/q=Dublin&mode=json
    public Response getWeather(@PathParam("city") String city, @PathParam("mode") String mode) {
        String apiKey = "&appid=5862c5b7badb7604d908a212edf84826";
        String URL = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&mode=" + mode + apiKey;
        System.out.println(URL);
        Client client = ClientBuilder.newClient();
        Response response = client.target(URL).request().get();
        return response;
    }
}
