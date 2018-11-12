package lu.amundi.be.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.dao.UserRepository;
import lu.amundi.be.entities.User;

/**
 * 
 * @author AbousyllabaNdiaye
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/api/user")
	public Principal user(Principal user) {
		return user;
	}
	@RequestMapping(value="/api/username/{username}", method = RequestMethod.GET)
	public User getUserByUserName(@PathVariable String username) {
		return userRepository.findByUsername(username);
	}
}
