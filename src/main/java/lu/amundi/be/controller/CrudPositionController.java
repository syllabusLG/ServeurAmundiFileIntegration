package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Positions;

/**
 * This class is a restController that exposes all position services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/position")
public class CrudPositionController extends CrudControlller<Positions, String> {

}
