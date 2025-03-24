package EmployeeService;

import EmployeeDao.EmployeeDao;
import EmployeeFactory.DaoFactory;
import softronix.in.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao dao = DaoFactory.getDao();
	@Override
	public String employeeInsert(Employee employee) {
		String insert = dao.insert(employee);
		return insert;
	}

	@Override
	public Employee employeeSearch(Integer eid) {
		Employee search = dao.search(eid);
		return search;
	}

	@Override
	public String employeeUpdate(Employee employee) {
		String update = dao.update(employee);
		
		return update;
	}

	@Override
	public String employeeDelete(Integer eid) {
		String delete = dao.delete(eid);
		return delete;
	}

}
