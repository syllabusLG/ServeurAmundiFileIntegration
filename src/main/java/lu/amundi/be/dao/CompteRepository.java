package lu.amundi.be.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.amundi.be.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
