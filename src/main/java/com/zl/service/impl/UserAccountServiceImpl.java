package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.UserAccountMapper;
import com.zl.pojo.ConditionalClass;
import com.zl.pojo.UserAccount;
import com.zl.service.UserAccountService;
@Service
public class UserAccountServiceImpl implements UserAccountService {
	@Autowired
	private  UserAccountMapper userAccountMapper;
	
	
	@Override
	public boolean upDateAccount(String selected, String balance,int id) {
		ConditionalClass con = new ConditionalClass();
		con.setBalance(Double.parseDouble(balance));
		con.setSelected(Integer.parseInt(selected));
		con.setState(id);
		int upAccount=0;
		if (con.getState()!=2 ) {
			upAccount = userAccountMapper.accountUpdate(con);
		}else {
			upAccount = userAccountMapper.accountUpdateOut(con);
		}
		if (upAccount > 0) {
			return true;
		}
		return false;
	}

	//查询
	@Override
	public UserAccount quretyById(String selected) {
		return userAccountMapper.qureyAll(Integer.parseInt(selected));
	}

}
