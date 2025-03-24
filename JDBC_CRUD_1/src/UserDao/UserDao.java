package UserDao;

import softronix.in.entity.User;

public interface UserDao {
	
	public String insert(User user);
	
	public User search(Integer uid);
	
	public String update(User user);
	
	public String delete(Integer uid);

}
