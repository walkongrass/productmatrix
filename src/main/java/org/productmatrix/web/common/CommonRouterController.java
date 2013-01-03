/**
 * 
 */
package org.productmatrix.web.common;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.productmatrix.util.StringUtil;
import org.productmatrix.web.common.exception.CommonRouterControllerException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author lizhu.zhanglz
 *
 */
public class CommonRouterController implements Controller {
	
	private static final String ACTION="action";
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String action= request.getParameter(ACTION);
		if(StringUtil.isBlank(action)){
			throw new CommonRouterControllerException("Cannot find "+ACTION+" parameter.");
		}
		
		Method m = getMethod(action);
		if(m == null) {
			throw new CommonRouterControllerException("Cannot find Method:"+action);
		}
		return (ModelAndView)m.invoke(this,request, response);
	}
	
	private Method getMethod(String methodName) {
		try{
			return getClass().getDeclaredMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
