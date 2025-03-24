package EmployeeFactory;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImpl;

public class DaoFactory {
	
	
	private static EmployeeDao employeeDao=null;
	
	static {
		employeeDao = new EmployeeDaoImpl();
	}
	
	public static EmployeeDao getDao() {
		return employeeDao;
	}

}
