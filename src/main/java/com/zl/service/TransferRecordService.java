package com.zl.service;

import com.zl.pojo.ConditionalClass;
import com.zl.pojo.PageVo;

public interface TransferRecordService {
	/**
	 * 
	 * @param msg 说明
	 * @param selected 银行卡Id
	 * @param balance  jine
	 * @param num  
	 * @param sele
	 */
	void insertByTransferRecord(String msg, String selected, String balance,String num,int id,Integer userId);
	//分页
	PageVo qureyPage(ConditionalClass cond);

}
