package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Position;
/**
 * This interface is a repository for class Position based on spring data
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public interface PositionRepository extends JpaRepository<Position, String> {
	
	@Query("select p from Position p where p.refInstrument like :x or p.pruInstrument like :x"
			+ " or p.compte.numCompte like :x")
	public Page<Position> chercher(@Param("x")String mc, Pageable pageable);

}
