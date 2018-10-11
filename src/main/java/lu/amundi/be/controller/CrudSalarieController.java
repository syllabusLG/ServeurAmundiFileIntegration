package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Salarie;

@RestController
@RequestMapping(value="/api/salarie")
public class CrudSalarieController extends CrudControlller<Salarie, String> {

}
