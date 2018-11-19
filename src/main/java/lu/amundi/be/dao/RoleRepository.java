package lu.amundi.be.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.amundi.be.entities.Role;
/**
 * This interface is a repository for class Role based on spring data
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	public Role findByName(String name);

}
