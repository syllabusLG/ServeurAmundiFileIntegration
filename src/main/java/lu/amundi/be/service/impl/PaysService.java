package lu.amundi.be.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.PaysRepository;
import lu.amundi.be.entities.Pays;
import lu.amundi.be.service.ICrudService;

@Service
@Primary
public class PaysService implements ICrudService<Pays, Long> {

	@Autowired
	private PaysRepository paysRepository;
	
	@Override
	public List<Pays> getAll() {
		// TODO Auto-generated method stub
		return paysRepository.findAll();
	}

	@Override
	public void add(Pays pays) {
		// TODO Auto-generated method stub
		paysRepository.save(pays);
	}

	@Override
	public void update(Pays pays) {
		// TODO Auto-generated method stub
		paysRepository.save(pays);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Pays pays = new Pays();
		pays.setId(id);
		paysRepository.delete(pays);
	}

	@Override
	public void saveAll(Iterable<Pays> iterable) {
		// TODO Auto-generated method stub
		paysRepository.saveAll(iterable);
	}

}
