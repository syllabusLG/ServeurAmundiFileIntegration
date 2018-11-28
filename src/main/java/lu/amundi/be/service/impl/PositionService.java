package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.PositionRepository;
import lu.amundi.be.entities.Position;
import lu.amundi.be.service.ICrudService;

/**
 * This service uses the generic interface ICrudService to implement all crud operations according to Position
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Service
@Primary
public class PositionService implements ICrudService<Position, String> {
	
	@Autowired
	private PositionRepository positionRepository;

	@Override
	public List<Position> getAll() {
		return positionRepository.findAll();
	}

	@Override
	public void add(Position position) {
		positionRepository.save(position);
	}

	@Override
	public void update(Position position) {
		positionRepository.save(position);
	}

	@Override
	public void delete(String id) {
		Position position = new Position();
		position.setIdPosition(id);
		positionRepository.delete(position);
	}

	@Override
	public void saveAll(Iterable<Position> iterable) {
		positionRepository.saveAll(iterable);
	}

	@Override
	public Optional<Position> findOne(String id) {
		return positionRepository.findById(id);
	}

	@Override
	public Page<Position> search(String mc, Pageable pageable) {
		return positionRepository.chercher(mc, pageable);
	}

}
