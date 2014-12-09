package org.covito.demo.nutz.commons;

import org.nutz.dao.Dao;
import org.nutz.ioc.Ioc;
import org.nutz.mvc.Mvcs;


public class DBManager {
	
	/**
	 * 获取默认的dao
	 * @return
	 */
	public static Dao getDao(){
		return getDao("dao");
	}
	
	/**
	 * 获取其它DAO
	 * @param bean
	 * @return
	 */
	public static Dao getDao(String bean){
		Ioc ioc=Mvcs.ctx.getDefaultIoc();
		Dao dao=ioc.get(Dao.class, bean);
		return dao;
	}
	
	
}
