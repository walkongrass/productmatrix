/**
 * 
 */
package org.productmatrix.web.controller.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.productmatrix.model.Product;
import org.productmatrix.util.Result;
import org.productmatrix.web.controller.common.CommonRouterController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lizhu.zhanglz
 *
 */
public class ProductConroller extends CommonRouterController{

	public ModelAndView listProducts(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Product p = new Product();
		p.setProductName("p_name");
		Result<Product> result = new Result<Product>();
		result.setSucceed(true);
		result.setModel(p);
		return new ModelAndView("productList","product",result);
	}

}
