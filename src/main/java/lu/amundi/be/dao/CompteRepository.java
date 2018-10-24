package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {
	
	@Query("select cpte from Compte cpte where cpte.typeCompte like :x")
	public Page<Compte> chercher(@Param("x")String mc, Pageable pageable);

}
