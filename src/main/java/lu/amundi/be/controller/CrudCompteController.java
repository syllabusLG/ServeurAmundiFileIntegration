package lu.amundi.be.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.dao.CompteRepository;
import lu.amundi.be.entities.Compte;

/**
 * This class is a restController that exposes all account services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/compte")
public class CrudCompteController extends CrudControlller<Compte, String>{

	@Autowired
	private CompteRepository compteRepository;
	
	@RequestMapping(value="/individu/{nui}", method = RequestMethod.GET)
	public List<Compte> getComptesByIndividu(@PathVariable String nui){
		return compteRepository.findCompteByIndividu(nui);
	}
}
