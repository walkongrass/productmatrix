/**
 * 
 */
package org.productmatrix.biz.product.impl;

import java.util.List;

import org.productmatrix.biz.product.ProductVersionManager;
import org.productmatrix.dao.ProductVersionDAO;
import org.productmatrix.model.ProductVersion;
import org.productmatrix.util.Paginer;
import org.productmatrix.util.Result;

/**
 * @author lizhu.zhanglz
 *
 */
public class ProductVersionManagerImpl implements ProductVersionManager {
	
	private ProductVersionDAO productVersionDAO;

	/* (non-Javadoc)
	 * @see org.productmatrix.biz.product.ProductVersionManager#listProductVersions(java.lang.Long, int)
	 */
	@Override
	public Paginer<ProductVersion> listProductVersions(Long productId,
			int currentPage,int pageSize) {
		int count = productVersionDAO.countProductVersion(productId);
		if(count> 0 && count > (currentPage-1)*pageSize){
			List<ProductVersion> list = productVersionDAO.getProductVersions(productId, pageSize, (currentPage-1)*pageSize);
			Paginer<ProductVersion> paginer = new Paginer<ProductVersion>();
			paginer.setCurrentPage(currentPage);
			paginer.setContent(list);
			paginer.setTotal(count);
			paginer.setPageCount(pageSize);
			return paginer;
		}
		else {
			return null;
		}
	}

	public ProductVersionDAO getProductVersionDAO() {
		return productVersionDAO;
	}

	public void setProductVersionDAO(ProductVersionDAO productVersionDAO) {
		this.productVersionDAO = productVersionDAO;
	}

	@Override
	public Result addProductVersion(ProductVersion pv) {
		if(pv != null ) {
			productVersionDAO.createProductVersion(pv);
		}
		return null;
	}

}
