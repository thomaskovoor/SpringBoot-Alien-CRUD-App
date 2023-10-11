package com.thomas.demo.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Alien {
		


	@Override
	public String toString() {
		return "Alien [AlienId=" + alienId + ", AlienName=" + alienName + ", AlienPlanet=" + alienPlanet + "]";
	}
	public int getAlienId() {
		return alienId;
	}
	public void setAlienId(int AlienId) {
		alienId = AlienId;
	}
	public String getAlienName() {
		return alienName;
	}
	public void setAlienName(String AlienName) {
		alienName = AlienName;
	}
	public String getAlienPlanet() {
		return alienPlanet;
	}
	public void setAlienPlanet(String AlienPlanet) {
		alienPlanet = AlienPlanet;
	}
	@Id
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int alienId;
	@Column
	@Nonnull
	private String alienName;
	@Column
	@Nonnull
	private String alienPlanet;
	

}
