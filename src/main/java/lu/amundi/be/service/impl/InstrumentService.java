package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.InstrumentRepository;
import lu.amundi.be.entities.Instruments;
import lu.amundi.be.service.ICrudService;
/**
 * This service uses the generic interface ICrudService to implement all crud operations according to Instruments
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Service
@Primary
public class InstrumentService implements ICrudService<Instruments, String> {

	@Autowired
	private InstrumentRepository instrumentRepository;
	
	@Override
	public List<Instruments> getAll() {
		return instrumentRepository.findAll();
	}

	@Override
	public void add(Instruments instruments) {
		instrumentRepository.save(instruments);
	}

	@Override
	public void update(Instruments instruments) {
		instrumentRepository.save(instruments);
	}

	@Override
	public void delete(String code) {
		Instruments instruments = new Instruments();
		instruments.setCode(code);
		instrumentRepository.delete(instruments);
	}

	@Override
	public void saveAll(Iterable<Instruments> iterable) {
		instrumentRepository.saveAll(iterable);
	}

	@Override
	public Optional<Instruments> findOne(String code) {
		return instrumentRepository.findById(code);
	}

	@Override
	public Page<Instruments> search(String mc, Pageable pageable) {
		return instrumentRepository.chercher(mc, pageable);
	}

}
