package br.com.fiquer.farm.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.fiquer.farm.dto.user.UserDTO;
import br.com.fiquer.farm.dto.user.UserDTOCattle;
import br.com.fiquer.farm.dto.user.UserDTOFarm;
import br.com.fiquer.farm.dto.user.UserInsertDTO;
import br.com.fiquer.farm.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<UserDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
		UserDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}

	@GetMapping(value = "/cattle/{id}")
	public ResponseEntity<UserDTOCattle> findByIdCattle(@PathVariable Long id) {
		UserDTOCattle dto = service.findByIdCattle(id);
		return ResponseEntity.ok().body(dto);
	}

	@GetMapping(value = "/farm/{id}")
	public ResponseEntity<UserDTOFarm> findByIdFarm(@PathVariable Long id) {
		UserDTOFarm dto = service.findByIdFarm(id);
		return ResponseEntity.ok().body(dto);
	}

	@PostMapping
	public ResponseEntity<UserDTO> insert(@RequestBody UserInsertDTO dto) {
		UserDTO newDto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newDto.getId()).toUri();
		return ResponseEntity.created(uri).body(newDto);
	}

}
