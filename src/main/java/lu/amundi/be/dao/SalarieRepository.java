package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Salarie;

public interface SalarieRepository extends JpaRepository<Salarie, String> {

	@Query("select s from Salarie s where s.employeeId like :x")
	public Page<Salarie> chercher(@Param("x")String mc, Pageable pageable);
}
