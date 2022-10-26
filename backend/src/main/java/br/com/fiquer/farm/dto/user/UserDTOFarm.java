package br.com.fiquer.farm.dto.user;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import br.com.fiquer.farm.dto.FarmDTO;
import br.com.fiquer.farm.entities.User;

public class UserDTOFarm extends UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Set<FarmDTO> farms = new HashSet<>();

	public UserDTOFarm() {
	}

	public UserDTOFarm(User user) {
		super(user);
		user.getFarms().forEach(farm -> this.farms.add(new FarmDTO(farm)));
	}

	public Set<FarmDTO> getFarms() {
		return farms;
	}

}
