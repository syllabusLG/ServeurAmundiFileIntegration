package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Payment;

/**
 * This class is a restController that exposes all payment services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/api/payment")
public class CrudPaymentController extends CrudControlller<Payment, String>{

}
