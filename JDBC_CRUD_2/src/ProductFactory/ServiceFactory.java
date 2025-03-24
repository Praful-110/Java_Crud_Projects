package ProductFactory;

import ProductService.ProductService;
import ProductService.ProductServiceImpl;

public class ServiceFactory {

	public static ProductService productService = null;
	
	static {
		
		productService = new ProductServiceImpl();
		
	}
	
	public static ProductService getService() {
		return productService;
	}
	
}
