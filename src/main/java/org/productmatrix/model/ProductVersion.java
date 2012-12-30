/**
 * 
 */
package org.productmatrix.model;

/**
 * @author lizhu.zhanglz
 *
 */
public class ProductVersion extends BasicModel {

	private Long versionId;
	
	private Long productId;
	
	private String versionDes;
	
	private String versionNum;

	public Long getVersionId() {
		return versionId;
	}

	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getVersionDes() {
		return versionDes;
	}

	public void setVersionDes(String versionDes) {
		this.versionDes = versionDes;
	}

	public String getVersionNum() {
		return versionNum;
	}

	public void setVersionNum(String versionNum) {
		this.versionNum = versionNum;
	}
	
}
