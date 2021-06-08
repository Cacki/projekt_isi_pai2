package pl.cinema.registrationAndLogin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.cinema.registrationAndLogin.repository.MovieRepository;
import pl.cinema.registrationAndLogin.repository.MovieScreeningRepository;
import pl.cinema.registrationAndLogin.repository.ScreeningRepository;
import pl.cinema.registrationAndLogin.web.dto.ScreeningEntity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
		//model.addAttribute("movieEntity", movieRepository.findAll());
	//	model.addAttribute("screeningEntity",screeningRepository.findAll());
		model.addAttribute("movieScreeningEntity",movieScreeningRepository.findFilled());
		return "admin";
	}


	@Autowired
	private MovieRepository movieRepository1;
	@GetMapping(path="/screeningform")
	public String getScreeningForm(Model model){

		model.addAttribute("movieList",movieRepository1.findAll());
		return "screeningform";
	}
	@Autowired
	private ScreeningRepository screeningRepositorySave;
	@Autowired
	private MovieRepository movieRepository2;
	@PostMapping(path="/screeningform")
	public String submitScreeningForm(/*@RequestParam("id") Integer id,*/@RequestParam("date") Date date, @RequestParam("movieId") String movieId,@RequestParam("auditoriumId") Integer auditoriumId, Model model){
		ScreeningEntity screening = new ScreeningEntity();
		//screening.setId(id);
		screening.setScreeningDate(date);
		screening.setMovieId(movieId);
		screening.setAuditoriumId(auditoriumId);
		screeningRepositorySave.save(screening);
		model.addAttribute("movieList",movieRepository2.findAll());
		return "screeningform";
	}


}
