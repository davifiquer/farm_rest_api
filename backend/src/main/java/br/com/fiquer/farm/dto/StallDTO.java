package br.com.fiquer.farm.dto;

import java.io.Serializable;

import br.com.fiquer.farm.entities.Stall;

public class StallDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String sector;
	private FarmDTO farm;
	private CattleDTO cattle;

	public StallDTO() {
	}

	public StallDTO(Long id, String sector, FarmDTO farm, CattleDTO cattle) {
		super();
		this.id = id;
		this.sector = sector;
		this.farm = farm;
		this.cattle = cattle;
	}

	public StallDTO(Stall stall) {
		id = stall.getId();
		sector = stall.getSector();
		farm = new FarmDTO(stall.getFarm());
		cattle = new CattleDTO(stall.getCattle());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public FarmDTO getFarm() {
		return farm;
	}

	public void setFarm(FarmDTO farm) {
		this.farm = farm;
	}

	public CattleDTO getCattle() {
		return cattle;
	}

	public void setCattle(CattleDTO cattle) {
		this.cattle = cattle;
	}

}
