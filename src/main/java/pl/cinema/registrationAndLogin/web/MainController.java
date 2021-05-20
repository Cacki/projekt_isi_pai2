package pl.cinema.registrationAndLogin.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("message", " WIADOMOSC Z CONTROLLERA");
		return "test";
	}

	@GetMapping("/user-account")
	public String userAccount() {
		return "user-account";
	}

	@GetMapping("/repertuar")
	public String repertuar() {
		return "repertuar";
	}

	@GetMapping("/prices")
	public String prices() {
		return "prices";
	}

	@GetMapping("/special-offers")
	public String special() {
		return "special-offers";
	}

	@GetMapping("/events")
	public String events() {
		return "events";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
}
