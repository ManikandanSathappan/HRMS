package com.rubixtek.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {
	@GetMapping("/redirect")
	public void getRedirect(HttpServletResponse resp, HttpServletRequest request) throws IOException {
	 
	 System.out.println("Auth: " + SecurityContextHolder.getContext().getAuthentication());

	 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	 System.out.println("Principal: " + auth.getPrincipal());
	 System.out.println("Authorities: " + auth.getAuthorities()); //get it from here OR
	 System.out.println(request.isUserInRole("ROLE_EMPLOYEE")); // get it from Here as WELL (ONLY IF YOU HAVE A REQUEST)
	 System.out.println("credentials:"+auth.getCredentials());
	 System.out.println("detaisl:"+auth.getDetails());

	 if (request.isUserInRole("ROLE_EMPLOYEE")) {
	  resp.sendRedirect("/attendance/em");
	 } else if (request.isUserInRole("ROLE_ADMIN")) {
	  resp.sendRedirect("/employees/list");
	 }
	}
}