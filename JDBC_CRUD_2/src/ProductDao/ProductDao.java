package ProductDao;

import softronix.in.entity.Products;

public interface ProductDao {
	
	public String insert(Products product);
	
	public Products search(Integer productId);
	
	public String update (Products product);
	
	public String delete (Integer productId);
	

}
