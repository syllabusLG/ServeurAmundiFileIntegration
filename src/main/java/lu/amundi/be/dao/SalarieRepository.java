package lu.amundi.be.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.amundi.be.entities.Salarie;

public interface SalarieRepository extends JpaRepository<Salarie, String> {

}
