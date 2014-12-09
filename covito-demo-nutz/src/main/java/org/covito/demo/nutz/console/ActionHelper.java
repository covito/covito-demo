package org.covito.demo.nutz.console;

import javax.servlet.http.HttpSession;

import org.covito.demo.nutz.console.action.model.ConsoleUser;
import org.nutz.mvc.Mvcs;

public class ActionHelper {

	/**
	 * 获取后台登录用户
	 * @return
	 */
	public static ConsoleUser getUser(){
		HttpSession session = Mvcs.getHttpSession();
		ConsoleUser user = (ConsoleUser) session.getAttribute(Constants.lOGIN_USER);
		return user;
	}
	
	/**
	 * 是否已经登录
	 * @return
	 */
	public static boolean isLogin(){
		HttpSession session = Mvcs.getHttpSession();
		ConsoleUser user = (ConsoleUser) session.getAttribute(Constants.lOGIN_USER);
		return user!=null;
	}
}
