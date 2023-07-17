package com.alghom.cardme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardmeApplication {
	public static void main(String[] args) {
		System.out.println("___________________\nConsole Application\n___________________");
		ConsoleApplication.run();
		SpringApplication.run(CardmeApplication.class, args);
	}
}
