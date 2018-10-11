package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Iban;

@RestController
@RequestMapping(value="/api/iban")
public class CrudIbanController extends CrudControlller<Iban, String>{

}
