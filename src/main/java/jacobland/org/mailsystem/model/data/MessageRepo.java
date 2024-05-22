package jacobland.org.mailsystem.model.data;

import jacobland.org.mailsystem.model.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageRepo {

    public void save(Message message){
        System.out.println("Added");
    }

    public List<Message> findAll() {
        return new ArrayList<Message>();
    }
}
