package com.javatechnology;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
@Component
public class AuthenticationFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest servletRequest=(HttpServletRequest)request;
		System.out.println("I AM HITTING AUTH SERVER:" +servletRequest.getHeader("Authorization"));
		chain.doFilter(servletRequest, response);
	}

}
