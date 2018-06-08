package delta.engine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value= {"/","/home"})
	public String home(Model model) {
		model.addAttribute("message", "Flight Reseating Application ");
		return "home";
	}

}
