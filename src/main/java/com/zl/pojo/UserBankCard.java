package com.zl.pojo;

import java.io.Serializable;
/**
 * 用户银行卡实体类
 * @author yank
 *
 */
public class UserBankCard implements Serializable{
	private static final long serialVersionUID = -2558832104705296562L;
	private Integer crad_ID;//主键银行卡ID
	private Integer user_ID;//用户ID
	public Integer getCrad_ID() {
		return crad_ID;
	}
	public void setCrad_ID(Integer crad_ID) {
		this.crad_ID = crad_ID;
	}
	public Integer getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(Integer user_ID) {
		this.user_ID = user_ID;
	}
	@Override
	public String toString() {
		return "UserBankCard [crad_ID=" + crad_ID + ", user_ID=" + user_ID + "]";
	}
	
}
