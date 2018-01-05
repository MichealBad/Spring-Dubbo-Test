package com.client;

import com.client.service.ConsumService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ClientApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(ClientApplication.class, args);
		ConsumService consumService = context.getBean(ConsumService.class);
		System.out.println("here..........................................");
		System.out.println(consumService.echo("anagrammatically"));
		System.out.println("and...........................................");
	}
}
