package StudentService;

import softronix.in.entity.Student;

public interface StudentService {
	
	public String studentInsert (Student student);
	
	public Student studentSearch (Integer stdId);
	
	public String studentUpdate(Student student);
	
	public String studentDelete (Integer stdId);

}
