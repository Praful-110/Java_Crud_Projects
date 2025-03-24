package UserFactory;

import UserDao.UserDao;
import UserDao.UserDaoImpl;
import softronix.in.entity.User;

public class DaoFactory {
	
	private static UserDao userDao = null;
	
	static {
		userDao = new UserDaoImpl();
	}

	public static UserDao getDao() {
		return userDao;
	}
	
}
