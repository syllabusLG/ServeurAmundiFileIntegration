package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.ReportUpdateFileRepository;
import lu.amundi.be.entities.ReportUpdateFile;
import lu.amundi.be.service.ICrudService;

/**
 * This service uses the generic interface ICrudService to implement all crud operation according to ReportUpdateFile
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Service
@Primary
public class ReportUpdateFileService implements ICrudService<ReportUpdateFile, Long> {

	@Autowired
	private ReportUpdateFileRepository reportUpdateFileRepository;

	@Override
	public List<ReportUpdateFile> getAll() {
		return reportUpdateFileRepository.findAll();
	}

	@Override
	public void add(ReportUpdateFile entity) {
		reportUpdateFileRepository.save(entity);	
	}

	@Override
	public void update(ReportUpdateFile entity) {
		reportUpdateFileRepository.save(entity);
	}

	@Override
	public void delete(Long id) {
		ReportUpdateFile reportUpdateFile = new ReportUpdateFile();
		reportUpdateFile.setId(id);
		reportUpdateFileRepository.delete(reportUpdateFile);
	}

	@Override
	public void saveAll(Iterable<ReportUpdateFile> iterable) {
		reportUpdateFileRepository.saveAll(iterable);
	}

	@Override
	public Optional<ReportUpdateFile> findOne(Long id) {
		return reportUpdateFileRepository.findById(id);
	}

	@Override
	public Page<ReportUpdateFile> search(String mc, Pageable pageable) {
		return null;
	}
	
	

}
