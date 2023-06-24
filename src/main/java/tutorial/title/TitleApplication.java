package tutorial.title;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TitleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TitleApplication.class, args);
	}



}
