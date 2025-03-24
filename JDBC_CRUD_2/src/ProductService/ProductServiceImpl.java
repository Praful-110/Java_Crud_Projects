package ProductService;

import ProductDao.ProductDao;
import ProductFactory.DaoFactory;
import softronix.in.entity.Products;

public class ProductServiceImpl implements ProductService {
	
	Products product = new Products();
	ProductDao Dao = DaoFactory.getDao();
	@Override
	public String productInsert(Products product) {
		
		String insert = Dao.insert(product);
		return insert;
	}

	@Override
	public Products ProductSearch(Integer productId) {
		 Products search = Dao.search(productId);
		return search;
	}

	@Override
	public String ProductUpdate(Products product) {
		String update = Dao.update(product);
		return update;
	}

	@Override
	public String ProductDelete(Integer productId) {
		String delete = Dao.delete(productId);
		return delete;
	}

}
