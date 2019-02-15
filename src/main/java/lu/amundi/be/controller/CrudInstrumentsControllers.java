package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Instruments;

/**
 * This class is a restController that exposes all instruments services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/instrument")
public class CrudInstrumentsControllers extends  CrudControlller<Instruments, String>{

}
 