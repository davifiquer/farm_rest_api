package br.com.fiquer.farm.dto;

import java.io.Serializable;
import java.time.Instant;

import br.com.fiquer.farm.entities.Vaccine;

public class VaccineDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Instant date;

	public VaccineDTO() {
	}

	public VaccineDTO(Long id, String name, Instant date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public VaccineDTO(Vaccine vaccine) {
		id = vaccine.getId();
		name = vaccine.getName();
		date = vaccine.getDate();
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

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

}
