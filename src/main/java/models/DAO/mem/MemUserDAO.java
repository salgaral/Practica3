package models.DAO.mem;

import java.util.List;

import models.DAO.UserDAO;
import models.entities.User;

public class MemUserDAO extends MemGenericDAO<User, Integer> implements UserDAO{

	public void create(User entity) {
		
	}

	public User read(Integer id) {

		return null;
	}

	public void update(User entity) {
		
	}

	public void delete(User entity) {
		
	}

	public void deleteById(Integer id) {
		
	}

	public List<User> findAll() {

		return null;
	}

	public List<User> findAll(int index, int size) {

		return null;
	}
	
	protected Integer getId(User entity){
		return entity.getId();
	};

}
