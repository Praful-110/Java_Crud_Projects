package StudentService;

import StudentDao.StudentDao;
import StudentDao.StudentDaoImpl;
import StudentFactory.DaoFactory;
import softronix.in.entity.Student;

public class StudentServiceImpl implements StudentService {
	
	
	
	

	StudentDao Dao = DaoFactory.getDao();
	@Override
	public String studentInsert(Student student) 
	{
		String insert = Dao.insert(student);
		return insert;
	}

	@Override
	public Student studentSearch(Integer stdId) 
	{
		Student search = Dao.search(stdId);
		return search;
	}

	@Override
	public String studentUpdate(Student student) 
	{
		String update = Dao.update(student);
		return update;
	}

	@Override
	public String studentDelete(Integer stdId) 
	{
		String delete = Dao.delete(stdId);
		return delete;
	}

}
