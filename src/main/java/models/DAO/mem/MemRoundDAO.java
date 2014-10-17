package models.DAO.mem;

import java.util.List;

import models.DAO.RoundDAO;
import models.entities.Round;

public class MemRoundDAO extends MemGenericDAO<Round, Integer> implements RoundDAO{

	public void create(Round entity) {
		
	}

	public Round read(Integer id) {

		return null;
	}

	public void update(Round entity) {
		
	}

	public void delete(Round entity) {
		
	}

	public void deleteById(Integer id) {
		
	}

	public List<Round> findAll() {

		return null;
	}

	public List<Round> findAll(int index, int size) {

		return null;
	}
	
	protected Integer getId(Round entity){
		return entity.getId();
	};

}
