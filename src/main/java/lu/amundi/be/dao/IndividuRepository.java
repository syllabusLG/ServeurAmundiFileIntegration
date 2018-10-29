package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Individu;

public interface IndividuRepository extends JpaRepository<Individu, String> {

	@Query("select ind from Individu ind where ind.nui like :x or ind.lastName like :x or ind.firstName like :x")
	public Page<Individu> chercher(@Param("x")String mc, Pageable pageable);
}
