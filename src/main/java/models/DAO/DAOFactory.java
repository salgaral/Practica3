package models.DAO;

public abstract class DAOFactory {
	private static DAOFactory singleton = null;
	public DAOFactory(){
		
	}
	
	public static DAOFactory getDAOFactory(){
		return singleton;
	}
	
	public static void setDAOFactory(DAOFactory singleton){
		DAOFactory.singleton = singleton;
	}
	
	public abstract UserDAO getUserDAO();
	public abstract RoundDAO getRoundDAO();
}
