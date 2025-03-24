package UserDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import UserFactory.ConnectionFactory;
import softronix.in.entity.User;

public class UserDaoImpl implements UserDao {
	
	User user = new User();
	
	Connection con = ConnectionFactory.getConnection();
	String sql;
	String result="";
	
	
	//-------------------------------------Insert-----------------------------------------

	@Override
	public String insert(User user) {
		int uid = user.getUid();
		String uname = user.getUname();
		float usal = user.getUsal();
		String uaddr = user.getUaddr();
		
		try {
			
			Statement st = con.createStatement();
			sql="Insert Into User Values ("+uid+",'"+uname+"','"+usal+"','"+uaddr+"')";
			
			boolean b = st.execute(sql);
			
			if(b!=true)
			{
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
	
	
	//--------------------------------Search-----------------------------------------

	@Override
	public User search(Integer uid) {
		
		try {
			Statement st = con.createStatement();
			
			String sql = "select * from user where uid="+uid+"";
			
			ResultSet set = st.executeQuery(sql);
			
			System.out.println(set);
			
			boolean b = set.next();
			
			if( b==true)
			{
				
				user.setUid(set.getInt("UID"));
				user.setUname(set.getString("UNAME"));
				user.setUsal(set.getFloat("USAL"));
				user.setUaddr(set.getString("UADDR"));
			}
			
			else
			{
				user=null;
			}
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return user;
	}
	
	
	//--------------------------------Update---------------------------------------

	@Override
	public String update(User user) {
		
		try {
			
			int uid = user.getUid();
			String uname = user.getUname();
			float usal = user.getUsal();
			String uaddr = user.getUaddr();
			
			Statement st = con.createStatement();
			sql="update user set uname = '"+uname+"',usal='"+usal+"',uaddr='"+uaddr+"'Where uid ="+uid+"";
			
			boolean b = st.execute(sql);
			
			if(b!=true)
			{
				return result ="User Data Update Sucessfully.........";
			}
			else
			{
				result=null;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}

	//------------------------------Delete--------------------
	@Override
	public String delete(Integer uid) {
		
		
		try {
			
			Statement st = con.createStatement();
			sql="Delete from user where uid = "+uid+"";
			
			boolean b = st.execute(sql);
			
			if(b!=true)
			{
				return result ="User Data delete Sucessfully.........";
			}
			else
			{
				result=null;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return result;
		
	}

}
