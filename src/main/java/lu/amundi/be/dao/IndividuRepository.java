package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Individu;
/**
 * This interface is a repository for class Individu based on spring data
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public interface IndividuRepository extends JpaRepository<Individu, String> {

	@Query("select ind from Individu ind where ind.nui like :x or ind.lastName like :x or ind.firstName like :x")
	public Page<Individu> chercher(@Param("x")String mc, Pageable pageable);
}
