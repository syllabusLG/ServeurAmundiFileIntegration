package lu.amundi.be.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.amundi.be.entities.Individu;

public interface IndividuRepository extends JpaRepository<Individu, String> {

}
