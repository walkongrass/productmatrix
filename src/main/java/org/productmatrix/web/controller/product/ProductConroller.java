/**
 * 
 */
package org.productmatrix.web.controller.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.productmatrix.model.Product;
import org.productmatrix.util.Result;
import org.productmatrix.web.common.CommonRouterController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lizhu.zhanglz
 *
 */
public class ProductConroller extends CommonRouterController{

	public ModelAndView listProducts(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Product p = new Product();
		p.setProductName("p_name");
		p.setProductId(1L);
		response.getOutputStream().write(assambleProductTreeJson(p).getBytes());
		return null;
		
	}

	private String assambleProductTreeJson(Product p) {
		StringBuilder builder = new StringBuilder("[{");
		builder.append("\"id\":\"").append(p.getProductId())
				.append("\",\"text\":\"").append(p.getProductName())
				.append("\",\"state\":\"open\"");
		builder.append("}]");
		return builder.toString();

	}
	
}
