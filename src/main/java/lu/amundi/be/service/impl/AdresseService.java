package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.AdressRepository;
import lu.amundi.be.entities.Adresse;
import lu.amundi.be.service.ICrudService;
/**
 * This service uses the generic interface ICrudService to implement all crud operation according to Adresse
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Service
@Primary
public class AdresseService implements ICrudService<Adresse, String> {

	@Autowired
	private AdressRepository adressRepository;
	
	@Override
	public List<Adresse> getAll() {
		return adressRepository.findAll();
	}

	@Override
	public void add(Adresse adresse) {
		adressRepository.save(adresse);
	}

	@Override
	public void update(Adresse adresse) {
		adressRepository.save(adresse);
	}

	@Override
	public void delete(String id) {
		Adresse adresse = new Adresse();
		adresse.setId(id);
		adressRepository.delete(adresse);
	}

	@Override
	public void saveAll(Iterable<Adresse> iterable) {
		adressRepository.saveAll(iterable);
	}

	@Override
	public Optional<Adresse> findOne(String id) {
		return adressRepository.findById(id);
	}

	@Override
	public Page<Adresse> search(String mc, Pageable pageable) {
		return adressRepository.chercher(mc, pageable);
	}

}
