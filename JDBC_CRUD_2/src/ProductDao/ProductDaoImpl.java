package ProductDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ProductFactory.ConnectionFactory;
import softronix.in.entity.Products;

public class ProductDaoImpl implements ProductDao {

	Products product = new Products();
	Connection con = ConnectionFactory.getConnection();
	String sql;
	String result = "";
	
	//--------------------------------Insert------------------------------------------
	@Override
	public String insert(Products product) {
		
		int productId = product.getProductId();
		String productName = product.getProductName();
		String productCode=product.getProductCode();
		float productPrice = product.getProductPrice();
		String productCity= product.getProductCity();
		
		try {
			Statement st = con.createStatement();
			sql="Insert into products Values("+productId+",'"+productName+"','"+productCode+"','"+productPrice+"','"+productCity+"')";
			
			boolean b = st.execute(sql);
			
			if(b==true) {
				
				return result="Data Insert Sucessfully......";
				
			}
			else {
				result = null;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
				
		return null;
	}
	
	
	//------------------------------Search--------------------------------------

	@Override
	public Products search(Integer productId) {
		try {
			
			Statement st = con.createStatement();
			String sql="Select * from products where productId = "+productId+"";
			ResultSet set = st.executeQuery(sql);
			
			System.out.println(set);
			boolean b = set.next();
			
			
			if(b==true)
			{
				product.setProductId(set.getInt("productId"));
				product.setProductName(set.getString("productName"));
				product.setProductCode(set.getString("productCode"));
				product.setProductPrice(set.getFloat("productPrice"));
				product.setProductCity(set.getString("productCity"));
				
				
				
			}
			else
			{
				product =null;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return product;
	}
	
	
	//---------------------------Update--------------------------------------

	@Override
	public String update(Products product) {
		
		try {

			int productId = product.getProductId();
			String productName = product.getProductName();
			String productCode=product.getProductCode();
			float productPrice = product.getProductPrice();
			String productCity= product.getProductCity();
			
			Statement st = con.createStatement();
			
			sql="update products set productName ='"+productName+"', productCode='"+productCode+"', productPrice='"+productPrice+"',productCity='"+productCity+"' Where productId="+productId+"";
			boolean b = st.execute(sql);
			
			if(b!=true)
			{
				return result ="Product Data Update Sucessfully..............";
				
			}
			else {
				result=null;
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	//-----------------------------Delete---------------------------------------

	@Override
	public String delete(Integer productId) {
		try {
			Statement st = con.createStatement();
			
			String sql="Delete from products where productId = "+productId+"";
			boolean b = st.execute(sql);
			
			if(b!=true)
			{
				return result ="Data delete Sucessfully.........";
			}
			else
			{
				result= null;
			}
			
		} catch (Exception e) {
			
		}
		return result;
	}

}
