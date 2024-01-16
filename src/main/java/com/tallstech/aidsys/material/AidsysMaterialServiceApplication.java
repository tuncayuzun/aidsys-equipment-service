package com.tallstech.aidsys.material;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class AidsysMaterialServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AidsysMaterialServiceApplication.class, args);
	}

}
