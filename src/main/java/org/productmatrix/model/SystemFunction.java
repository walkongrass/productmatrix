/**
 * 
 */
package org.productmatrix.model;

/**
 * @author lizhu.zhanglz
 *
 */
public class SystemFunction extends BasicModel {
	private Long funId;
	
	private String funName;
	
	private String funDes;
	
	private Long sysVerId;

	public Long getFunId() {
		return funId;
	}

	public void setFunId(Long funId) {
		this.funId = funId;
	}

	public String getFunName() {
		return funName;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public String getFunDes() {
		return funDes;
	}

	public void setFunDes(String funDes) {
		this.funDes = funDes;
	}

	public Long getSysVerId() {
		return sysVerId;
	}

	public void setSysVerId(Long sysVerId) {
		this.sysVerId = sysVerId;
	}
	
	
}
