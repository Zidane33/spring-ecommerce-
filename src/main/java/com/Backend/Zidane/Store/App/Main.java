package com.Backend.Zidane.Store.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.Backend.Zidane.Store.App")
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
