package com.zl.pojo;

import java.io.Serializable;
import java.util.List;

public class PageVo  implements  Serializable {
	private static final long serialVersionUID = -2629778573837411359L;
	private List<BankCard>  bancar;
	private List<TransferType> transferType;
	private Integer pageIndex;
	private Integer pageSize;
	private Integer totalCount;
	private Integer totalPage;
	private List<TransferRecord> transferRecord;
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
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getTotalPage() {
		int temp =totalCount/pageSize;
		return totalCount%pageSize ==0 ? temp : temp+1 ;
	}
	
	public List<TransferRecord> getTransferRecord() {
		return transferRecord;
	}
	public void setTransferRecord(List<TransferRecord> transferRecord) {
		this.transferRecord = transferRecord;
	}
	@Override
	public String toString() {
		return "PageVo [bancar=" + bancar + ", transferType=" + transferType + ", pageIndex=" + pageIndex
				+ ", pageSize=" + pageSize + ", totalCount=" + totalCount + ", totalPage=" + totalPage
				+ ", transferRecord=" + transferRecord + "]";
	}
	
	
}
