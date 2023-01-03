package com.spring.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class OctBatch1Application {

	public static void main(String[] args) {
		SpringApplication.run(OctBatch1Application.class, args);
	}

}
