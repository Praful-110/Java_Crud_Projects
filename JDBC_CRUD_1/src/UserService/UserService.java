package UserService;

import softronix.in.entity.User;

public interface UserService {
	
	public String userInsert(User user);
	
	public User userSearch(Integer uid);
	
	public String userUpdate(User user);
	
	public String userDelete(Integer uid);

}
