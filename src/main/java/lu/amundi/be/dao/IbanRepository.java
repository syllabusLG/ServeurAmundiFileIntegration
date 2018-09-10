package lu.amundi.be.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.amundi.be.entities.Iban;

public interface IbanRepository extends JpaRepository<Iban, Long> {

}
