package softronix.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import EmployeeFactory.ServiceFactory;
import EmployeeService.EmployeeService;
import EmployeeService.EmployeeServiceImpl;
import softronix.in.entity.Employee;

public class EmployeeController {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer option;
		
		Employee employee = new Employee();
		
		EmployeeService service = ServiceFactory.getService();
		
		while(true)
		{
			System.out.println("-----Perform crud Operations-----");
			System.out.println("To Insert employee select 1: Insert");
			System.out.println("To Search employee select 2: Search");
			System.out.println("To Update employee select 3: Update");
			System.out.println("To Delete employee select 4: Delete");
			System.out.println("To Exit select 5: Exit");
			
			System.out.println();
			System.out.print("Please Select option[1,2,3,4,5] :");
			
			option = Integer.parseInt(br.readLine());
			
			switch(option) 
			{
			case 1: // insert
			{
				System.out.println("-----Please Enter the employee Details------");
				System.out.print("Enter the Employee Id : ");
				int eid = Integer.parseInt(br.readLine());
				
				System.out.print("Enter the Employee Name : ");
				String ename = br.readLine();
				
				System.out.print("Enter the Employee Address : ");
				String eaddr = br.readLine();
				
				System.out.print("Enter the Employee Salary : ");
				float esal = Float.parseFloat(br.readLine());
				
				
				System.out.print("Enter the Employee Position : ");
				String eposition = br.readLine();
				
				employee.setEid(eid);
				employee.setEname(ename);
				employee.setEaddr(eaddr);
				employee.setEsal(esal);
				employee.setEposition(eposition);
				
				
				String employeeInsert = service.employeeInsert(employee);
				
				if(employeeInsert != null)
				{
					System.out.println(employeeInsert);
					
				}
				else
				{
					System.out.println("Employee Data not Insert.....");
				}
				
								
			}
			break;
			
			case 2:// search
			{
				System.out.println("-------Search Opearations-------------");
				System.out.print("Enter the Employee Id : ");
				int eid = Integer.parseInt(br.readLine());
				
				Employee es = service.employeeSearch(eid);
				
				System.out.println("---------User Details--------");
				
				System.out.println("Employee Id : "+es.getEid());
				System.out.println("Employee Name : "+es.getEname());
				System.out.println("Employee Address : "+es.getEaddr());
				System.out.println("Employee Salary : "+es.getEsal());
				System.out.println("Employee Position : "+es.getEposition());
				
				System.out.println("--------------------------------------------");
				
				
				
			}
			break;
			
			case 3:// update
			{
				
				System.out.println("----------Update Operations------------------");
				
				System.out.println("Enter the Employee ID : ");
			
				int eid = Integer.parseInt(br.readLine());
				Employee es = service.employeeSearch(eid);
				
				if(eid==es.getEid()) {
					
					System.out.println("----------Enter the Update Details---------");
					//Integer eid = es.getEid();
					String ename =es.getEname();
					String eaddr = es.getEaddr();
					Float esal =es.getEsal();
					String eposition = es.getEposition();
					
					System.out.println("Enter the Employee Name : ");
					String ename1 = br.readLine();
					ename=ename1;
					
					System.out.println("Enter the Employee Address : ");
					String eaddr1 =br.readLine();
					eaddr =eaddr1;
					
					System.out.println("Enter the Employee Salary : ");
					float esal1 =Float.parseFloat(br.readLine());
					esal=esal1;
					
					
					System.out.println("Enter the Employee Position : ");
					String eposition1 =br.readLine();
					eposition=eposition1;
					
					Employee emp = new Employee();
					
					emp.setEid(eid);
					emp.setEname(ename1);
					emp.setEaddr(eaddr1);
					emp.setEsal(esal1);
					emp.setEposition(eposition1);
					
					String employeeUpdate = service.employeeUpdate(emp);
					System.out.println(employeeUpdate);
					
					
				}
				
				else {
					System.out.println("No Employee Search...............");
				}

				
			}
			break;
			case 4:// Delete
			{
				
				System.out.println("---------------------------------------");
				System.out.println("Enter the Id Delete :");
				
				int empId = Integer.parseInt(br.readLine());
				
				
				Employee employeeSearch = service.employeeSearch(empId);
				String ed = service.employeeDelete(empId);
				System.out.println(ed);
				
				
			}
			
	
			}
			
			
		}
		

	}

}
