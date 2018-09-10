package lu.amundi.be.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.amundi.be.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
