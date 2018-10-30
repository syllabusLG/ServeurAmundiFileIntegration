package lu.amundi.be.service;

import java.util.Collection;

import lu.amundi.be.entities.Role;
import lu.amundi.be.entities.User;

public interface IRolesService{

	public void updateUserRoles(User user, Collection<Role> roles);
}
