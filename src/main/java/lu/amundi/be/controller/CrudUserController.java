package lu.amundi.be.controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.dao.RoleRepository;
import lu.amundi.be.dao.UserRepository;
import lu.amundi.be.entities.Role;
import lu.amundi.be.entities.User;
import lu.amundi.be.utils.EncodePassword;
import lu.amundi.be.utils.RoleEnum;
/**
 * This class is a restController that exposes all crudUser services to client
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@RestController
@RequestMapping(value="/crud_user")
public class CrudUserController extends CrudControlller<User, Long>{

	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserRepository userRepository;
	
	/*@Override
	public List<User> getAll() {
		List<User> users = super.getAll();
		users.forEach(user ->{
			user.setPassword(null);
		});
		return users;
	}*/
	
	@Override
	public void add(@RequestBody User user) {
		Role role = roleRepository.findByName(RoleEnum.ROLE_USER.getName());
		user.setRoles(Arrays.asList(role));
		user.setEnable(true);
		user.setChangePassword("FALSE");
		user.setPassword(EncodePassword.generateCrypting("amundi2018"));
		super.add(user);
	}
	
	
	/**
	 * This function expose a service which return all roles
	 * @return all roles
	 */
	@RequestMapping(value="roles", method = RequestMethod.GET)
	public Collection<Role> getAllRoles(){
		return roleRepository.findAll();
	}
	/**
	 * This function expose a service which  return all user roles
	 * @param id
	 * @return
	 */
	@RequestMapping(value="roles/{id}", method = RequestMethod.GET)
	public Collection<Role> getAllRolesByUser(@PathVariable Long id){
		User user = userRepository.findByIdUser(id);
		return user.getRoles();
	}
	
	
}
