package models.DAO;

import java.util.List;

public abstract interface GenericDAO<T, ID> {
	public void create(T entity);
	public T read(ID id);
	public void update(T entity);
	public void delete(T entity);
	public void deleteById(ID id);
	public List<T> findAll();
	public List<T> findAll(int index, int size);
}
