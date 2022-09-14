package tr.com.metea.baseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class BaseServiceApplication {

	@PostConstruct
	public void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("Turkey"));
	}

	public static void main(String[] args) {
		SpringApplication.run(BaseServiceApplication.class, args);
	}

}
