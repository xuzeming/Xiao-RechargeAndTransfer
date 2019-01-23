package com.zl.pojo;

import java.io.Serializable;
import java.util.Date;

public class TransferRecord implements  Serializable {
	private static final long serialVersionUID = -5564786831999025553L;
	private  Integer transfer_Record_ID	;//	主键
	private  Integer transfer_Type_ID;//类型
	private  String  in_Account	;	//转入账户
	private  String  out_Account;	//转出账户
	private  double transfer_Money;//金额
	private Date transfer_Time;//时间
	private String transfer_Description	;//说明
	public Integer getTransfer_Record_ID() {
		return transfer_Record_ID;
	}
	public void setTransfer_Record_ID(Integer transfer_Record_ID) {
		this.transfer_Record_ID = transfer_Record_ID;
	}
	public Integer getTransfer_Type_ID() {
		return transfer_Type_ID;
	}
	public void setTransfer_Type_ID(Integer transfer_Type_ID) {
		this.transfer_Type_ID = transfer_Type_ID;
	}
	public String getIn_Account() {
		return in_Account;
	}
	public void setIn_Account(String in_Account) {
		this.in_Account = in_Account;
	}
	public String getOut_Account() {
		return out_Account;
	}
	public void setOut_Account(String out_Account) {
		this.out_Account = out_Account;
	}
	public double getTransfer_Money() {
		return transfer_Money;
	}
	public void setTransfer_Money(double transfer_Money) {
		this.transfer_Money = transfer_Money;
	}
	public Date getTransfer_Time() {
		return transfer_Time;
	}
	public void setTransfer_Time(Date transfer_Time) {
		this.transfer_Time = transfer_Time;
	}
	public String getTransfer_Description() {
		return transfer_Description;
	}
	public void setTransfer_Description(String transfer_Description) {
		this.transfer_Description = transfer_Description;
	}
	@Override
	public String toString() {
		return "TransferRecord [transfer_Record_ID=" + transfer_Record_ID + ", transfer_Type_ID=" + transfer_Type_ID
				+ ", in_Account=" + in_Account + ", out_Account=" + out_Account + ", transfer_Money=" + transfer_Money
				+ ", transfer_Time=" + transfer_Time + ", transfer_Description=" + transfer_Description + "]";
	}
	
}
