package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.CompteRepository;
import lu.amundi.be.entities.Compte;
import lu.amundi.be.service.ICrudService;

/**
 * This service uses the generic interface ICrudService to implement all crud operation according to Compte
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Service
@Primary
public class CompteService implements ICrudService<Compte, String>{
	
	@Autowired
	private CompteRepository compteRepository;

	@Override
	public List<Compte> getAll() {
		return compteRepository.findAll();
	}

	@Override
	public void add(Compte compte) {
		compteRepository.save(compte);
	}

	@Override
	public void update(Compte compte) {
		compteRepository.save(compte);
	}

	@Override
	public void delete(String id) {
		Compte compte = new Compte();
		compte.setNumCompte(id);
		compteRepository.delete(compte);
	}

	@Override
	public void saveAll(Iterable<Compte> iterable) {
		compteRepository.saveAll(iterable);
	}

	@Override
	public Optional<Compte> findOne(String id) {
		return compteRepository.findById(id);
	}

	public Page<Compte> search(String mc, Pageable pageable) {
		return compteRepository.chercher(mc, pageable);
	}

}
