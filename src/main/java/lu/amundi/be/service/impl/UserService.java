package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.UserRepository;
import lu.amundi.be.entities.User;
import lu.amundi.be.service.ICrudService;

/**
 * This service uses the generic interface ICrudService to implement all crud operation according to User
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Service
@Primary
public class UserService implements ICrudService<User, Long>{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public void add(User user) {
		userRepository.save(user);	
	}

	@Override
	public void update(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void delete(Long id) {
		User user = new User();
		user.setId(id);
		userRepository.delete(user);
	}

	@Override
	public void saveAll(Iterable<User> iterable) {
		userRepository.saveAll(iterable);
	}

	@Override
	public Optional<User> findOne(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public Page<User> search(String mc, Pageable pageable) {
		return userRepository.chercher(mc, pageable);
	}

}
