/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam; 
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




					
@Path("/roman") 
public class NumeralToRomanNumeral {
    					
    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_HTML)
  public Response sayHelloWorld(@PathParam("param") int message) {
        RomanNumeralConverter con = new RomanNumeralConverter();
        int input = message;
        Integer.toString(input);
        String getResult = con.IntegerToRomanNumeral(input);
        String output = "<html><body><h1>Number Entered Was " + message + " Converted Number is " + getResult + "</h1></body></html>";
       
    return Response.status(200).entity(output).build(); 
  }
  
  
  
   
  
					
}

