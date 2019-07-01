package lu.amundi.be.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.dao.PositionRepository;
import lu.amundi.be.entities.Positions;

/**
 * This class is a restController that exposes all position services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/position")
public class CrudPositionController extends CrudControlller<Positions, Long> {
	
	@Autowired
	private PositionRepository positionRepository;
	
	@RequestMapping(value="/byCode", method = RequestMethod.GET)
	public Positions getPositionByCodeInstrumentAndCompte(
			@RequestParam(name="codeInstrument", defaultValue="")String codeInstrument, 
			@RequestParam(name="codeCompte", defaultValue="")String codeCompte) {
		return positionRepository.findPositionByCodeInstrumentAndCompte(codeInstrument, codeCompte);
	}
}
