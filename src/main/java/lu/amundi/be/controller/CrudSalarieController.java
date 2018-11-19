package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Salarie;

/**
 * This class is a restController that exposes all salarie services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/salarie")
public class CrudSalarieController extends CrudControlller<Salarie, String> {

}
