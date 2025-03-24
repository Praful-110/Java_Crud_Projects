package EmployeeDao;

import softronix.in.entity.Employee;

public interface EmployeeDao {
	
	public String insert(Employee employee);
	
	public Employee search(Integer eid);
	
	public String update(Employee employee);
	
	public String delete(Integer eid);

}
