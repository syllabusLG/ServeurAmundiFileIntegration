package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.ReportCreateFile;

/**
 * This class is a restController that exposes all ReportCreateFile services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/createFile")
public class CrudReportCreateFileController extends CrudControlller<ReportCreateFile, Long> {

}
