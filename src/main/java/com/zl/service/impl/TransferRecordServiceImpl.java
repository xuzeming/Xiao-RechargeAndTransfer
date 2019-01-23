package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zl.mapper.BankCardMapper;
import com.zl.mapper.TransferRecordMapper;
import com.zl.mapper.UserAccountMapper;
import com.zl.pojo.BankCard;
import com.zl.pojo.TransferRecord;
import com.zl.pojo.UserAccount;
import com.zl.service.TransferRecordService;

@Service
public class TransferRecordServiceImpl implements TransferRecordService {
	@Autowired
	private TransferRecordMapper transferRecordMapper;
	@Autowired
	private UserAccountMapper  userAccountMapper;
	@Autowired
	private BankCardMapper bankCardMapper;
	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public void insertByTransferRecord(String msg, String selected, String balance ,String num,int id) {
		TransferRecord  trf =  new TransferRecord ();
		trf.setTransfer_Description(msg);
		trf.setTransfer_Type_ID(id);
		trf.setTransfer_Money(Double.parseDouble(balance));
		UserAccount usa = userAccountMapper.qureyAll(Integer.parseInt(selected));
		
		//调用添加方法
		System.out.println(id);
		if (id==2) {//状态判断(转出)
			BankCard  ban = bankCardMapper.selectById(Integer.parseInt(selected));
			trf.setOut_Account(usa.getAccount_Num()+"");
			trf.setIn_Account(ban.getCard_Num());
			System.err.println(trf.getOut_Account());
			System.err.println(trf.getIn_Account());
		}else {//转入   充值
			trf.setOut_Account(num);
			trf.setIn_Account(usa.getAccount_Num()+"");
		}
		
		transferRecordMapper. transferRecordInsert(trf);
	}

}
