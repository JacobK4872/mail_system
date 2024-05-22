package jacobland.org.mailsystem;

import jacobland.org.mailsystem.model.Message;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailSystemApplication {

	public static void main(String[] args) {

        ApplicationContext context = (ApplicationContext) SpringApplication.run(MailSystemApplication.class, args);

        Message message1 = context.get
		message1.setId(12);
		message1.setTitle("Hello");
		message1.setMessage(("Hello, how are you today?"));


	}

}
