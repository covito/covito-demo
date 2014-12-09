package org.covito.nutz.web;

import org.nutz.web.ajax.Ajax;
import org.nutz.web.ajax.AjaxReturn;


public class AjaxReturnHelper {

	public static AjaxReturn fail(String errCode, String msg) {
		AjaxReturn re = new AjaxReturn();
		re.setOk(false);
		re.setErrCode(errCode);
		re.setMsg(msg);
		return re;
	}
	
	public static AjaxReturn fail(String msg) {
		AjaxReturn re = new AjaxReturn();
		re.setOk(false);
		re.setMsg(msg);
		return re;
	}

	public static AjaxReturn ok(Object data) {
		AjaxReturn re = new AjaxReturn();
		re.setOk(true);
		re.setData(data);
		return re;
	}

	public static AjaxReturn ok() {
		return Ajax.ok();
	}

	public static AjaxReturn fail() {
		return Ajax.fail();
	}

	public static AjaxReturn expired() {
		return Ajax.expired();
	}
}
