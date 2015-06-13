package com.springjersey.oauth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth.provider.OAuthProcessingFilterEntryPoint;

public class OAuthProcessingFilterEntryPointImpl extends OAuthProcessingFilterEntryPoint
{
	public void commence( HttpServletRequest request, HttpServletResponse response, AuthenticationException failure )
			throws IOException, ServletException
	{
		response.setCharacterEncoding( "UTF-8" );
		response.setStatus( HttpServletResponse.SC_UNAUTHORIZED );
		response.setContentType( MediaType.APPLICATION_JSON );

		response.getWriter().println( "{\"Unauthorized\":\"" + failure + "\"}" );
	}
}