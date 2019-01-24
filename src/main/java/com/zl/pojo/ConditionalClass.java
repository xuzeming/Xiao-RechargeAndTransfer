package com.zl.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ConditionalClass implements  Serializable{
	private static final long serialVersionUID = 4066060154781393162L;
	
	private  int  selected ;//id银行卡
	private  double  balance;//金额
	private  String pwd;//密码
	private  Integer state;//状态
	private Integer starts;//开始条
	private Integer ends;//结束条
	private Integer pageIndex =1;//页码
	private Integer pageSize =1;//页容量
	private Integer transfer_Type_Id;//转账类型Id
	private Integer transfer_Record_Id;//记录表Id
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startTime;//开始时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endTime;//结束时间
	private Integer  userId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getStarts() {
		int unm =(pageIndex-1)*pageSize+1;		
		return unm;
	}
	
	public Integer getEnds() {
		return pageIndex *pageSize;
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
	public Integer getTransfer_Type_Id() {
		return transfer_Type_Id;
	}
	public void setTransfer_Type_Id(Integer transfer_Type_Id) {
		this.transfer_Type_Id = transfer_Type_Id;
	}
	public Integer getTransfer_Record_Id() {
		return transfer_Record_Id;
	}
	public void setTransfer_Record_Id(Integer transfer_Record_Id) {
		this.transfer_Record_Id = transfer_Record_Id;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "ConditionalClass [selected=" + selected + ", balance=" + balance + ", pwd=" + pwd + ", state=" + state
				+ ", starts=" + starts + ", ends=" + ends + ", pageIndex=" + pageIndex + ", pageSize=" + pageSize
				+ ", transfer_Type_Id=" + transfer_Type_Id + ", transfer_Record_Id=" + transfer_Record_Id
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", userId=" + userId + "]";
	}

	
	
}
