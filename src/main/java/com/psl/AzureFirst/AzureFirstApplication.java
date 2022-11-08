package com.psl.AzureFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureFirstApplication {

	@GetMapping("/message")
	public String message() {
		return "Hi !! This is the First Azure Deployment";
	}
	 
	public static void main(String[] args) {
		SpringApplication.run(AzureFirstApplication.class, args);
	}

}
