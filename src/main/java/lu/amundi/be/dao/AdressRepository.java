package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Adresse;

public interface AdressRepository extends JpaRepository<Adresse, String> {
	
	@Query("select a from Adresse a where a.street like :x")
	public Page<Adresse> chercher(@Param("x")String mc, Pageable pageable);
}
