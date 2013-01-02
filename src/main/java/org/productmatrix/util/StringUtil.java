/**
 * 
 */
package org.productmatrix.util;

/**
 * @author lizhu.zhanglz
 *
 */
public final class StringUtil {
	public static boolean isBlank(String in) {
		if(in == null || in.trim().length() == 0){
			return true;
		}
		else {
			return false;
		}
	}
}
