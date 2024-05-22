package jacobland.org.mailsystem;

import jacobland.org.mailsystem.model.Message;
import jacobland.org.mailsystem.model.data.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MailSystemApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(MailSystemApplication.class, args);

//        Message message1 = context.getBean(Message.class);
//		message1.setId(14);
//		message1.setTitle("howdy");
//		message1.setMessage(("howdy, how are you today?"));

		MessageRepo repo = context.getBean(MessageRepo.class);
//		repo.save(message1);

		System.out.println(repo.findAll());


	}

}
