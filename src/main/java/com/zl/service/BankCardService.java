package com.zl.service;

import java.util.List;

import com.zl.pojo.BankCard;

public interface BankCardService {
	//查询银行卡
	List<BankCard> bankCards(int id);
	//查询余额
	BankCard quretyById(String selected);
	//修改余额
	boolean upDaterBankCard(String selected, String balance,int  id);

}
