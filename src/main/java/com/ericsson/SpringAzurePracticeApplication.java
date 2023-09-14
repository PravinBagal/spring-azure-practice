package com.ericsson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzurePracticeApplication {

	@GetMapping("/message")
	public String message()
	{
		return "Congrtas..yur deploy Successfully";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzurePracticeApplication.class, args);
	}

}
