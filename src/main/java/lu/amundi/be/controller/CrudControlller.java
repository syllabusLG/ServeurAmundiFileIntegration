package lu.amundi.be.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lu.amundi.be.service.ICrudService;
/**
 * 
 * @author AbousyllabaNdiaye
 *
 * @param <T>
 * @param <ID>
 */
public class CrudControlller<T, ID> {
	
	@Autowired
	private ICrudService<T, ID> service;
	
	@GetMapping
	public List<T> getAll(){
		return service.getAll();
	}
	
	@PostMapping
	public void add(@RequestBody T entity) {
		service.add(entity);
	}
	
	@PutMapping
	public void update(@RequestBody T entity) {
		service.update(entity);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable ID id) {
		service.delete(id);
	}
	@PostMapping("/all")
	public ResponseEntity<List<T>> addAll(@RequestBody List<T> list){
		service.saveAll(list);
		return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/{id}")
	public Optional<T> getOne(@PathVariable ID id) {
		return service.findOne(id);
	}
	
	@RequestMapping(value="/search", method = RequestMethod.GET)
	public Page<T> search(
			@RequestParam(name="mc", defaultValue="")String mc,
			@RequestParam(name="page", defaultValue="0")int page,
			@RequestParam(name="size", defaultValue="5")int size){
		return service.search("%"+mc+"%", new PageRequest(page, size));
	}

}
