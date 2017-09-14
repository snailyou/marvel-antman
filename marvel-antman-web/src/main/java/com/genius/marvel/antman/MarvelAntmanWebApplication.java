package com.genius.marvel.antman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:config/spring/appcontext-antman-*.xml")
public class MarvelAntmanWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelAntmanWebApplication.class, args);
	}
}
