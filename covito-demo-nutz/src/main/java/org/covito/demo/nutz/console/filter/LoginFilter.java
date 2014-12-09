package org.covito.demo.nutz.console.filter;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.covito.demo.nutz.console.ActionHelper;
import org.covito.nutz.web.UrlManager;
import org.nutz.mvc.ActionContext;
import org.nutz.mvc.ActionFilter;
import org.nutz.mvc.Mvcs;
import org.nutz.mvc.View;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.view.ServerRedirectView;
import org.nutz.mvc.view.ViewWrapper;
import org.nutz.web.ajax.Ajax;
import org.nutz.web.ajax.AjaxReturn;
import org.nutz.web.ajax.AjaxView;

public class LoginFilter implements ActionFilter {
	
	private final String configXml="/console-filter.xml";

	@Override
	public View match(ActionContext context) {
		
		HttpServletRequest request = context.getRequest();
		
		// 获得用户请求的URI
		String path=Mvcs.getRequestPath(request);
		
		//过滤地址
		if(UrlManager.getUrlManager(configXml).isFilter(path)){
			return null;
		}

		if(ActionHelper.isLogin()){
			return null;
		}

		//获取返回格式
		Method method=Mvcs.getActionContext().getMethod();
		Ok ok=method.getAnnotation(Ok.class);
		int pos=ok.value().indexOf(":");
		String type=ok.value().substring(0,pos).toLowerCase();
		
		if(type.equals("json")){
			View v = new AjaxView();
			AjaxReturn re = Ajax.expired();
			return new ViewWrapper(v, re);
		}else{
			String pre=request.getServletPath();
			return new ServerRedirectView(pre+"/login");
		}
	}
}
