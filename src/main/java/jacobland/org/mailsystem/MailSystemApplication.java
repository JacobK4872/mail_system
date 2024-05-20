package jacobland.org.mailsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MailSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailSystemApplication.class, args);
	}

}
