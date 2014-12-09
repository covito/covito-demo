package org.covito.demo.nutz.console;

import org.covito.demo.nutz.commons.LoggerHelper;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;

public class ConsoleMvcSetup implements Setup {

	/**
	 * 当服务启动时运行
	 */
	public void init(NutConfig config) {
		LoggerHelper.system.info("console setup");
	}

	@Override
	public void destroy(NutConfig config) {
		LoggerHelper.system.info("console destroy");
	}

}
