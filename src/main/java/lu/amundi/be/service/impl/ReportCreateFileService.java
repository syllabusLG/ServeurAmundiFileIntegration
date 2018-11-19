package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.ReportCreateFileRepository;
import lu.amundi.be.entities.ReportCreateFile;
import lu.amundi.be.service.ICrudService;

/**
 * This service uses the generic interface ICrudService to implement all crud operation according to ReportCreateFile
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Service
@Primary
public class ReportCreateFileService implements ICrudService<ReportCreateFile, Long> {

	@Autowired
	private ReportCreateFileRepository reportCreateFileRepository;
	
	@Override
	public List<ReportCreateFile> getAll() {
		return reportCreateFileRepository.findAll();
	}

	@Override
	public void add(ReportCreateFile entity) {
		reportCreateFileRepository.save(entity);
	}

	@Override
	public void update(ReportCreateFile entity) {
		reportCreateFileRepository.save(entity);
	}

	@Override
	public void delete(Long id) {
		ReportCreateFile reportCreateFile = new ReportCreateFile();
		reportCreateFile.setId(id);
		reportCreateFileRepository.delete(reportCreateFile);
	}

	@Override
	public void saveAll(Iterable<ReportCreateFile> iterable) {
		reportCreateFileRepository.saveAll(iterable);
	}

	@Override
	public Optional<ReportCreateFile> findOne(Long id) {
		return reportCreateFileRepository.findById(id);
	}

	@Override
	public Page<ReportCreateFile> search(String mc, Pageable pageable) {
		return null;
	}

}
