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




					
@Path("/converter") //http://127.0.0.1:49000/api/converter/
public class RomanConverter {
    					
    @GET
    @Path("/number-roman={param}")//http://127.0.0.1:49000/api/converter/number-roman=123
    @Produces(MediaType.TEXT_HTML)
  public Response NumberToRomanNumeral(@PathParam("param") int input) {//input == usrs input we then pass the value over to userInput
        RomanNumeralConverter con = new RomanNumeralConverter();
        int userInput = input;
        Integer.toString(userInput);
        String getResult = con.IntegerToRomanNumeral(userInput);
        String output =  "<html><body><h3>Number Entered  Was</h3><h1> " + input + "</h1><h3> Converted Number to Roman Numeral is " + getResult + "</h3></body></html>";
       
    return Response.status(200).entity(output).build(); 
  }
  
  
  @GET
  @Path("/roman-number={param}")//http://127.0.0.1:49000/api/converter/roman-number=MM
  @Produces(MediaType.TEXT_HTML)
  public Response romanNumeralToNumeral(@PathParam("param") String input) {//input == users input we then pass the value over to usersString
    RomanNumeralConverter con = new RomanNumeralConverter();
        String usersString = input.toUpperCase();
        //Integer.parseInt(str);
        int getResult = con.romanToDecimal(usersString);
        String output = "<html><body><h3>Roman Numeral Entered Was</h3><h1> " + input + "</h1><h3> Converted Roman Numeral to Number is " + getResult + "</h3></body></html>";
					
    return Response.status(200).entity(output).build(); 
  }
}
