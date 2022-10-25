package br.com.fiquer.farm.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_vaccine")
public class Vaccine implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant date;
	@ManyToOne
	@JoinColumn(name = "cattle_id")
	private Cattle cattle;

	public Vaccine() {
	}

	public Vaccine(Long id, String name, Instant date, Cattle cattle) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.cattle = cattle;
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

	public Cattle getCattle() {
		return cattle;
	}

	public void setCattle(Cattle cattle) {
		this.cattle = cattle;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vaccine other = (Vaccine) obj;
		return Objects.equals(id, other.id);
	}

}
