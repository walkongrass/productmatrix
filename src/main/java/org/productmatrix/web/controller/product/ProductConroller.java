/**
 * 
 */
package org.productmatrix.web.controller.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.productmatrix.biz.product.ProductManager;
import org.productmatrix.model.Product;
import org.productmatrix.util.Result;
import org.productmatrix.web.common.CommonRouterController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lizhu.zhanglz
 *
 */
public class ProductConroller extends CommonRouterController{
	
	private ProductManager productManager;
	

	public ModelAndView listProducts(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Result<List<Product>> result = productManager.listProducts();
		if(result.isSucceed()) {
			List<Product> list = result.getModel();
			StringBuilder builder = new StringBuilder("[");
			for(int i = 0,size = list.size() ;i < size; i ++) {
				builder.append(assambleProductTreeJson(list.get(i)));
				if(size > 1 && i < size -1) {
					builder.append(",");
				}
			}
			builder.append("]");
			response.getOutputStream().write(builder.toString().getBytes());
		}
		else {
			Product p = new Product();
			p.setProductName("p_name");
			p.setProductId(1L);
			response.getOutputStream().write(assambleProductTreeJson(p).getBytes());
		}
		
		return null;
		
	}

	private String assambleProductTreeJson(Product p) {
		StringBuilder builder = new StringBuilder("{");
		builder.append("\"id\":\"").append(p.getProductId())
				.append("\",\"text\":\"").append(p.getProductName())
				.append("\",\"state\":\"open\"");
		builder.append("}");
		return builder.toString();

	}

	public void setProductManager(ProductManager productManager) {
		this.productManager = productManager;
	}
	
}
