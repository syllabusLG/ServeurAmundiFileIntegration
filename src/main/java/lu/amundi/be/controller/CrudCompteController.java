package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Compte;

@RestController
@RequestMapping(value="/api/compte")
public class CrudCompteController extends CrudControlller<Compte, Long>{

}
