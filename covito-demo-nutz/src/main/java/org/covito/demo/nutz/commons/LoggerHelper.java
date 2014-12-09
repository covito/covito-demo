package org.covito.demo.nutz.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggerHelper {
	
	
	/**
	 * 此log将写进logger.log
	 */
	public static Logger logger=LoggerFactory.getLogger("logger");
	
	/**
	 * 此log将写进system.log
	 */
	public static Logger system=LoggerFactory.getLogger("system");
	
}
