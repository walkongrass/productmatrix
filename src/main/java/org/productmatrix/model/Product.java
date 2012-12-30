package org.productmatrix.model;

import java.util.Date;

/**
 * 
 * @author lizhu.zhanglz
 *
 */
public class Product extends BasicModel {
	private Long productId;
	
	private String productName;
	
	private String productDes;
	
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDes() {
		return productDes;
	}

	public void setProductDes(String productDes) {
		this.productDes = productDes;
	}
}
