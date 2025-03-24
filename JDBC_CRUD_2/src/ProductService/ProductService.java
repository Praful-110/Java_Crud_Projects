package ProductService;

import softronix.in.entity.Products;

public interface ProductService {
	
	public String productInsert(Products product);
	
	public Products ProductSearch(Integer productId);
	
	public String ProductUpdate (Products product);
	
	public String ProductDelete (Integer productId);

}
