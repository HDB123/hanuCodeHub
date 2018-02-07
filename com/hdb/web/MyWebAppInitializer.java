package com.hdb.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	   @Override
	   protected Class<?>[] getRootConfigClasses() {
		   System.out.println("calling getRootConfigClasses");
	      return new Class[] {};
	   }

	   @Override
	   protected Class<?>[] getServletConfigClasses() {
		   System.out.println("calling getServletConfigClasses");
		     
	      return new Class[] { WebConfig.class };
	   }

	   @Override
	   protected String[] getServletMappings() {
		   System.out.println("calling getServletMappings");
		   
	      return new String[] { "/" };
	   }
	   
	 
	}