package com.zl.mapper;

import com.zl.pojo.ConditionalClass;
import com.zl.pojo.UserAccount;

public interface UserAccountMapper {
	//修改余额
	int accountUpdate(ConditionalClass conditionalClass);
	//查询资金账户信息
	UserAccount qureyAll(int parseInt);
	//转出修改
	int accountUpdateOut(ConditionalClass con);
	
}
