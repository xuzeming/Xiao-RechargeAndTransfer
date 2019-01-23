package com.zl.pojo;

import java.io.Serializable;
import java.util.List;

public class PageVo  implements  Serializable {
	private static final long serialVersionUID = -2629778573837411359L;
	private List<BankCard>  bancar;
	private List<TransferType> transferType;
	public List<BankCard> getBancar() {
		return bancar;
	}
	public void setBancar(List<BankCard> bancar) {
		this.bancar = bancar;
	}
	public List<TransferType> getTransferType() {
		return transferType;
	}
	public void setTransferType(List<TransferType> transferType) {
		this.transferType = transferType;
	}
	
}
