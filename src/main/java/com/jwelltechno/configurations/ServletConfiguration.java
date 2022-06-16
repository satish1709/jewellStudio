package com.jwelltechno.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.jwelltechno"})
public class ServletConfiguration {
	
	@Bean
	public InternalResourceViewResolver comfigServlet() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setSuffix(".jsp");
		viewResolver.setPrefix("/views/api/");
		return viewResolver;
	}
}
