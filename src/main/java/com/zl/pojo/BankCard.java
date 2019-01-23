package com.zl.pojo;

import java.io.Serializable;

public class BankCard implements Serializable {
	private static final long serialVersionUID = -8881493608049583579L;
	private Integer card_ID	;//主键	银行卡ID
	private String card_Num;//银行卡号
	private String card_PWD;//银行卡密码
	private String card_Type;//银行卡类型（工商，建设，招商等）
	private double card_Balance	;//余额
	private String card_Owner;//	持卡人
	private  String card_Tel;//	预留手机
	public Integer getCard_ID() {
		return card_ID;
	}
	public void setCard_ID(Integer card_ID) {
		this.card_ID = card_ID;
	}
	public String getCard_Num() {
		return card_Num;
	}
	public void setCard_Num(String card_Num) {
		this.card_Num = card_Num;
	}
	public String getCard_PWD() {
		return card_PWD;
	}
	public void setCard_PWD(String card_PWD) {
		this.card_PWD = card_PWD;
	}
	public String getCard_Type() {
		return card_Type;
	}
	public void setCard_Type(String card_Type) {
		this.card_Type = card_Type;
	}
	public double getCard_Balance() {
		return card_Balance;
	}
	public void setCard_Balance(double card_Balance) {
		this.card_Balance = card_Balance;
	}
	public String getCard_Owner() {
		return card_Owner;
	}
	public void setCard_Owner(String card_Owner) {
		this.card_Owner = card_Owner;
	}
	public String getCard_Tel() {
		return card_Tel;
	}
	public void setCard_Tel(String card_Tel) {
		this.card_Tel = card_Tel;
	}
	@Override
	public String toString() {
		return "BankCard [card_ID=" + card_ID + ", card_Num=" + card_Num + ", card_PWD=" + card_PWD + ", card_Type="
				+ card_Type + ", card_Balance=" + card_Balance + ", card_Owner=" + card_Owner + ", card_Tel=" + card_Tel
				+ "]";
	}
	
}
