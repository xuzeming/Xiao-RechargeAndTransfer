package com.zl.pojo;

public class ReturnDatas {
	private  String start="susser";//
	private  String msg;//状态
	public String getStart() {
		return start;
	}
	
	public void setStart(String start) {
		this.start = start;
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "ReturnDatas [start=" + start + ", msg=" + msg + "]";
	}
	
}
