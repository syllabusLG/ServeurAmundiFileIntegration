package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.MouvementsRepository;
import lu.amundi.be.entities.Mouvements;
import lu.amundi.be.service.ICrudService;

/**
 * This service uses the generic interface ICrudService to implement all crud operations according to Mouvements
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Service
@Primary
public class MouvementsService implements ICrudService<Mouvements, String> {

	@Autowired
	private MouvementsRepository mouvementsRepository;
	
	@Override
	public List<Mouvements> getAll() {
		return mouvementsRepository.findAll();
	}

	@Override
	public void add(Mouvements mouvement) {
		mouvementsRepository.save(mouvement);
	}

	@Override
	public void update(Mouvements mouvement) {
		mouvementsRepository.save(mouvement);
	}

	@Override
	public void delete(String id) {
		Mouvements mouvements = new Mouvements();
		mouvements.setNumMouvement(id);
		mouvementsRepository.delete(mouvements);
	}

	@Override
	public void saveAll(Iterable<Mouvements> iterable) {
		mouvementsRepository.saveAll(iterable);
	}

	@Override
	public Optional<Mouvements> findOne(String id) {
		return mouvementsRepository.findById(id);
	}

	@Override
	public Page<Mouvements> search(String mc, Pageable pageable) {
		return mouvementsRepository.chercher(mc, pageable);
	}

}
