package StudentDao;

import softronix.in.entity.Student;

public interface StudentDao {
	
	public String insert (Student student);
	
	public Student search (Integer stdId);
	
	public String update(Student student);
	
	public String delete (Integer stdId);
	

}
