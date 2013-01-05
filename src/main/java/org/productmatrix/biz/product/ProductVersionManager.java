/**
 * 
 */
package org.productmatrix.biz.product;

import org.productmatrix.model.ProductVersion;
import org.productmatrix.util.Paginer;

/**
 * @author lizhu.zhanglz
 * 
 */
public interface ProductVersionManager {

	Paginer<ProductVersion> listProductVersions(Long productId,int currentPage,int pageSize);

}
