package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.ReportCreateFile;

@RestController
@RequestMapping(value="/api/createFile")
public class CrudReportCreateFileController extends CrudControlller<ReportCreateFile, Long> {

}
