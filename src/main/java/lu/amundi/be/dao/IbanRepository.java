package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Iban;

public interface IbanRepository extends JpaRepository<Iban, String> {

	@Query("select i from Iban i where i.iban like :x")
	public Page<Iban> chercher(@Param("x")String mc, Pageable pageable);
}
