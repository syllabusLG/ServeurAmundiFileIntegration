package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Individu;

@RestController
@RequestMapping(value="/api/individus")
public class CrudIndividusController extends CrudControlller<Individu, String>{

}
