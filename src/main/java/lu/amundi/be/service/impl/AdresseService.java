package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.AdressRepository;
import lu.amundi.be.entities.Adresse;
import lu.amundi.be.service.ICrudService;

@Service
@Primary
public class AdresseService implements ICrudService<Adresse, String> {

	@Autowired
	private AdressRepository adressRepository;
	
	@Override
	public List<Adresse> getAll() {
		// TODO Auto-generated method stub
		return adressRepository.findAll();
	}

	@Override
	public void add(Adresse adresse) {
		// TODO Auto-generated method stub
		adressRepository.save(adresse);
	}

	@Override
	public void update(Adresse adresse) {
		// TODO Auto-generated method stub
		adressRepository.save(adresse);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		Adresse adresse = new Adresse();
		adresse.setId(id);
		adressRepository.delete(adresse);
	}

	@Override
	public void saveAll(Iterable<Adresse> iterable) {
		// TODO Auto-generated method stub
		adressRepository.saveAll(iterable);
	}

	@Override
	public Optional<Adresse> findOne(String id) {
		// TODO Auto-generated method stub
		return adressRepository.findById(id);
	}

}
