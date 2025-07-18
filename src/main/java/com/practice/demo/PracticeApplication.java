package com.practice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		SpringApplication.run(PracticeApplication.class, args);
		ApplicationContext container= new ClassPathXmlApplicationContext("config.xml");
		 Engine engine1 = container.getBean("engine1", Engine.class);
		 engine1.startEngine();
		
		/*
		 * What is the purpose of SpringApplication.run(...)? 
		 
		 * Spring Boot performs several tasks behind the scenes:		
		 * Bootstraps the application	 
		 * Sets up the Spring context (ApplicationContext).		 
		 * Starts the Spring IoC (Inversion of Control) container.		 
		 * Scans for components		 
		 * Automatically finds @Component, @Service, @Repository, @Controller, etc. in the package and subpackages of the main class.		
		 * Applies auto-configuration	
		 * Based on your classpath and dependencies (e.g., adds Tomcat if spring-boot-starter-web is present).		 * 
		 * Runs the embedded server (if web app)		 * 
		 * Starts an embedded Tomcat, Jetty, or Undertow server on the default port		 
		 * Handles command-line arguments		 * 
		 * Passes args to the application (for profiles, parameters, etc.).
		 */
				
	}

}
