package lu.amundi.be.service;

import java.util.List;
import java.util.Optional;

public interface ICrudService<T, ID> {
	
	public List<T> getAll();
	public void add(T entity);
	public void update(T entity);
	public void delete(ID id);
	public void saveAll(Iterable<T> iterable);
	public Optional<T> findOne(ID id);
}
