/**
 * 
 */
package org.productmatrix.biz.product;

import org.productmatrix.model.ProductVersion;
import org.productmatrix.util.Paginer;
import org.productmatrix.util.Result;

/**
 * @author lizhu.zhanglz
 * 
 */
public interface ProductVersionManager {

	Paginer<ProductVersion> listProductVersions(Long productId,int currentPage,int pageSize);

	Result addProductVersion(ProductVersion pv);

}
