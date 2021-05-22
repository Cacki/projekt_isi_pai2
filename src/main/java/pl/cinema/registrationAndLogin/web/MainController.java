package pl.cinema.registrationAndLogin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.cinema.registrationAndLogin.repository.MovieRepository;
import pl.cinema.registrationAndLogin.repository.MovieScreeningRepository;
import pl.cinema.registrationAndLogin.repository.ScreeningRepository;
import pl.cinema.registrationAndLogin.web.dto.ScreeningEntity;

import java.util.ArrayList;

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

	@Autowired
	private ScreeningRepository screeningRepository;
	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private MovieScreeningRepository movieScreeningRepository;
	@RequestMapping("/screening")
	public String getScreenings(Model model)
	{
		/*ArrayList<ScreeningEntity> fillScreening = new ArrayList<ScreeningEntity>();
		model.addAttribute("screeningEntity",fillScreening);
		fillScreening = screeningRepository.findAll();*/
		model.addAttribute("movieEntity", movieRepository.findAll());
		model.addAttribute("screeningEntity",screeningRepository.findAll());
		model.addAttribute("movieScreeningEntity",movieScreeningRepository.findFilled());

		return "admin";
	}

}
