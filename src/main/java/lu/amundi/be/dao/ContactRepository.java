package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Contact;
/**
 * This interface is a repository for class contact based on spring data
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public interface ContactRepository extends JpaRepository<Contact, String> {
	
	@Query("select ct from Contact ct where ct.businessPhone like :x or ct.homePhone like :x"
			+ " or ct.cellPhone like :x or ct.individu.lastName like :x or ct.individu.firstName like :x")
	public Page<Contact> chercher(@Param("x")String mc, Pageable pageable);
}
