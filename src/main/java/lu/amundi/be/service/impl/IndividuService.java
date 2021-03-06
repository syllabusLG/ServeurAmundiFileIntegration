package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.IndividuRepository;
import lu.amundi.be.entities.Individu;
import lu.amundi.be.service.ICrudService;
/**
 * This service uses the generic interface ICrudService to implement all crud operation according to Individu
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Service
@Primary
public class IndividuService implements ICrudService<Individu, String> {

	@Autowired
	private IndividuRepository individuRepository;
	
	@Override
	public List<Individu> getAll() {
		// TODO Auto-generated method stub
		return individuRepository.findAll();
	}

	@Override
	public void add(Individu individu) {
		// TODO Auto-generated method stub
		individuRepository.save(individu);
	}

	@Override
	public void update(Individu individu) {
		// TODO Auto-generated method stub
		individuRepository.save(individu);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		Individu individu =  new Individu();
		individu.setNui(id);
		individuRepository.delete(individu);
	}

	@Override
	public void saveAll(Iterable<Individu> iterable) {
		// TODO Auto-generated method stub
		individuRepository.saveAll(iterable);
	}

	@Override
	public Optional<Individu> findOne(String id) {
		// TODO Auto-generated method stub
		return individuRepository.findById(id);
	}

	@Override
	public Page<Individu> search(String mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return individuRepository.chercher(mc, pageable);
	}

}
