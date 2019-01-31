package lu.amundi.be.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.dao.AuditRepository;
import lu.amundi.be.entities.Audit;
/**
 * This class is a restController that exposes all audit services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/audit")
public class CrudAuditController extends CrudControlller<Audit, Long> {
	
	@Autowired
	private AuditRepository auditRepository;
	
	@RequestMapping(value="/auditsByDate", method = RequestMethod.GET)
	public Page<Audit> auditsByDate(
			@RequestParam(name="dateBefore", defaultValue="") String dateBeforeString,
			@RequestParam(name="dateAfter", defaultValue="") String dateAfterString,
			@RequestParam(name= "page", defaultValue="0")int page, 
			@RequestParam(name= "size", defaultValue="5")int size){
		LocalDateTime dateBefore = LocalDateTime.parse(dateBeforeString, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		LocalDateTime dateAfter = LocalDateTime.parse(dateAfterString, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		return auditRepository.findAuditByDate(dateBefore, dateAfter, new PageRequest(page, size));
	}

}
