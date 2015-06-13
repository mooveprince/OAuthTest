package com.springjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
@Path("/payment")
public class PaymentService {

	@GET
	@Path("testmoove")
	public Response savePayment ( ) {
		return Response.status(200).entity("Jersey is called").build();
	}
}
