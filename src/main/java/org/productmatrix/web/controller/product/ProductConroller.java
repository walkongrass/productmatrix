/**
 * 
 */
package org.productmatrix.web.controller.product;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.productmatrix.biz.product.ProductManager;
import org.productmatrix.model.Product;
import org.productmatrix.util.Result;
import org.productmatrix.util.StringUtil;
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
			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(response.getOutputStream(),"UTF8"),true);
			writer.write(builder.toString());
			writer.flush();
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
	
	
	public ModelAndView addProduct(HttpServletRequest request,HttpServletResponse response) throws Exception{
		String productName = request.getParameter("pName");
		String productDesc = request.getParameter("pDesc");
		
		if(StringUtil.isBlank(productDesc) || StringUtil.isBlank(productName)){
			// TODO: return the right content.
			response.getOutputStream().write("{\"isSuccess\":\"false\"}".getBytes());
			return null;
		}
		else {
			Product product = new Product();
			product.setProductName(productName);
			product.setProductDes(productDesc);
			productManager.addProduct(product);
			response.getOutputStream().write("{\"isSuccess\":\"true\"}".getBytes());
			return null;
		}
	}

	public void setProductManager(ProductManager productManager) {
		this.productManager = productManager;
	}
	
}
