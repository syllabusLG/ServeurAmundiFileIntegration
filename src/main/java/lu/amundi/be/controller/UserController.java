package lu.amundi.be.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author AbousyllabaNdiaye
 *
 */
@RestController
@CrossOrigin
public class UserController {

	@RequestMapping("/api/user")
	public Principal user(Principal user) {
		return user;
	}
}
