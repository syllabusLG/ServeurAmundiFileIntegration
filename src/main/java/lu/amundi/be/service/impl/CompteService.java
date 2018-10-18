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


@Service
@Primary
public class CompteService implements ICrudService<Compte, Long>{
	
	@Autowired
	private CompteRepository compteRepository;

	@Override
	public List<Compte> getAll() {
		// TODO Auto-generated method stub
		return compteRepository.findAll();
	}

	@Override
	public void add(Compte compte) {
		// TODO Auto-generated method stub
		compteRepository.save(compte);
	}

	@Override
	public void update(Compte compte) {
		// TODO Auto-generated method stub
		compteRepository.save(compte);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Compte compte = new Compte();
		compte.setNumCompte(id);
		compteRepository.delete(compte);
	}

	@Override
	public void saveAll(Iterable<Compte> iterable) {
		// TODO Auto-generated method stub
		compteRepository.saveAll(iterable);
	}

	@Override
	public Optional<Compte> findOne(Long id) {
		// TODO Auto-generated method stub
		return compteRepository.findById(id);
	}

	@Override
	public Page<Compte> search(String mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
