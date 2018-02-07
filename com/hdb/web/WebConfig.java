package com.hdb.web;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.taglibs.standard.extra.spath.RelativePath;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.AbstractEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.hdb.web.dto.User;

/**
 * 
 * @author HDB
 *
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.hdb.web" })
public class WebConfig extends WebMvcConfigurationSupport {

	@Bean
	public InternalResourceViewResolver resolver() {
		System.out.println("calling InternalResourceViewResolver");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	public MessageSource messageSource() {
		System.out.println("calling MessageSource");
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("messages");
		return source;
	}

	@Bean
	public LocalSessionFactoryBean factory() {
		System.out.println("calling LSFB");
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();

		/*
		 * <bean id="sessionFactory"
		 * class="org.springframework.orm.hibernate5.LocalSessionFactoryBean"> <property
		 * name="configLocations" value="hibernate.cfg.xml"></property> </bean>
		 */

	
//		Resource resource = new PathResource("E:\\Java Jars\\Framework\\hibernate.cfg.xml");
		Resource resource=new ClassPathResource("hibernate.cfg.xml");
		
		bean.setConfigLocations(resource);
		 

	/*	Properties properties = new Properties();
		properties.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/universal");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty("show_sql", "true");
		properties.setProperty("hbm2ddl.auto", "update");
		bean.setAnnotatedClasses(User.class);
		bean.setAnnotatedClasses(languages.class);
		bean.setHibernateProperties(properties);
*/
		  
		  
		  
		  
		  
		  
		  
		return bean;

	}

	
/*	 @Bean
	    public AbstractEntityManagerFactoryBean entityManagerFactory() {
	       
		 
		 DriverManagerDataSource dataSource=new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/universal");
			dataSource.setUsername("hdb");
			dataSource.setPassword("");
		 
		 
		 LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
	        entityManagerFactory.setDataSource(dataSource);
	        entityManagerFactory.setPackagesToScan("com.hdb.web");
	        entityManagerFactory.setPersistenceProvider(new HibernatePersistenceProvider());
	        entityManagerFactory.getJpaPropertyMap().put("hibernate.hbm2ddl.auto", "validate");
	      
	        entityManagerFactory.get
	        
	        return entityManagerFactory;
	    }
	*/
	
	

}