/**
 * 
 */
package org.productmatrix.web.controller.product;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.productmatrix.biz.product.ProductVersionManager;
import org.productmatrix.model.ProductVersion;
import org.productmatrix.util.DateUtil;
import org.productmatrix.util.Paginer;
import org.productmatrix.web.common.CommonRouterController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

/**
 * @author lizhu.zhanglz
 *
 */
public class ProductVersionController extends CommonRouterController {
	private ProductVersionManager productVersionManager;
	
	public ModelAndView getProductVersions(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Long productId = Long.valueOf(request.getParameter("productId"));
		int currentPage = Integer.valueOf(request.getParameter("page"));
		int pageSize = Integer.valueOf(request.getParameter("rows"));
		Paginer<ProductVersion> paginer = productVersionManager.listProductVersions(productId, currentPage, pageSize);
		if(paginer == null) {
			paginer = new Paginer<ProductVersion>();
			paginer.setTotal(0);
		}
		
		StringBuilder builder = new StringBuilder("{\"total\":");
		builder.append("\"").append(paginer.getTotal()).append("\",\"rows\":[");
		if(paginer.getTotal() > 0){
			List<ProductVersion> list=paginer.getContent();
			for(int i = 0 , size = list.size(); i< size; i++){
				builder.append(assembleProductVersion(list.get(i)));
				if(size > 1 && i < size -1) {
					builder.append(",");
				}
			}
		}
		builder.append("]}");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(response.getOutputStream(),"UTF8"),true);
		writer.write(builder.toString());
		writer.flush();
		return null;
	}

	private String assembleProductVersion(ProductVersion productVersion) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("versionid", productVersion.getVersionId());
		jsonObject.put("versionnum", productVersion.getVersionNum());
		jsonObject.put("desc", productVersion.getVersionDes());
		jsonObject.put("gmtcreated", DateUtil.format(productVersion.getGmtCreated()));
		return jsonObject.toJSONString();
	}

	public void setProductVersionManager(ProductVersionManager productVersionManager) {
		this.productVersionManager = productVersionManager;
	}
}
