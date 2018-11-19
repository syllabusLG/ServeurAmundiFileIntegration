package lu.amundi.be.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.amundi.be.entities.ReportUpdateFile;
/**
 * This interface is a repository for class ReportUpdateFile based on spring data
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public interface ReportUpdateFileRepository extends JpaRepository<ReportUpdateFile, Long> {

}
