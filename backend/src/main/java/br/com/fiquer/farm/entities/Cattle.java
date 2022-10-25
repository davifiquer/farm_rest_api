package br.com.fiquer.farm.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cattle")
public class Cattle implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String identifier;
	private Double weight;
	private String breed;
	private Double daily_milk_prod;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name = "farm_id")
	private Farm farm;
	@OneToOne
	@JoinColumn(name = "stall_id")
	private Stall stall;
	@OneToMany(mappedBy = "cattle")
	private List<Vaccine> vaccines = new ArrayList<>();

	public Cattle() {
	}

	public Cattle(Long id, String identifier, Double weight, String breed, Double daily_milk_prod, User user, Farm farm,
			Stall stall) {
		super();
		this.id = id;
		this.identifier = identifier;
		this.weight = weight;
		this.breed = breed;
		this.daily_milk_prod = daily_milk_prod;
		this.user = user;
		this.farm = farm;
		this.stall = stall;
	}

	public List<Vaccine> getVaccines() {
		return vaccines;
	}

	public Stall getStall() {
		return stall;
	}

	public void setStall(Stall stall) {
		this.stall = stall;
	}

	public Farm getFarm() {
		return farm;
	}

	public void setFarm(Farm farm) {
		this.farm = farm;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
		Cattle other = (Cattle) obj;
		return Objects.equals(id, other.id);
	}

}
