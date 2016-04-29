package com.jd.denglu.modal;

public class Result {

	public static int CODE_SUCCESS = 1;
	public static int CODE_FAIL = 2;
	private int code;
	private String message;
	private Object Data;
	public static int getCODE_SUCCESS() {
		return CODE_SUCCESS;
	}
	public static void setCODE_SUCCESS(int cODE_SUCCESS) {
		CODE_SUCCESS = cODE_SUCCESS;
	}
	public static int getCODE_FAIL() {
		return CODE_FAIL;
	}
	public static void setCODE_FAIL(int cODE_FAIL) {
		CODE_FAIL = cODE_FAIL;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return Data;
	}
	public void setData(Object data) {
		Data = data;
	}
	
	public static Result success(String message,Object object)
	{
		Result result=new Result();
		result.setCode(CODE_SUCCESS);
		result.setData(object);
		result.setMessage(message);
		return result;
		
	}
	
	public static Result fail(String errorMsg)
	{
		Result result=new Result();
		result.setCode(CODE_FAIL);
		result.setMessage(errorMsg);
		return result;
	}
	
}
