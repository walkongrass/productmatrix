/**
 * 
 */
package org.productmatrix.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lizhu.zhanglz
 *
 */
public final class DateUtil {
	
	private static final String DEFAULT_DATE_FROMAT = "yyyy-MM-dd hh:mm:ss";
	
	public static String format(Date date) {
		if(date != null) {
			return new SimpleDateFormat(DEFAULT_DATE_FROMAT).format(date);
		}
		return null;
	}

	
}
