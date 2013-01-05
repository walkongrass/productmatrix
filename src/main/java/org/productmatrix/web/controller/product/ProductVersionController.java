/**
 * 
 */
package org.productmatrix.web.controller.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.productmatrix.biz.product.ProductVersionManager;
import org.productmatrix.model.ProductVersion;
import org.productmatrix.util.Paginer;
import org.productmatrix.web.common.CommonRouterController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lizhu.zhanglz
 *
 */
public class ProductVersionController extends CommonRouterController {
	private ProductVersionManager productVersionManager;
	
	public ModelAndView getProductVersions(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Long productId = Long.valueOf(request.getParameter("productId"));
		int currentPage = Integer.valueOf(request.getParameter("currentPage"));
		int pageSize = Integer.valueOf(request.getParameter("pageSize"));
		Paginer<ProductVersion> paginer = productVersionManager.listProductVersions(productId, currentPage, pageSize);
		return null;
	}

	public void setProductVersionManager(ProductVersionManager productVersionManager) {
		this.productVersionManager = productVersionManager;
	}
}
