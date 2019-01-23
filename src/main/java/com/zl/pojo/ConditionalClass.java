package com.zl.pojo;

import java.io.Serializable;

public class ConditionalClass implements  Serializable{
	private static final long serialVersionUID = 4066060154781393162L;
	
	private  int  selected ;//id
	private  double  balance;//金额
	private  String pwd;//密码
	private  Integer state;//状态
	
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public int getSelected() {
		return selected;
	}
	public void setSelected(int selected) {
		this.selected = selected;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "ConditionalClass [selected=" + selected + ", balance=" + balance + ", pwd=" + pwd + "]";
	}
	
	
}
