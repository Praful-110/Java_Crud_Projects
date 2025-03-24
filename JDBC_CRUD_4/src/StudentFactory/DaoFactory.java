package StudentFactory;

import StudentDao.StudentDao;
import StudentDao.StudentDaoImpl;

public class DaoFactory 
{
	private static StudentDao studentDao = null;
	
	static {
		
		studentDao = new StudentDaoImpl();
	}
	
	public static StudentDao getDao()
	{
		return studentDao;
		
	}
	
	
	
	

}
