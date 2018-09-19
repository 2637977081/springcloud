package com.cc.yonyou.rndealer.po;

/**
 * 
 * @author lvgang
 * @data 2018年8月31日17:37:33
 * @email lvgang1
 *
 */
public class BaseJSON {
	protected String msg= "成功";
	protected int code = 0;
	protected Object result;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	
	
}
