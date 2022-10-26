package br.com.fiquer.farm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiquer.farm.dto.RoleDTO;
import br.com.fiquer.farm.dto.user.UserDTO;
import br.com.fiquer.farm.dto.user.UserDTOCattle;
import br.com.fiquer.farm.dto.user.UserDTOFarm;
import br.com.fiquer.farm.dto.user.UserInsertDTO;
import br.com.fiquer.farm.entities.Role;
import br.com.fiquer.farm.entities.User;
import br.com.fiquer.farm.repositories.RoleRepository;
import br.com.fiquer.farm.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	@Autowired
	private RoleRepository roleRepository;

	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow();
		return new UserDTO(entity);
	}

	@Transactional(readOnly = true)
	public List<UserDTO> findAll() {
		List<User> list = repository.findAll();
		return list.stream().map(x -> new UserDTO(x)).toList();
	}

	@Transactional(readOnly = true)
	public UserDTOCattle findByIdCattle(Long id) {
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow();
		return new UserDTOCattle(entity);
	}
	
	@Transactional(readOnly = true)
	public UserDTOFarm findByIdFarm(Long id) {
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow();
		return new UserDTOFarm(entity);
	}

	@Transactional
	public UserDTO insert(UserInsertDTO dto) {
		User entity = new User();
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.getRoles().clear();
		for (RoleDTO roleDto : dto.getRoles()) {
			Role role = roleRepository.getReferenceById(roleDto.getId());
			entity.getRoles().add(role);
		}
		entity = repository.save(entity);
		return new UserDTO(entity);
	}
}
