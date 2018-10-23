package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.SalarieRepository;
import lu.amundi.be.entities.Salarie;
import lu.amundi.be.service.ICrudService;
@Service
@Primary
public class SalarieService implements ICrudService<Salarie, String> {
	
	@Autowired
	private SalarieRepository salarieRepository;
	
	@Override
	public List<Salarie> getAll() {
		// TODO Auto-generated method stub
		return salarieRepository.findAll();
	}

	@Override
	public void add(Salarie salarie) {
		// TODO Auto-generated method stub
		salarieRepository.save(salarie);
	}

	@Override
	public void update(Salarie salarie) {
		// TODO Auto-generated method stub
		salarieRepository.save(salarie);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		Salarie salarie =  new Salarie();
		salarie.setEmployeeId(id);
		salarieRepository.delete(salarie);
	}

	@Override
	public void saveAll(Iterable<Salarie> iterable) {
		// TODO Auto-generated method stub
		salarieRepository.saveAll(iterable);
	}

	@Override
	public Optional<Salarie> findOne(String id) {
		// TODO Auto-generated method stub
		return salarieRepository.findById(id);
	}

	@Override
	public Page<Salarie> search(String mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return salarieRepository.chercher(mc, pageable);
	}


}
