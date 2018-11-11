package com.linkinghack.taco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 
 * @SpringBootApplication combines three other annotations:
 * 	@SpringBootConfiguration: Designate this class as configuration class (java based config of spring)
 *  @EnableAutoConfiguration: Enable auto configuration
 *  @ComponentScan: Scanning @Component, @Controller, @Service ..
 * @author linking
 *
 */
@SpringBootApplication
public class TacoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoApplication.class, args);
	}
}