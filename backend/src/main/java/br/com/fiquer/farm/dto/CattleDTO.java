package br.com.fiquer.farm.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.fiquer.farm.entities.Cattle;

public class CattleDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String identifier;
	private Double weight;
	private String breed;
	private Double daily_milk_prod;
	private List<VaccineDTO> vaccines = new ArrayList<>();

	public CattleDTO() {
	}

	public CattleDTO(Long id, String identifier, Double weight, String breed, Double daily_milk_prod) {
		super();
		this.id = id;
		this.identifier = identifier;
		this.weight = weight;
		this.breed = breed;
		this.daily_milk_prod = daily_milk_prod;
	}

	public CattleDTO(Cattle cattle) {
		id = cattle.getId();
		identifier = cattle.getIdentifier();
		weight = cattle.getWeight();
		breed = cattle.getBreed();
		daily_milk_prod = cattle.getDaily_milk_prod();
		cattle.getVaccines().forEach(vaccine -> this.vaccines.add(new VaccineDTO(vaccine)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Double getDaily_milk_prod() {
		return daily_milk_prod;
	}

	public void setDaily_milk_prod(Double daily_milk_prod) {
		this.daily_milk_prod = daily_milk_prod;
	}

	public List<VaccineDTO> getVaccines() {
		return vaccines;
	}

}
