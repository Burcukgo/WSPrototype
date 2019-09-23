package com.calisma.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@ComponentScan(value = {"userRest", "com.calisma.restapi" }) // bu paket altındaki sınıfları Spring olarak çalıştır.
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	   @Bean
	    public ServletRegistrationBean dispatcherRegistration() {
	        return new ServletRegistrationBean(dispatcherServlet());
	    }
	    @Bean(name = DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME)
	    public DispatcherServlet dispatcherServlet() {
	        return new LoggableDispatcherServlet();
	    }

}
