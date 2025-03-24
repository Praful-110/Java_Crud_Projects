package EmployeeDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import EmployeeFactory.ConnectionFactory;
import softronix.in.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	Employee employee = new Employee();
	Connection con = ConnectionFactory.getConnection();
	String sql;
	String result;
	
	//-----------------------------Insert-------------------------------------------
	@Override
	public String insert(Employee employee) {
		int eid=employee.getEid();
		String ename = employee.getEname();
		String eaddr = employee.getEaddr();
		float esal = employee.getEsal();
		String eposition = employee.getEposition();
		
		try {
			Statement st = con.createStatement();
			sql = "insert into employee values("+eid+",'"+ename+"','"+eaddr+"','"+esal+"','"+eposition+"')";
			boolean b = st.execute(sql);
			
			if(b==true)
			{
				return result="Data Insert Sucessfully.....";
			}
			else {
				result=null;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//------------------------------Search-------------------------------------------

	@Override
	public Employee search(Integer eid) {
		try {
			Statement st = con.createStatement();
			String sql = "select * from employee where eid ="+eid+"";
			
			ResultSet set = st.executeQuery(sql);
			boolean b = set.next();
			
			
			if(b==true)
			{
				 employee.setEid(set.getInt("eid"));
				 employee.setEname(set.getString("ename"));
				 employee.setEaddr(set.getString("eaddr"));
				 employee.setEsal(set.getFloat("esal"));
				 employee.setEposition(set.getString("eposition"));
				 
			}
			
			else {
				employee =null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}
	
	
	//------------------------------Update-------------------------------------

	@Override
	public String update(Employee employee) {
		
		try {
			
			int eid=employee.getEid();
			String ename = employee.getEname();
			String eaddr = employee.getEaddr();
			float esal = employee.getEsal();
			String eposition = employee.getEposition();
			
			
			Statement st = con.createStatement();
			sql = "update employee set ename = '"+ename+"',eaddr='"+eaddr+"',esal='"+esal+"',eposition='"+eposition+"'where eid="+eid+"";
			boolean b = st.execute(sql);
			
			if(b!=true)
			{
				return result="Employee Data Update Sucessfully.....";
			}
			else {
				result=null;
			}
			
			
			
		} catch (Exception e)
		{
				e.printStackTrace();
		}
		
		
		return result;
	}

	
	//-------------------------------Delete----------------------------------------
	
	@Override
	public String delete(Integer eid) {
		
		try {
			Statement st = con.createStatement();
			sql="Delete from employee where eid = "+eid+"";
			boolean b = st.execute(sql);
			
			if(b!=true)
			{
				return result ="Employee Data delete Sucessfully.........";
			}
			else
			{
				result=null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
