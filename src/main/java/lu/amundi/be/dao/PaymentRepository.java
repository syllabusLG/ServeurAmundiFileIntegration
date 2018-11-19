package lu.amundi.be.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lu.amundi.be.entities.Payment;
/**
 * This interface is a repository for class Payment based on spring data
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public interface PaymentRepository extends JpaRepository<Payment, String> {

	@Query("select p from Payment p where p.bic like :x or p.iban like :x or p.otherPayment like :x  "
			+ " or p.individu.lastName like :x or p.individu.firstName like :x")
	public Page<Payment> chercher(@Param("x")String mc, Pageable pageable);
}
