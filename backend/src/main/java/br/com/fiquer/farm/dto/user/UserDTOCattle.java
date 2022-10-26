package br.com.fiquer.farm.dto.user;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import br.com.fiquer.farm.dto.CattleDTO;
import br.com.fiquer.farm.entities.User;

public class UserDTOCattle extends UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Set<CattleDTO> cattle = new HashSet<>();
	
	public UserDTOCattle() {
	}
	
	public UserDTOCattle(User user) {
		super(user);
		user.getCattle().forEach(cattle -> this.cattle.add(new CattleDTO(cattle)));
	}

	public Set<CattleDTO> getCattle() {
		return cattle;
	}
}
