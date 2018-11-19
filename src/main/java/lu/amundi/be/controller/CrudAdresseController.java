package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Adresse;
/**
 * This class is a restController that exposes all address services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *	
 */
@RestController
@RequestMapping(value="/api/adresse")
public class CrudAdresseController extends CrudControlller<Adresse, String>{

}
