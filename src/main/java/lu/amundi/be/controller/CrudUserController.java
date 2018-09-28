package lu.amundi.be.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.amundi.be.dao.RoleRepository;
import lu.amundi.be.entities.Role;
import lu.amundi.be.entities.User;
import lu.amundi.be.utils.RoleEnum;
/**
 * 
 * @author AbousyllabaNdiaye
 *
 */
@RestController
@RequestMapping(value="/crud_user")
public class CrudUserController extends CrudControlller<User, Long>{

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public List<User> getAll() {
		List<User> users = super.getAll();
		users.forEach(user ->{
			user.setPassword(null);
		});
		return users;
	}
	
	@Override
	public void add(@RequestBody User user) {
		Role role = roleRepository.findByName(RoleEnum.ROLE_USER.getName());
		user.setRoles(Arrays.asList(role));
		user.setEnable(true);
		user.setPassword("amundi2018");
		super.add(user);
	}
	
	
}