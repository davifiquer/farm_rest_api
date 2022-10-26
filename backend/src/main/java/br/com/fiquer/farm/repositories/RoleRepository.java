package br.com.fiquer.farm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiquer.farm.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
}
