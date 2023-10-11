package com.thomas.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thomas.demo.model.Alien;
public interface AlienRepo extends JpaRepository<Alien,Integer> {
	

	List<Alien> findByAlienPlanet(String alienPlanet);

	List<Alien> findByAlienIdGreaterThan(int id);
	
	@Query("from Alien where alienPlanet=?1 order by alienName")
	List<Alien> findByPlanetSorted(String Planet);

}
