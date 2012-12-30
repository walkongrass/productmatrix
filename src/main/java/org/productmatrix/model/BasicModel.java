/**
 * 
 */
package org.productmatrix.model;

import java.util.Date;

/**
 * @author lizhu.zhanglz
 *
 */
public class BasicModel {
	
	private Date gmtCreated;
	
	private Date gmtModified;

	public Date getGmtCreated() {
		return gmtCreated;
	}

	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

}
