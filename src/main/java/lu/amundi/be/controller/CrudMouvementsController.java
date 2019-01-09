package lu.amundi.be.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.dao.MouvementsRepository;
import lu.amundi.be.entities.Mouvements;

/**
 * This class is a restController that exposes all movement services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/movement")
public class CrudMouvementsController extends CrudControlller<Mouvements, String> {

	@Autowired
	private MouvementsRepository mouvementsRepository;
	
	@RequestMapping(value="/movementsByDate", method = RequestMethod.GET)
	public Page<Mouvements> movementsByDate(
			@RequestParam(name= "dateBefore", defaultValue="")String dateBeforeString, 
			@RequestParam(name= "dateAfter", defaultValue="")String dateAfterString, 
			@RequestParam(name= "page", defaultValue="0")int page, 
			@RequestParam(name= "size", defaultValue="5")int size){
		LocalDate dateBefore = LocalDate.parse(dateBeforeString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate dateAfter = LocalDate.parse(dateAfterString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return mouvementsRepository.getMouvementsByDate(dateBefore, dateAfter, new PageRequest(page, size));
	}
}
