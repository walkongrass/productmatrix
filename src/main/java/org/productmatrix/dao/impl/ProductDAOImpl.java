/**
 * 
 */
package org.productmatrix.dao.impl;

import java.util.List;

import org.productmatrix.dao.ProductDAO;
import org.productmatrix.model.Product;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * @author lizhu.zhanglz
 *
 */
public class ProductDAOImpl extends SqlMapClientDaoSupport implements ProductDAO {

	/* (non-Javadoc)
	 * @see org.productmatrix.dao.ProductDAO#listProducts()
	 */
	@Override
	public List<Product> listProducts() {
		SqlMapClientTemplate template = getSqlMapClientTemplate();
		return (List<Product>)template.queryForList("listProducts");
	}

	@Override
	public void addProduct(Product product) {
		SqlMapClientTemplate template = getSqlMapClientTemplate();
		template.insert("addProduct", product);
	}

}
