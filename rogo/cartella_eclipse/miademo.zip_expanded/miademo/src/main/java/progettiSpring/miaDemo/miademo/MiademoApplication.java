package progettiSpring.miaDemo.miademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("progettiSpring.miaDemo")
public class MiademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiademoApplication.class, args);
		System.out.println("App in Ascolt...");
	}

}
