package lu.amundi.be.dao;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Audit;
/**
 * This interface is a repository for class Audit based on spring data
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public interface AuditRepository extends JpaRepository<Audit, Long> {

	@Query("select au from Audit au where au.username like :x")
	public Page<Audit> chercher(@Param("x")String mc, Pageable pageable);
	
	@Query("select au from Audit au where au.dateAction between :x and :y")
	public Page<Audit> findAuditByDate(@Param("x")LocalDateTime dateBefore, 
									   @Param("y")LocalDateTime dateAfter, 
									   Pageable pageable);
}
