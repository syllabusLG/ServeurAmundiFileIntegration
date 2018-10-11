package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Contact;

@RestController
@RequestMapping(value="/api/contact")
public class CrudContactController extends CrudControlller<Contact, String> {

}
