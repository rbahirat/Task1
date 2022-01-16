package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SpringbootCrudHibernateExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudHibernateExample1Application.class, args);
	}

}
