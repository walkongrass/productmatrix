/**
 * 
 */
package org.productmatrix.dao;

import java.util.List;

import org.productmatrix.model.Product;

/**
 * @author lizhu.zhanglz
 *
 */
public interface ProductDAO {
	public List<Product> listProducts();
	
	public void addProduct(Product product);
	
}
