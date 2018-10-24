package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.ReportUpdateFile;

@RestController
@RequestMapping(value="/api/updateFile")
public class CrudReportUpdateFileController extends CrudControlller<ReportUpdateFile, Long> {

}
