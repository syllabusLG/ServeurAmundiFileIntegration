package lu.amundi.be.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.amundi.be.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);

}
