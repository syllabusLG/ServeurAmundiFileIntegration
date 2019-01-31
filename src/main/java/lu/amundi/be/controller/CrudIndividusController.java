package lu.amundi.be.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.dao.IndividuRepository;
import lu.amundi.be.entities.Individu;

/**
 * This class is a restController that exposes all individu services to client
 * 
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/individus")
public class CrudIndividusController extends CrudControlller<Individu, String>{
	@Autowired
	private IndividuRepository individuRepository;
	
	
	@RequestMapping(value="/name/{name}", method=RequestMethod.GET)
	public List<Individu> getIndividusByName(@PathVariable String name){
		return individuRepository.findIndividuByLastName(name);
	}

}
