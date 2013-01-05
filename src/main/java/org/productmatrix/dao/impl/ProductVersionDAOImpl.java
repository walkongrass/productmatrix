/**
 * 
 */
package org.productmatrix.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.productmatrix.dao.ProductVersionDAO;
import org.productmatrix.model.ProductVersion;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * @author lizhu.zhanglz
 *
 */
public class ProductVersionDAOImpl extends SqlMapClientDaoSupport implements ProductVersionDAO {

	/* (non-Javadoc)
	 * @see org.productmatrix.dao.ProductVersionDAO#countProductVersion(java.lang.Long)
	 */
	@Override
	public int countProductVersion(Long productId) {
		return (Integer)getSqlMapClientTemplate().queryForObject("countProductVersion",productId);
		
	}

	/* (non-Javadoc)
	 * @see org.productmatrix.dao.ProductVersionDAO#getProductVersions(java.lang.Long, int, int)
	 */
	@Override
	public List<ProductVersion> getProductVersions(Long productId, int pageSize,
			int offset) {
		HashMap params  = new HashMap();
		params.put("productId", productId);
		params.put("pageSize", pageSize);
		params.put("offset", offset);
		return (List<ProductVersion>)getSqlMapClientTemplate().queryForList("getProductVersions", params);
	}

}
