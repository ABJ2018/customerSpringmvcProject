package com.java.springConfig;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@EnableWebMvc//tells it is spring mvc configuaration
@Configuration// make bean configuration
@ComponentScan(basePackages = {"com.java.*"})// go to pkg and  scan component scan @service @Repositry @controller scan all components
public class SpringConfig  extends WebMvcConfigurerAdapter
{
	@Bean
	public ViewResolver viewResolver(){
		//to resolve which view have to show
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();//child class of view Resolver
		viewResolver.setViewClass(JstlView.class);//class lib provides viewresovler
		viewResolver.setPrefix("/WEB-INF/");//all view
		viewResolver.setSuffix(".jsp");//all extension
		return viewResolver;
	}
	
	@Bean
	public BasicDataSource getBasicDataSource(){
		//database property set name
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/test");
		bds.setUsername("root");
		bds.setPassword("root123");
		return bds;
	}

	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(getBasicDataSource());
		lsfb.setPackagesToScan(new String[]{"com.java.entites"});
		lsfb.setHibernateProperties(getProperties());

		return lsfb;
	}
	@Bean
	public Properties getProperties() {
		Properties p = new Properties();
		p.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		p.put("hibernate.hbm2ddl.auto", "update");
		p.put("hibernate.show_sql", "true");
		p.put("hibernate.format_sql", "true");
		return p;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		super.configureDefaultServletHandling(configurer);
		configurer.enable();
	}

}
