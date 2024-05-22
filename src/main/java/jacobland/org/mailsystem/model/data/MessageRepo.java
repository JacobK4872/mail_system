package jacobland.org.mailsystem.model.data;

import jacobland.org.mailsystem.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageRepo {

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    private JdbcTemplate template;

    public void save(Message message){

        String sql = "INSERT INTO messages (id, title, message) VALUES (?,?,?)";

        int rows = template.update(sql, message.getId(), message.getTitle(), message.getMessage());
        System.out.println(rows + " row/s affeceted");
    }

    public List<Message> findAll() {
        return new ArrayList<Message>();
    }
}
