package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Compte;

/**
 * This interface is a repository for class Compte based on Spring data
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public interface CompteRepository extends JpaRepository<Compte, Long> {
	
	@Query("select cpte from Compte cpte where cpte.typeCompte like :x or cpte.libCompte like :x "
			+ "or cpte.individu.lastName like :x or cpte.individu.firstName like :x")
	public Page<Compte> chercher(@Param("x")String mc, Pageable pageable);

}
