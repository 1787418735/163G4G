/**
 * 
 */
package com.qhit.lh.g4.lmy.sbm.utils;

import java.util.UUID;

public class IDUtil {
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}
