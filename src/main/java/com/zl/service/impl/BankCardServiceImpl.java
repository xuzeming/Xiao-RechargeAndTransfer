package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.BankCardMapper;
import com.zl.pojo.BankCard;
import com.zl.pojo.ConditionalClass;
import com.zl.service.BankCardService;
@Service
public class BankCardServiceImpl implements BankCardService {
	@Autowired
	private BankCardMapper  bankCardMapper;
	@Override
	public List<BankCard> bankCards(int id) {
		List<BankCard> list = bankCardMapper.qureyAll(id);
		return list;
	}
	@Override
	public BankCard quretyById(String selected) {
		Integer id =Integer.parseInt(selected);
		BankCard   ban =bankCardMapper.selectById(id);
		return ban;
	}
	
	@Override
	public boolean upDaterBankCard(String selected, String balance ,int id) {
		ConditionalClass  con = new ConditionalClass();
		con.setBalance(Double.parseDouble(balance));
		con.setSelected(Integer.parseInt(selected));
		con.setState(id);
		int upBankCard =0;
		if(con.getState()!=2) {
			upBankCard=bankCardMapper.bankCardupdate(con);
		}else {
			upBankCard=bankCardMapper.bankCardupdateOut(con);
		}
		if (upBankCard>0) {
			return true;
		}else {
			return false;
		}
	}

}
