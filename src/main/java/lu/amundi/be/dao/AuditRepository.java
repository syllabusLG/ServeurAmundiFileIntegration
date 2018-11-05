package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Audit;
/**
 * 
 * @author AbousyllabaNdiaye
 *
 */
public interface AuditRepository extends JpaRepository<Audit, Long> {

	@Query("select au from Audit au where au.username like :x")
	public Page<Audit> chercher(@Param("x")String mc, Pageable pageable);
}
