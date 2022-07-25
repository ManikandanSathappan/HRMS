package com.rubixtek.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.rubixtek.EmployeeAppSpringApplication;

public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}
	// dispatcher configuration
	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {EmployeeAppSpringApplication.class};
	}

	// servlet-mapping configuration
	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
