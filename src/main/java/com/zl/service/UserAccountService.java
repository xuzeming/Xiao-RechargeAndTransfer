package com.zl.service;

import com.zl.pojo.UserAccount;

public interface UserAccountService {
	
	/**
	     *   修改资金账户余额(充值 /转入)
	 * @param selected(银行卡id)
	 * @param balance(金额)
	 * @param sele(状态)
	 * @return
	 */
	boolean upDateAccount(String selected, String balance,int id);
	/**     
	 *	查询余额
	 * @param selected 银行卡id
	 * @return
	 */
	UserAccount quretyById(String selected);


}
