/**
 * 
 */
package org.productmatrix.dao;

import java.util.List;

import org.productmatrix.model.ProductVersion;

/**
 * @author lizhu.zhanglz
 *
 */
public interface ProductVersionDAO {
	
	int countProductVersion(Long productId);
	
	List<ProductVersion> getProductVersions(Long productId,int pageSize,int offset);
	
}
