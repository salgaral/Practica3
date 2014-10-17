package models.DAO.mem;

import models.DAO.DAOFactory;
import models.DAO.RoundDAO;
import models.DAO.UserDAO;

public class MemDAOFactory extends DAOFactory {

	@Override
	public UserDAO getUserDAO() {

		return null;
	}

	@Override
	public RoundDAO getRoundDAO() {

		return null;
	}

}
