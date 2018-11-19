package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Contact;
/**
 * This class is a restController that exposes all contact services to client
 * 
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/contact")
public class CrudContactController extends CrudControlller<Contact, String> {

}
