package StudentFactory;

import StudentDao.StudentDaoImpl;
import StudentService.StudentService;
import StudentService.StudentServiceImpl;

public class ServiceFactory {
	
	private static StudentService studentService=null;
	
	static {
		
		studentService=new StudentServiceImpl();
	}
	
	public static StudentService getService() {
		return studentService;
	}
	
	

}
