/**
 * 
 */
package org.productmatrix.biz.product;

import java.util.List;

import org.productmatrix.model.Product;
import org.productmatrix.util.Result;

/**
 * @author lizhu.zhanglz
 *
 */
public interface ProductManager {
	
	public Result addProduct(Product product);
	
	public Result<Product> getProductById(Long id);
	
	//TODO: Paging
	public Result<List<Product>> listProducts();
	
	public Result removeProductById(Long id);
	
	public Result addVersionForProduct(Long productId);
	

}
