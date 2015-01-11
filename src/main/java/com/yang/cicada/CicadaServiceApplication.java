package com.yang.cicada;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class CicadaServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CicadaServiceApplication.class, args);
		
		/*
		 * When Actuator is added to pom.xml, the beans can be inspected at endpoint http://localhost:8080/beans
		 * 
		 * See http://docs.spring.io/spring-boot/docs/1.1.10.RELEASE/reference/htmlsingle/#production-ready
		 * 
		 * *** Make sure these endpoints are guarded for SECURITY! ***
		 */
//		System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for (String beanName : beanNames) {
//            System.out.println("***bean=" + beanName);
//        }
	}
}
