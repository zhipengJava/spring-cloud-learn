package com.example.demo.base.exception;

public class DemoBussinessException extends Exception{

	private static final long serialVersionUID = -6323960647250652992L;
	
	private String code;
	
	private String msg;

	public DemoBussinessException () {
		super();
	}
	
	public DemoBussinessException(String code,String msg) {
		super(msg);
		this.code=code;
		this.msg=msg;
	}
	
	public DemoBussinessException(String code,String msg,Throwable throwable) {
		super(msg,throwable);
		this.code=code;
		this.msg=msg;
	}
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
