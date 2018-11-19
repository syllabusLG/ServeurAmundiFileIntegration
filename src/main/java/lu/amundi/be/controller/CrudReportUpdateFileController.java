package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.ReportUpdateFile;

/**
 * This class is a restController that exposes all ReportUpdateFile services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/updateFile")
public class CrudReportUpdateFileController extends CrudControlller<ReportUpdateFile, Long> {

}
