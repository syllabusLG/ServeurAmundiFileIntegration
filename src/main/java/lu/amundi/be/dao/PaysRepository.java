package lu.amundi.be.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.amundi.be.entities.Pays;

public interface PaysRepository extends JpaRepository<Pays, Long> {

}
