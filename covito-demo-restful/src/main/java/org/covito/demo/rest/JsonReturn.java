package org.covito.demo.rest;


/**
 * User: Joseph Vartuli
 * Date: 25/08/12
 *
 * @since:
 */
public class JsonReturn {

	boolean ok;
    String errCode;
    String msg;
    Object data;

    public boolean isOk() {
        return ok;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public JsonReturn setOk(boolean ok) {
        this.ok = ok;
        return this;
    }

    public JsonReturn setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }

    public JsonReturn setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public JsonReturn setData(Object data) {
        this.data = data;
        return this;
    }

}
