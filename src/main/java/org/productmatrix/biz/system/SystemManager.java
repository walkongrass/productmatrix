/**
 * 
 */
package org.productmatrix.biz.system;

import java.util.List;

import org.productmatrix.model.SystemFunction;
import org.productmatrix.model.SystemVersion;
import org.productmatrix.util.Result;

/**
 * @author lizhu.zhanglz
 *
 */
public interface SystemManager {
	
	public Result<System> addSystem(org.productmatrix.model.System system);
	
	public Result<System> getSystemById(Long systemId);
	
	public Result removeSystem(Long systemId);
	
	public Result<List<System>> listSystems();
	
	public Result<List<System>> listSystemsByProductId(Long productId);
	
	public Result addSystemVersion(SystemVersion sv);
	
	public Result removeSystemVersionById(Long id);
	
	public Result addSystemFunction(SystemFunction sf);
	
	public Result removeSystemFunction(Long id);
	

}
