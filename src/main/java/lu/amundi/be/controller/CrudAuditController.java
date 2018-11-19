package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Audit;
/**
 * This class is a restController that exposes all audit services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/audit")
public class CrudAuditController extends CrudControlller<Audit, Long> {

}
