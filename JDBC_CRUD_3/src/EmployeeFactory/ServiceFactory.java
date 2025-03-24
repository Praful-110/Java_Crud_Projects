package EmployeeFactory;

import EmployeeService.EmployeeService;
import EmployeeService.EmployeeServiceImpl;

public class ServiceFactory {
	
	private static EmployeeService employeeService= null;
	
	static {
		employeeService=new EmployeeServiceImpl();
	}
	
	public static EmployeeService getService()
	{
		return employeeService;
	}
	

}
