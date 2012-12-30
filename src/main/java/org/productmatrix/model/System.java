/**
 * 
 */
package org.productmatrix.model;


/**
 * @author lizhu.zhanglz
 *
 */
public class System extends BasicModel {
	private Long systemId;
	
	private String systemName;
	
	private String systemDes;
	
	private Long prodVerId;

	public Long getSystemId() {
		return systemId;
	}

	public void setSystemId(Long systemId) {
		this.systemId = systemId;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getSystemDes() {
		return systemDes;
	}

	public void setSystemDes(String systemDes) {
		this.systemDes = systemDes;
	}
}
