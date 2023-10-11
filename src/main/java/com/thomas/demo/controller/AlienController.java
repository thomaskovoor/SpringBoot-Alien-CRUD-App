package com.thomas.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.thomas.demo.dao.AlienRepo;
import com.thomas.demo.model.Alien;

@Controller
public class AlienController {
	
	@GetMapping("/")
	public String home() {
		return "home.jsp";
		
	}
	
	@Autowired
	AlienRepo repo;
	
	@PostMapping("/addAlien")
	public String addAlien( Alien alien) {
		
		repo.save(alien);
		
		return "home.jsp";
	}
	
	@GetMapping("/getAlien")
	public ModelAndView getAlien(Integer alienId) {
		
		ModelAndView mv = new ModelAndView("ShowAlien.jsp");
		Alien alien;
		alien = repo.findById(alienId).orElse( new Alien());
		mv.addObject(alien);
		
		//System.out.println(repo.findByAlienPlanet("Jupiter"));
		//System.out.println(repo.findByAlienIdGreaterThan(5));
		System.out.println(repo.findByPlanetSorted("Earth"));
		return mv;
		
	}
	@GetMapping("/removeAlien")
	public String deleteAlien(Integer alienId)  {
		
		repo.deleteById(alienId);
		

		return "home.jsp";
		}
	@PostMapping("/updateAlien")
	public String updateAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
		
	}
	
	
	
	
}
