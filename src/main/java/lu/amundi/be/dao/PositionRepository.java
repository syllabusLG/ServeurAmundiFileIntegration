package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Positions;
/**
 * This interface is a repository for class Position based on spring data
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public interface PositionRepository extends JpaRepository<Positions, Long> {
	
	@Query("select p from Positions p where p.instruments.code like :x or p.pruInstrument like :x"
			+ " or p.compte.numCompte like :x")
	public Page<Positions> chercher(@Param("x")String mc, Pageable pageable);
	
	/*@Query("select p from Positions p where p.idPosition like '%my_default%'")
	public List<Positions> defaultPositions();*/
	
	@Query("select p from Positions p where p.instruments.code like :x")
	public Positions findPositionByCodeInstrument(@Param("x")String code);

}
