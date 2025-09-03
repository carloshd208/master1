package com.unir.products;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}
        
        @Bean
    public CommandLineRunner checkEnv() {
        return args -> {
            System.out.println("MYSQLHOST: " + System.getenv("MYSQLHOST"));
            System.out.println("MYSQLUSER: " + System.getenv("MYSQLUSER"));
            System.out.println("MYSQLDATABASE: " + System.getenv("MYSQLDATABASE"));
            System.out.println("MYSQLPORT: " + System.getenv("MYSQLPORT"));
        };
    }

}
