package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Adresse;

@RestController
@RequestMapping(value="/api/adresse")
public class CrudAdresseController extends CrudControlller<Adresse, String>{

}
