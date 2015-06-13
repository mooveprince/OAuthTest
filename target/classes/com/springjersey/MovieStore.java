package com.springjersey;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

@Component
@Path("/moviestore")
@PreAuthorize("hasRole('ROLE_OAUTH')")
public class MovieStore {

	  @GET
	  @Path("/rentals")
	  @Produces(MediaType.APPLICATION_JSON)
	  public ArrayList<Rental> getRentalInfo ( ) {
		  System.out.println("Getting Movie details");
		  
		  ArrayList<Rental> rentalArray = new ArrayList<Rental>();
		  
		  Rental rental1  = new Rental ( );
		  rental1.setMovieName("The Shawshank Redemption");
		  rental1.setRentPerDay("$1");
		  rental1.setGenere("Drama");
		  rental1.setImdbRating("9");
		  
		  Rental rental2  = new Rental ( );
		  rental2.setMovieName("The Dark Knight");
		  rental2.setRentPerDay("$3");
		  rental2.setGenere("Action");
		  rental2.setImdbRating("9");		  
		  
		  rentalArray.add(rental1);
		  rentalArray.add(rental2);
		  
		  return rentalArray;
		  
	  }
}