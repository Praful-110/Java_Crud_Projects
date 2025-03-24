package ProductFactory;

import ProductDao.ProductDao;
import ProductDao.ProductDaoImpl;

public class DaoFactory {

	private static ProductDao productDao= null;
	
	static {
		
		productDao = new ProductDaoImpl();
		
			
	}
	public static ProductDao getDao() {
		return productDao;
	}
}
