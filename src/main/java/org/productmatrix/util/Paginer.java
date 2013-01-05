/**
 * 
 */
package org.productmatrix.util;

import java.util.List;

/**
 * @author lizhu.zhanglz
 * 
 */
public final class Paginer<T> {
	private int total;
	
	private List<T> content;
	
	private int currentPage;
	
	private int pageCount;

	public Paginer() {

	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

}
