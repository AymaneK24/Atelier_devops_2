package ma.ac.emi.devops;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}

	//Version 1.2 modifications
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("Hello World v1.2");
			//Version 2 modifications
			System.out.println("Hello World v2");
		};
	}

}
