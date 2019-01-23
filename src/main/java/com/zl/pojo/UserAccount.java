package com.zl.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * 资金账户实体类
 * @author
 */
public class UserAccount implements Serializable{

	private static final long serialVersionUID = -4340841493546106881L;
	
	private  Integer account_ID	;//资金账号Id
	private  Integer account_Num;//资金账号
	private  double  account_Balance;//余额
	private Date account_Open_Time;//开户时间
	private  String capital_PWD	;//资金密码
	private Integer org_ID	;//营业厅Id
	private Integer user_ID	;//用户Id
	private  Integer sH_Account_Num;//上海证券账户账号
	private Integer sZ_Account_Num	;//深圳证券账户账号
	private String  transation_PWD; //交易密码
	public Integer getAccount_ID() {
		return account_ID;
	}
	public void setAccount_ID(Integer account_ID) {
		this.account_ID = account_ID;
	}
	public Integer getAccount_Num() {
		return account_Num;
	}
	public void setAccount_Num(Integer account_Num) {
		this.account_Num = account_Num;
	}
	public double getAccount_Balance() {
		return account_Balance;
	}
	public void setAccount_Balance(double account_Balance) {
		this.account_Balance = account_Balance;
	}
	public Date getAccount_Open_Time() {
		return account_Open_Time;
	}
	public void setAccount_Open_Time(Date account_Open_Time) {
		this.account_Open_Time = account_Open_Time;
	}
	public String getCapital_PWD() {
		return capital_PWD;
	}
	public void setCapital_PWD(String capital_PWD) {
		this.capital_PWD = capital_PWD;
	}
	public Integer getOrg_ID() {
		return org_ID;
	}
	public void setOrg_ID(Integer org_ID) {
		this.org_ID = org_ID;
	}
	public Integer getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(Integer user_ID) {
		this.user_ID = user_ID;
	}
	public Integer getsH_Account_Num() {
		return sH_Account_Num;
	}
	public void setsH_Account_Num(Integer sH_Account_Num) {
		this.sH_Account_Num = sH_Account_Num;
	}
	public Integer getsZ_Account_Num() {
		return sZ_Account_Num;
	}
	public void setsZ_Account_Num(Integer sZ_Account_Num) {
		this.sZ_Account_Num = sZ_Account_Num;
	}
	public String getTransation_PWD() {
		return transation_PWD;
	}
	public void setTransation_PWD(String transation_PWD) {
		this.transation_PWD = transation_PWD;
	}
	@Override
	public String toString() {
		return "UserAccount [account_ID=" + account_ID + ", account_Num=" + account_Num + ", account_Balance="
				+ account_Balance + ", account_Open_Time=" + account_Open_Time + ", capital_PWD=" + capital_PWD
				+ ", org_ID=" + org_ID + ", user_ID=" + user_ID + ", sH_Account_Num=" + sH_Account_Num
				+ ", sZ_Account_Num=" + sZ_Account_Num + ", transation_PWD=" + transation_PWD + "]";
	}
}
