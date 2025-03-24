package UserFactory;

import UserService.UserService;
import UserService.UserServiceImpl;

public class ServiceFactory {
	
	private static UserService userService =null;
	
	static
	{
		userService = new UserServiceImpl();
		
	}
	public static UserService getService()
	{
		return userService;
	}

}
