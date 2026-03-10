package co.edu.poli.cloudapp.cloudapp.restcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/login")
    public String login() {
        return "login"; 
    }

}
