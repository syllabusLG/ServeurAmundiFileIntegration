package lu.amundi.be.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Compte;
import lu.amundi.be.entities.Individu;

/**
 * This interface is a repository for class Compte based on Spring data
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public interface CompteRepository extends JpaRepository<Compte, String> {
	
	@Query("select cpte from Compte cpte where cpte.typeCompte like :x or cpte.libCompte like :x "
			+ "or cpte.individu.lastName like :x or cpte.individu.firstName like :x")
	public Page<Compte> chercher(@Param("x")String mc, Pageable pageable);
	
	@Query("select cpte from Compte cpte where cpte.individu.nui like :x")
	public List<Compte> findCompteByIndividu(@Param("x")String nui);

}
