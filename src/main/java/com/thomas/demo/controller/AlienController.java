package com.thomas.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thomas.demo.dao.AlienRepo;
import com.thomas.demo.model.Alien;

@RestController
public class AlienController {
	
@Autowired
AlienRepo repo;

	@GetMapping(path = "/aliens"  /*,produces = "application/xml" for setting type of data returned */)
	public List<Alien> getAllAliens()
	{
		return repo.findAll();
	}

	@GetMapping("/aliens/{alienId}")
	//@ResponseBody no need to mention it if using restcontroller annotation else if using controller annotation use response body annotation
	public Optional<Alien> getAlien(@PathVariable("alienId") int alienId){
		return repo.findById(alienId);
	}

	@PostMapping("/aliens")
	public Alien addAlien(@RequestBody Alien alien){
           repo.save(alien);
		   return alien;
	}

	@DeleteMapping("/aliens/{alienId}") 
	public Alien deleteAlien(@PathVariable int alienId){
          
          Alien alien = repo.findById(alienId).orElse(new Alien());

		  repo.delete(alien);
		  return alien;

	}
	
	@PutMapping(path="/aliens/{alienId}", produces = "application/json")
	public Alien saveOrUpdateAlien(@PathVariable int alienId, @RequestBody Alien alien){
       repo.save(alien);
	   return alien;

	}
	
	
	
	
}
