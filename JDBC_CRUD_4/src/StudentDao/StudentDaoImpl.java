package StudentDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import StudentFactory.ConnectionFactory;
import softronix.in.entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	Student student = new Student();

	Connection con = ConnectionFactory.getConnection();
	String sql;
	String result="";
	
	
	//---------------------------------Insert-----------------------------------------------
	@Override
	public String insert(Student student) {
		int stdId = student.getStdId();
		String stdName = student.getStdName();
		String stdAddr = student.getStdAddr();
	    String stdGrade = student.getStdGrade();
		long stdNumber = student.getStdNumber();
		
		try {
			Statement st = con.createStatement();
			sql="Insert into student values ("+stdId+",'"+stdName+"','"+stdAddr+"','"+stdGrade+"','"+stdNumber+"')";
			boolean b = st.execute(sql);
			
			if(b!=true) {
				return result ="\n Data Insert Sucessfully.........\n";
			}
			else
			{
				result="Fail to Insert";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	
	//--------------------------------------------Search--------------------------------------------------------------
	@Override
	public Student search(Integer stdId) {
	
		try {
			
			//Student student = new Student();
			
			Statement st = con.createStatement();
			
			String sql ="select * from student where Id = "+stdId+"";
			
			ResultSet set= st.executeQuery(sql);
			
			System.out.println(set);
			
			boolean b = set.next();
			
			if(b==true)    
			{
				
				student.setStdId(set.getInt("Id"));
				student.setStdName(set.getString("Name"));
				student.setStdAddr(set.getString("Address"));
				student.setStdGrade(set.getString("Grade"));
				student.setStdNumber(set.getLong("Number"));
				
			}
			else 
			
			{
				student =null;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}
	
	
	//---------------------------------------------------Update-------------------------------------------------

	@Override
	public String update(Student student) {
		
		try {
			
			int stdId = student.getStdId();
			String stdName = student.getStdName();
			String stdAddr = student.getStdAddr();
		    String stdGrade = student.getStdGrade();
			long stdNumber = student.getStdNumber();
			
			Statement st = con.createStatement();
			
			sql="update student set Name='"+stdName+"',Address='"+stdAddr+"',Grade='"+stdGrade+"',Number='"+stdNumber+"'Where Id ="+stdId+"";
			
			boolean b = st.execute(sql);
			
			if(b!=true) 
			{
				return result = "Student Data Update Sucessfully.........";
			}
			else 
			{
				result = null;
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	
	//-----------------------------------------------Delete---------------------------------------------------------

	@Override
	public String delete(Integer stdId) {
		
		
		try {
			Statement st = con.createStatement();
			sql="Delete from student where Id = "+stdId+"";
			boolean b = st.execute(sql);
			
			if(b!=true) {
				return result ="\n Student Data Delete Sucessfully.........\n";
			}
			else
			{
				result="Fail to Insert";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return result;
	}

}
