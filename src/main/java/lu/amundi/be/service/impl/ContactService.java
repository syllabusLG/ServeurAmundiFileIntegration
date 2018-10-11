package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.ContactRepository;
import lu.amundi.be.entities.Contact;
import lu.amundi.be.service.ICrudService;

@Service
@Primary
public class ContactService implements ICrudService<Contact, String>{

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public List<Contact> getAll() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	@Override
	public void add(Contact contact) {
		// TODO Auto-generated method stub
		contactRepository.save(contact);
	}

	@Override
	public void update(Contact contact) {
		// TODO Auto-generated method stub
		contactRepository.save(contact);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		Contact contact = new Contact();
		contact.setIdContact(id);
		contactRepository.delete(contact);
		
	}

	@Override
	public void saveAll(Iterable<Contact> iterable) {
		// TODO Auto-generated method stub
		contactRepository.saveAll(iterable);
	}

	@Override
	public Optional<Contact> findOne(String id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id);
	}

}
