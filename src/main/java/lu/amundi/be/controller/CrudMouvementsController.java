package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Mouvements;

/**
 * This class is a restController that exposes all movement services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/mouvement")
public class CrudMouvementsController extends CrudControlller<Mouvements, String> {

}
