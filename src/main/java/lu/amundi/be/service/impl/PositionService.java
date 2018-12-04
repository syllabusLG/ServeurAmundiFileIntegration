package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.PositionRepository;
import lu.amundi.be.entities.Positions;
import lu.amundi.be.service.ICrudService;

/**
 * This service uses the generic interface ICrudService to implement all crud operations according to Position
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Service
@Primary
public class PositionService implements ICrudService<Positions, String> {
	
	@Autowired
	private PositionRepository positionRepository;

	@Override
	public List<Positions> getAll() {
		return positionRepository.findAll();
	}

	@Override
	public void add(Positions positions) {
		positionRepository.save(positions);
	}

	@Override
	public void update(Positions positions) {
		positionRepository.save(positions);
	}

	@Override
	public void delete(String id) {
		Positions positions = new Positions();
		positions.setIdPosition(id);
		positionRepository.delete(positions);
	}

	@Override
	public void saveAll(Iterable<Positions> iterable) {
		positionRepository.saveAll(iterable);
	}

	@Override
	public Optional<Positions> findOne(String id) {
		return positionRepository.findById(id);
	}

	@Override
	public Page<Positions> search(String mc, Pageable pageable) {
		return positionRepository.chercher(mc, pageable);
	}

}
