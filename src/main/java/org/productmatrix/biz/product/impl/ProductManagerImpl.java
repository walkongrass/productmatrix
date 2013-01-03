/**
 * 
 */
package org.productmatrix.biz.product.impl;

import java.util.List;

import org.productmatrix.biz.product.ProductManager;
import org.productmatrix.dao.ProductDAO;
import org.productmatrix.model.Product;
import org.productmatrix.util.Result;

/**
 * @author lizhu.zhanglz
 *
 */
public class ProductManagerImpl implements ProductManager {
	
	private ProductDAO productDAO;
	
	

	/* (non-Javadoc)
	 * @see org.productmatrix.biz.product.ProductManager#addProduct(org.productmatrix.model.Product)
	 */
	@Override
	public Result<Product> addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.productmatrix.biz.product.ProductManager#getProductById(java.lang.Long)
	 */
	@Override
	public Result<Product> getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.productmatrix.biz.product.ProductManager#listProducts()
	 */
	@Override
	public Result<List<Product>> listProducts() {
		
		Result<List<Product>> result = new Result<List<Product>>();
//		try{
			List<Product> list = productDAO.listProducts();
			if(list == null) {
				result.setSucceed(false);
			}
			else {
				result.setSucceed(true);
				result.setModel(list);
			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally{
//			return result;
//		}
//		
		return result;
	}

	/* (non-Javadoc)
	 * @see org.productmatrix.biz.product.ProductManager#removeProductById(java.lang.Long)
	 */
	@Override
	public Result removeProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.productmatrix.biz.product.ProductManager#addVersionForProduct(java.lang.Long)
	 */
	@Override
	public Result addVersionForProduct(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

}
