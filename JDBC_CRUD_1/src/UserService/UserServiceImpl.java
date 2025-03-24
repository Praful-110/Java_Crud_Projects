package UserService;

import UserDao.UserDao;
import UserFactory.DaoFactory;
import softronix.in.entity.User;

public class UserServiceImpl implements UserService {

	
	UserDao dao = DaoFactory.getDao();
	@Override
	public String userInsert(User user) {
		String insert = dao.insert(user);
		return insert;
	}

	@Override
	public User userSearch(Integer uid) {
		User user = dao.search(uid);
		return user;
	}

	@Override
	public String userUpdate(User user) {
		
		String update = dao.update(user);
		
		return update;
	}

	@Override
	public String userDelete(Integer uid) {
		
		String delete = dao.delete(uid);
		
		return delete;
	}

}
