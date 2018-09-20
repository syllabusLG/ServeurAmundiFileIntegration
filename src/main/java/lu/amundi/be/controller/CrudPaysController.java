package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Pays;
/**
 * 
 * @author AbousyllabaNdiaye
 *
 */
@RestController
@RequestMapping(value="/api/pays")
public class CrudPaysController extends CrudControlller<Pays, Long> {

}
