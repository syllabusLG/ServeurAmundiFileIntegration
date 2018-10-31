package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);
	@Query("select u from User u where u.id = :x")
	public User findByIdUser(@Param("x")Long id);
	@Query("select u from User u where u.username like :y")
	public Page<User> chercher(@Param("y")String mc, Pageable pageable);

}
