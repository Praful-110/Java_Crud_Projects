package EmployeeService;

import softronix.in.entity.Employee;

public interface EmployeeService {
	
	public String employeeInsert(Employee employee);
	
	public Employee employeeSearch(Integer eid);
	
	public String employeeUpdate(Employee employee);
	
	public String employeeDelete(Integer eid);

}
