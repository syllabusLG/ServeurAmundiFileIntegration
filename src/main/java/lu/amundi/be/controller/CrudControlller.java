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
 * A generic class that regroup all generic services.
 * The generic service will be used by others classes that use the crud functions.
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 * @param <T>: generic class
 * @param <ID>: generic id
 */
public class CrudControlller<T, ID> {
	
	@Autowired
	private ICrudService<T, ID> service;
	
	/**
	 * This generic function return a list of T
	 * @return a list of T
	 */
	@GetMapping
	public List<T> getAll(){
		return service.getAll();
	}
	
	/**
	 * This generic function use the service to add the generic entity T
	 * @param entity:  generic entity
	 */
	@PostMapping
	public void add(@RequestBody T entity) {
		service.add(entity);
	}
	
	/**
	 * This generic function use the service to update the generic entity T
	 * @param entity: generic entity
	 */
	@PutMapping
	public void update(@RequestBody T entity) {
		service.update(entity);
	}
	/**
	 * This generic function use a service to delete an entity by generic id
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void delete(@PathVariable ID id) {
		service.delete(id);
	}
	/**
	 * This generic function use a service to add a list of entity
	 * @param list
	 * @return
	 */
	@PostMapping("/all")
	public ResponseEntity<List<T>> addAll(@RequestBody List<T> list){
		service.saveAll(list);
		return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
	}
	/**
	 * This generic function use a service to find one entity by id
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Optional<T> getOne(@PathVariable ID id) {
		return service.findOne(id);
	}
	/**
	 * This generic function use a service to find a page of entity T by using key and size for the pagination
	 * @param mc: key
	 * @param page: numero of page
	 * @param size: number of pages to render
	 * @return
	 */
	@RequestMapping(value="/search", method = RequestMethod.GET)
	public Page<T> search(
			@RequestParam(name="mc", defaultValue="")String mc,
			@RequestParam(name="page", defaultValue="0")int page,
			@RequestParam(name="size", defaultValue="5")int size){
		return service.search("%"+mc+"%", new PageRequest(page, size));
	}

}
