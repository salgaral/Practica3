package models.DAO.mem;

import java.util.List;

import models.DAO.GenericDAO;

public class MemGenericDAO<T, ID> implements GenericDAO<T,ID> {

	public void create(T entity) {

	}

	public T read(ID id) {
		
		return null;
	}

	public void update(T entity) {
		
	}

	public void delete(T entity) {

	}

	public void deleteById(ID id) {
		
	}

	public List<T> findAll() {

		return null;
	}

	public List<T> findAll(int index, int size) {

		return null;
	}
	
}
