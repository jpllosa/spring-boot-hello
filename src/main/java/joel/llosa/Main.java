package joel.llosa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main implements CommandLineRunner {

	@Autowired
	ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}

	public void run(String... args) throws Exception {
		HiSpringBoot hs = (HiSpringBoot) context.getBean("hiSpringBoot");
		hs.getMessage();
	}

	@Bean
	public HiSpringBoot hiSpringBoot() {
		HiSpringBoot hsb = new HiSpringBoot();
		hsb.setMessage("Welcome to Spring Boot!");

		return hsb;
	}

}
