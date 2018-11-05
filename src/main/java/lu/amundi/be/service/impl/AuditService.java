package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.AuditRepository;
import lu.amundi.be.entities.Audit;
import lu.amundi.be.service.ICrudService;
/**
 * 
 * @author AbousyllabaNdiaye
 *
 */
@Service
@Primary
public class AuditService implements ICrudService<Audit, Long> {

	@Autowired
	private AuditRepository auditRepository;
	@Override
	public List<Audit> getAll() {
		return auditRepository.findAll();
	}

	@Override
	public void add(Audit audit) {
		auditRepository.save(audit);
	}

	@Override
	public void update(Audit audit) {
		auditRepository.save(audit);
	}

	@Override
	public void delete(Long id) {
		Audit audit = new Audit();
		audit.setId(id);
		auditRepository.delete(audit);
	}

	@Override
	public void saveAll(Iterable<Audit> iterable) {
		auditRepository.saveAll(iterable);
	}

	@Override
	public Optional<Audit> findOne(Long id) {
		return auditRepository.findById(id);
	}

	@Override
	public Page<Audit> search(String mc, Pageable pageable) {
		return auditRepository.chercher(mc, pageable);
	}

}
