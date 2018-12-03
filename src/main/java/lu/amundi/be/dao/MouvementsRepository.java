package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Mouvements;
/**
 * This interface is a repository for class Mouvements based on Spring data
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public interface MouvementsRepository extends JpaRepository<Mouvements, String> {

	@Query("select mvt from Mouvements mvt where mvt.numMouvement like :x or mvt.sens like :x or mvt.refInstrument like :x"
			+ " or mvt.pruInstrument like :x or mvt.nav like :x or mvt.compte.numCompte like :x")
	public Page<Mouvements> chercher(@Param("x")String mc, Pageable pageable);
}
