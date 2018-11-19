package lu.amundi.be.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
/**
 * This generic interface is used by all crud operation 
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 * @param <T>
 * @param <ID>
 */
public interface ICrudService<T, ID> {
	
	public List<T> getAll();
	public void add(T entity);
	public void update(T entity);
	public void delete(ID id);
	public void saveAll(Iterable<T> iterable);
	public Optional<T> findOne(ID id);
	public Page<T> search(String mc, Pageable pageable);
}
