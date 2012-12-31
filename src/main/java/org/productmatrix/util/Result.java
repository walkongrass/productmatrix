/**
 * 
 */
package org.productmatrix.util;

import java.io.Serializable;

/**
 * @author lizhu.zhanglz
 *
 */
public class Result<T> implements Serializable {

	private String errorCode;
	
	private String errorMessage;
	
	private boolean isSucceed = false;
	
	private T model;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public boolean isSucceed() {
		return isSucceed;
	}

	public void setSucceed(boolean isSucceed) {
		this.isSucceed = isSucceed;
	}
	
	public void setModel(T model){
		this.model = model;
	}
	
	public T getModel() {
		return this.model;
	}


}
