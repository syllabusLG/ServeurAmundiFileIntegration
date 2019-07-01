package lu.amundi.be.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.dao.UserRepository;
import lu.amundi.be.entities.User;
import lu.amundi.be.utils.EncodePassword;

/**
 * This class is a restController that exposes all user services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/api/user")
	public Principal user(Principal user) {
		return user;
	}
	/**
	 * This function expose a service which find user by username
	 * @param username
	 * @return
	 */
	@RequestMapping(value="/api/username/{username}", method = RequestMethod.GET)
	public User getUserByUserName(@PathVariable String username) {
		return userRepository.findByUsername(username);
	}
	/**
	 * This function expose a service which update user 
	 * @param user
	 */
	@RequestMapping(value="/api/user", method = RequestMethod.PUT)
	public void update(@RequestBody User user) {
		if(user.getChangePassword().equals("TRUE")) {
			user.setPassword(EncodePassword.generateCrypting(user.getPassword()));
		}
		
		userRepository.save(user);
	}
}
