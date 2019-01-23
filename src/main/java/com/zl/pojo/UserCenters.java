package com.zl.pojo;

import java.io.Serializable;

public class UserCenters implements Serializable {

	private static final long serialVersionUID = -6519959726224028841L;
	private Integer User_ID	;//用户Id
	private String  User_Login_Name	;//用户名
	private String  User_Tel;//绑定手机号
	private String  User_PWD;//密码
	private Integer Account_Num;//资金账号
	private String  Capital_PWD;//资金密码
	private String  Net_Name;//昵称
	private Integer User_Status_ID;//用户状态
	public Integer getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(Integer user_ID) {
		User_ID = user_ID;
	}
	public String getUser_Login_Name() {
		return User_Login_Name;
	}
	public void setUser_Login_Name(String user_Login_Name) {
		User_Login_Name = user_Login_Name;
	}
	public String getUser_Tel() {
		return User_Tel;
	}
	public void setUser_Tel(String user_Tel) {
		User_Tel = user_Tel;
	}
	public String getUser_PWD() {
		return User_PWD;
	}
	public void setUser_PWD(String user_PWD) {
		User_PWD = user_PWD;
	}
	public Integer getAccount_Num() {
		return Account_Num;
	}
	public void setAccount_Num(Integer account_Num) {
		Account_Num = account_Num;
	}
	public String getCapital_PWD() {
		return Capital_PWD;
	}
	public void setCapital_PWD(String capital_PWD) {
		Capital_PWD = capital_PWD;
	}
	public String getNet_Name() {
		return Net_Name;
	}
	public void setNet_Name(String net_Name) {
		Net_Name = net_Name;
	}
	public Integer getUser_Status_ID() {
		return User_Status_ID;
	}
	public void setUser_Status_ID(Integer user_Status_ID) {
		User_Status_ID = user_Status_ID;
	}
	@Override
	public String toString() {
		return "UserCenters [User_ID=" + User_ID + ", User_Login_Name=" + User_Login_Name + ", User_Tel=" + User_Tel
				+ ", User_PWD=" + User_PWD + ", Account_Num=" + Account_Num + ", Capital_PWD=" + Capital_PWD
				+ ", Net_Name=" + Net_Name + ", User_Status_ID=" + User_Status_ID + "]";
	}
	
}
