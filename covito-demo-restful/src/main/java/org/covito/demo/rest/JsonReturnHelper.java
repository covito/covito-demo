package org.covito.demo.rest;

public class JsonReturnHelper {

	public static JsonReturn fail(String errCode, String msg) {
		JsonReturn re = new JsonReturn();
		re.setOk(false);
		re.setErrCode(errCode);
		re.setMsg(msg);
		return re;
	}

	public static JsonReturn fail(String msg) {
		JsonReturn re = new JsonReturn();
		re.setOk(false);
		re.setMsg(msg);
		return re;
	}

	public static JsonReturn ok(Object data) {
		JsonReturn re = new JsonReturn();
		re.setOk(true);
		re.setData(data);
		return re;
	}

	public static JsonReturn ok() {
		return ok(null);
	}

	public static JsonReturn fail() {
		return fail(null);
	}

	public static JsonReturn expired() {
		JsonReturn re = new JsonReturn();
		re.ok = false;
		re.msg = "ajax.expired";
		return re;
	}
}
