package com.indra.tms.service;

import org.keycloak.adapters.springsecurity.KeycloakSecurityComponents;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.cache.CacheMetricsAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Main application class.
 */
@SpringBootApplication
@EnableJms
@EnableCaching
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.indra.tms", "es.adif.sit" }, 
	basePackageClasses = {
		KeycloakSecurityComponents.class }, 
	excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.keycloak.adapters.springsecurity.management.HttpSessionManager"))
@EnableAutoConfiguration(exclude = {CacheMetricsAutoConfiguration.class}) 
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

<<<<<<< HEAD
public void feature2_1 {
=======
public void f3 {
>>>>>>> fd5db2823f608e0f2f52b3429811ba1d933901db
	//Nothing
}