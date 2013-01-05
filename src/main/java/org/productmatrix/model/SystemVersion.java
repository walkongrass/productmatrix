/**
 * 
 */
package org.productmatrix.model;

/**
 * @author lizhu.zhanglz
 *
 */
public class SystemVersion extends BasicModel {
	
	private Long systemVerId;
	
	private Long systemId;
	
	private String versionNum;
	
	private String versionDes;

	public Long getSystemVerId() {
		return systemVerId;
	}

	public void setSystemVerId(Long systemVerId) {
		this.systemVerId = systemVerId;
	}

	public Long getSystemId() {
		return systemId;
	}

	public void setSystemId(Long systemId) {
		this.systemId = systemId;
	}

	public String getVersionNum() {
		return versionNum;
	}

	public void setVersionNum(String versionNum) {
		this.versionNum = versionNum;
	}

	public String getVersionDes() {
		return versionDes;
	}

	public void setVersionDes(String versionDes) {
		this.versionDes = versionDes;
	}
	
}
