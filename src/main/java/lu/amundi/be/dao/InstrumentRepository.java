package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Instruments;

public interface InstrumentRepository extends JpaRepository<Instruments, String> {

	@Query("select i from Instruments i where i.code like :x or i.nom like :x"
			+ " or i.statut like :x")
	public Page<Instruments> chercher(@Param("x")String mc, Pageable pageable);
}
