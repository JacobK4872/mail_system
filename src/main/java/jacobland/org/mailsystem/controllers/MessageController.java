package jacobland.org.mailsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

    @GetMapping("message")
    @ResponseBody
    public String message() {
        return "Hello, Spring!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

//    int result = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM MAIL_SYSTEM", integer.class);

}
