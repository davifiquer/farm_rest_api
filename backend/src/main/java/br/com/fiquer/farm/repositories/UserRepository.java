package br.com.fiquer.farm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiquer.farm.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
