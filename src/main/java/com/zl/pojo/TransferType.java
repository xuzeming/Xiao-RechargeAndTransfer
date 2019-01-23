package com.zl.pojo;

import java.io.Serializable;

public class TransferType implements Serializable {
	private static final long serialVersionUID = 4174320722478331036L;
	private  Integer transfer_Type_ID;
	private  String  transfer_Type;
	public Integer getTransfer_Type_ID() {
		return transfer_Type_ID;
	}
	public void setTransfer_Type_ID(Integer transfer_Type_ID) {
		this.transfer_Type_ID = transfer_Type_ID;
	}
	public String getTransfer_Type() {
		return transfer_Type;
	}
	public void setTransfer_Type(String transfer_Type) {
		this.transfer_Type = transfer_Type;
	}
	@Override
	public String toString() {
		return "TransferType [transfer_Type_ID=" + transfer_Type_ID + ", transfer_Type=" + transfer_Type + "]";
	}
	
	
}
