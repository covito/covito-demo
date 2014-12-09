package org.covito.demo.nutz.console.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.covito.demo.nutz.commons.DBManager;
import org.covito.demo.nutz.console.ActionHelper;
import org.covito.demo.nutz.console.Constants;
import org.covito.demo.nutz.console.action.model.ConsoleUser;
import org.covito.demo.nutz.model.console.SysUser;
import org.covito.nutz.web.AjaxReturnHelper;
import org.nutz.dao.Cnd;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.Mvcs;
import org.nutz.mvc.View;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.POST;
import org.nutz.mvc.view.JspView;
import org.nutz.mvc.view.ServerRedirectView;
import org.nutz.web.ajax.AjaxReturn;

@IocBean
public class UserAct {
	
	@GET
	@At("/login")
	public View login() {
		if(ActionHelper.isLogin()){
			return new JspView("console.index");
		}else{
			return new JspView("console.login");
		}
	}
	
	@Ok("jsp:console.login")
	@At("/logout")
	public View logout() {
		Mvcs.getHttpSession().invalidate();
		return new ServerRedirectView("login");
	}

	@POST
	@At("/login")
	public AjaxReturn login(String username,String password) {
		if(StringUtils.isEmpty(username)){
			return AjaxReturnHelper.fail("用户名不能为空");
		}
		if(StringUtils.isEmpty(password)){
			return AjaxReturnHelper.fail("密码不能为空");
		}
		SysUser user=DBManager.getDao().fetch(SysUser.class, Cnd.where("login_name", "=", username));
		if(user==null){
			return AjaxReturnHelper.fail("帐户不存在");
		}
		if(!user.getPwd().equals(password)){
			return AjaxReturnHelper.fail("密码不正确");
		}
		Map<String,Object> m=new HashMap<String,Object>();
		ConsoleUser c=new ConsoleUser();
		Mvcs.getHttpSession().setAttribute(Constants.lOGIN_USER, c);
		return AjaxReturnHelper.ok(m);
	}
}
