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




					
@Path("/converter") 
public class RomanConverter {
    					
    @GET
    @Path("/number-roman={param}")
    @Produces(MediaType.TEXT_HTML)
  public Response NumberToRomanNumeral(@PathParam("param") int message) {
        RomanNumeralConverter con = new RomanNumeralConverter();
        int input = message;
        Integer.toString(input);
        String getResult = con.IntegerToRomanNumeral(input);
        String output = "<html><body><h1>Number Entered Was " + message + " Converted Number is " + getResult + "</h1></body></html>";
       
    return Response.status(200).entity(output).build(); 
  }
  
  
  @GET
  @Path("/roman-number={param}")
  @Produces(MediaType.TEXT_HTML)
  public Response romanNumeralToNumeral(@PathParam("param") String message) {
    RomanNumeralConverter con = new RomanNumeralConverter();
        String str = message.toUpperCase();
        //Integer.parseInt(str);
        int getResult = con.romanToDecimal(str);
        String output = "<html><body><h3>Roman Numeral Entered Was</h3><h1> " + message + "</h1><h3> Converted Roman Numeral to Number is " + getResult + "</h3></body></html>";
					
    return Response.status(200).entity(output).build(); 
  }
}
