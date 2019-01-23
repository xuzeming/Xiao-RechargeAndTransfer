package com.zl.mapper;

import java.util.List;

import com.zl.pojo.BankCard;
import com.zl.pojo.ConditionalClass;

public interface BankCardMapper {
	//查询银行卡
	List<BankCard> qureyAll(int id);
	//查询余额及密码
	BankCard selectById(Integer id);
	//修改(充/入)
	int bankCardupdate(ConditionalClass conditionalClass);
	//修改(出)
	/**
	 * 
	 * @param con
	 * @return
	 */
	int bankCardupdateOut(ConditionalClass con);

}
