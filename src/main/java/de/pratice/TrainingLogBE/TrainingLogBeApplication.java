package de.pratice.TrainingLogBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TrainingLogBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingLogBeApplication.class, args);
	}

	@GetMapping("/test")
	public String hello(){
		return "Endpunkt läuft";
	}

}
