package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
