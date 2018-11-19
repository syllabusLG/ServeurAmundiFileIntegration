package lu.amundi.be.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.amundi.be.entities.ReportCreateFile;
/**
 * This interface is a repository for class ReportCreateFile based on spring data
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public interface ReportCreateFileRepository extends JpaRepository<ReportCreateFile, Long> {

}
