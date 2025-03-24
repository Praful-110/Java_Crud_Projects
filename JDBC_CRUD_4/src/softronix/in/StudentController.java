package softronix.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Statement;

import StudentFactory.ConnectionFactory;
import StudentFactory.ServiceFactory;
import StudentService.StudentService;
import softronix.in.entity.Student;

public class StudentController 
{

	public static void main(String[] args) throws Exception, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer option;		
		Student student = new Student();
		StudentService service = ServiceFactory.getService();
		
		
		while(true)
		{
			System.out.println("-------Perform Crud operation------");
			
			System.out.println("To insert Student select 1 : Select");
			System.out.println("To search Student select 2 : Search");
			System.out.println("To update Student select 3 : Update");
			System.out.println("To delete Student select 4 : Delete");
			System.out.println("To exit Student select 5 : Exit");
			
			System.out.println();
			
			System.out.print("Please Select the option[1,2,3,4,5] : ");
			
			option = Integer.parseInt(br.readLine());
			
			
			switch(option)
			{
			
			
			case 1: // insert
			{
				System.out.println("-----------Enter the student Details-----------");
				
				System.out.print("Enter the Student Id : ");
				int stdId = Integer.parseInt(br.readLine());
				
				System.out.print("Enter the Student Name : ");
				String stdName = br.readLine();
				
				System.out.print("Enter the Student Address : ");
				String stdAddr = br.readLine();
				
				System.out.print("Enter the Student Grade : ");
				String stdGrade=br.readLine();
								
				System.out.print("Enter the Student Number : ");
				long stdNumber = Long.parseLong(br.readLine());
				
				student.setStdId(stdId);
				student.setStdName(stdName);
				student.setStdAddr(stdAddr);
				student.setStdGrade(stdGrade);
				student.setStdNumber(stdNumber);
				
				
				String studentInsert = service.studentInsert(student);
				
				if(studentInsert != null)
				{
					System.out.println(studentInsert);
				}
				else
				{
					System.out.println("Student data not found......");
				}
				
				
				
			}
			
			break;
			case 2://search
			{
				
				System.out.println("-----------------Search Operations----------------------");
				
				System.out.print("Enter the Student Id : ");
				Integer stdId = Integer.parseInt(br.readLine());
				Student s = service.studentSearch(stdId);
				
				System.out.println("********Students Details******");
				
				System.out.println("Student Id : "+s.getStdId());
				System.out.println("Student Name : "+s.getStdName());
				System.out.println("Student Address : "+s.getStdAddr());
				System.out.println("Student Grade : "+s.getStdGrade());
				System.out.println("Student Number : "+s.getStdNumber());
				
				
				System.out.println("--------------------------------------");
				
				
				
				
			}
			
			break;
			case 3://update
			{
				
				System.out.println("Enter the Updated Id ");
				Integer stdId = Integer.parseInt(br.readLine());
				Student s = service.studentSearch(stdId);
				
				if(stdId==s.getStdId())
				{
					System.out.println("Enter the Student Updated Details");
					
					String stdName =s.getStdName();
					String stdAddr =s.getStdAddr();
					String stdGrade =s.getStdGrade();
					long stdNumber =s.getStdNumber();
					
					System.out.println("Enter the Student Name : ");
					String name =br.readLine();
					stdName=name;
					
					System.out.println("Enter the Student Address : ");
					String address =br.readLine();
					stdAddr=address;
					
					System.out.println("Enter the Student Grade : ");
					String grade =br.readLine();
					stdGrade=grade;
					
					System.out.println("Enter the Student Number : ");
					long number = Long.parseLong(br.readLine());
					stdNumber = number;
					
				
					Student std = new Student();
					
					std.setStdName(stdName);
					std.setStdAddr(stdAddr);
					std.setStdGrade(stdGrade);
					std.setStdNumber(stdNumber);
					
					String studentUpdate = service.studentUpdate(student);
					System.out.println(studentUpdate);
									
				}
				
				else 
				{
					System.out.println("No Search Student.................");
				}
				
				
			}
			
			break;
			case 4://delete
			{
				
				
				System.out.println("---------------------");
				System.out.println("Enter the Student-ID delete");
				
				int stdId =Integer.parseInt(br.readLine());
				Student studentSearch = service.studentSearch(stdId);
				String sd = service.studentDelete(stdId);
				System.out.println(sd);
				
				
			}
			
			
			}
			
			
			
			
			
		}
		

	}

}
