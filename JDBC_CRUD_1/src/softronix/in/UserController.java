package softronix.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import UserFactory.ServiceFactory;
import UserService.UserService;
import softronix.in.entity.User;

public class UserController {

	public static void main(String[] args) throws Exception, IOException 
	{
		BufferedReader br = new BufferedReader  (new InputStreamReader(System.in));
		Integer option;
		User user = new User();
		UserService service=ServiceFactory.getService();

		while(true)
		{
			System.out.println("--------Perform crud operation-----------");
			
			System.out.println("To Insert User Select 1 : Insert");
			System.out.println("To Search User Select 2 : Search");
			System.out.println("To Update User Select 3 : Update");
			System.out.println("To Delete User Select 4 : Delete");
			System.out.println("To Exit Select 5 : Exit");
			
			System.out.println();
			
			System.out.print("Please Select options[1,2,3,4,5]  : ");
			
			option = Integer.parseInt(br.readLine());
			
			switch(option)
			{
			case 1:  // Insert
				
				System.out.println("*********Please Enter the User Details*********");
				
				System.out.print("Enter the User Id : ");
				int uid = Integer.parseInt(br.readLine());
				
				System.out.print("Enter the User Name : ");
				String uname = br.readLine();
				
				System.out.print("Enter the User Salary : ");
				float usal = Float.parseFloat(br.readLine());
				
				System.out.print("Enter the User Address : ");
				String uaddr = br.readLine();
				
				user.setUid(uid);
				user.setUname(uname);
				user.setUsal(usal);
				user.setUaddr(uaddr);
				
				
				String userInsert = service.userInsert(user);
				
				if(userInsert != null)
				{
					System.out.println(userInsert);
				}
				else
				{
					System.out.println("This User is not Avilable...");
				}
				
				break;
				
			case 2: // Search
			{
				System.out.println("*************Search Operation***************");
				
				System.out.println("Enter the User Id : ");
				Integer id = Integer.parseInt(br.readLine());
				User u= service.userSearch(id);
				
				System.out.println("*********************User Details*******************");
				
				System.out.println("User Id :" +u.getUid());
				System.out.println("User Name :" +u.getUname());
				System.out.println("User Salary :" +u.getUsal());
				System.out.println("User Address :" +u.getUaddr());
				
				
				System.out.println("----------------------------------------\n ");
							
				
			}
			break;
			
			case 3 : // Update
			{
				
				System.out.println("Update The Details");				
				System.out.print("Enter the User Id : ");
				Integer d = Integer.parseInt(br.readLine());
				User us= service.userSearch(d);
				
				
				if(d==us.getUid())
				{
					System.out.println("Enter a user Updated details");
				
					//Integer uid1 =us.getUid();
					String uname1=us.getUname();
					float usal1=us.getUsal();
					String uaddr1=us.getUaddr();
				
				
				System.out.print("Enter the User Name : ");
				String name = br.readLine();
				uname1 =name; 
				
				System.out.print("Enter the User Salary : ");
				float sal = Float.parseFloat(br.readLine());
				usal1 = sal;
				
				System.out.print("Enter the User Address : ");
				String addr = br.readLine();
				uaddr1 = addr;
				
				User newuser = new User();
				
				//newuser.setUid(uid1);
				newuser.setUname(uname1);
				newuser.setUsal(usal1);
				newuser.setUaddr(uaddr1);
				
				String userUpdate = service.userUpdate(newuser);
				System.out.println(userUpdate);
				
				}
				else
				{
					System.out.println("No search user........");
				}
				
				}
			
			break;
			
			case 4: // Delete
			{
				System.out.println("---------------------");
				System.out.println("Enter the ID delete");
				
				int uid1 = Integer.parseInt(br.readLine());
				
				User us= service.userSearch(uid1);
				
				String ud = service.userDelete(uid1);
				
				System.out.println(ud);
				
			}
				
				
			}
			
			
			
			}
			
		}
		
	

}
