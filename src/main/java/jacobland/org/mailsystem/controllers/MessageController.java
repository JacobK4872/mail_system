package jacobland.org.mailsystem.controllers;

import jacobland.org.mailsystem.model.Message;
import jacobland.org.mailsystem.model.data.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageRepo messageRepo;


    @GetMapping("message")
    @ResponseBody
    public Iterable<Message> getAllMessages() {
        return messageRepo.findAll();
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

//    int result = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM MAIL_SYSTEM", integer.class);

}
