package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.IbanRepository;
import lu.amundi.be.entities.Iban;
import lu.amundi.be.service.ICrudService;

@Service
@Primary
public class IbanService implements ICrudService<Iban, String>{

	@Autowired
	private IbanRepository ibanRepository;
	
	@Override
	public List<Iban> getAll() {
		// TODO Auto-generated method stub
		return ibanRepository.findAll();
	}

	@Override
	public void add(Iban iban) {
		// TODO Auto-generated method stub
		ibanRepository.save(iban);
	}

	@Override
	public void update(Iban iban) {
		// TODO Auto-generated method stub
		ibanRepository.save(iban);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		Iban iban = new Iban();
		iban.setIban(id);
		ibanRepository.delete(iban);
	}

	@Override
	public void saveAll(Iterable<Iban> iterable) {
		// TODO Auto-generated method stub
		ibanRepository.saveAll(iterable);
	}

	@Override
	public Optional<Iban> findOne(String id) {
		// TODO Auto-generated method stub
		return ibanRepository.findById(id);
	}

	@Override
	public Page<Iban> search(String mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
