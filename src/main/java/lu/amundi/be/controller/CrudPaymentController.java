package lu.amundi.be.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.entities.Payment;

@RestController
@RequestMapping(value="/api/payment")
public class CrudPaymentController extends CrudControlller<Payment, String>{

}
