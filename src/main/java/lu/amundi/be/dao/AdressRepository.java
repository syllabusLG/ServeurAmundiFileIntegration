package lu.amundi.be.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.amundi.be.entities.Adresse;

public interface AdressRepository extends JpaRepository<Adresse, String> {

}
