package br.com.fiquer.farm.dto;

import java.io.Serializable;

import br.com.fiquer.farm.entities.Farm;

public class FarmDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String city;

	public FarmDTO() {
	}

	public FarmDTO(Long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public FarmDTO(Farm farm) {
		id = farm.getId();
		name = farm.getName();
		city = farm.getCity();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
