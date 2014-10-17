package models.DAO.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.DAO.GenericDAO;

public abstract class MemGenericDAO<T, ID> implements GenericDAO<T,ID> {

	Map<ID, T> mapaEntidades = new HashMap<ID, T>();
	
	public void create(T entity) {
		if(!mapaEntidades.containsKey(this.getId(entity))){
			mapaEntidades.put(this.getId(entity), entity);
		}
	}

	public T read(ID id) {
		if(mapaEntidades.containsKey(id)){
			return mapaEntidades.get(id);
		}
		else
			throw new AssertionError("No se ha encontrado el Id");
	}

	public void update(T entity) {
		if(mapaEntidades.containsKey(this.getId(entity))){
			if(!mapaEntidades.get(this.getId(entity)).equals(entity)){
				mapaEntidades.put(this.getId(entity), entity);
			}
		}
	}

	public void delete(T entity) {
		if(mapaEntidades.containsKey(this.getId(entity))){
			mapaEntidades.remove(this.getId(entity));
		}
	}

	public void deleteById(ID id) {
		if(mapaEntidades.containsKey(id)){
			mapaEntidades.remove(id);
		}
	}

	public List<T> findAll() {
		ArrayList<T> listaEntidades = new ArrayList<T>(mapaEntidades.values());
		return listaEntidades.subList(0, listaEntidades.size()-1);
	}

	public List<T> findAll(int index, int size) {
		ArrayList<T> listaEntidades = new ArrayList<T>(size);
		return listaEntidades.subList(index, size);
	}
	
	protected abstract ID getId(T entity);
}
