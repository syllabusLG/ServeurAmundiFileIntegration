package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Audit;
/**
 * 
 * @author AbousyllabaNdiaye
 *
 */
@RestController
@RequestMapping(value="/api/audit")
public class CrudAuditController extends CrudControlller<Audit, Long> {

}
