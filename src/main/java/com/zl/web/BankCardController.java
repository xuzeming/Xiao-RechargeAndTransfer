package com.zl.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.BankCard;
import com.zl.pojo.PageVo;
import com.zl.pojo.ReturnDatas;
import com.zl.pojo.UserAccount;
import com.zl.pojo.UserCenters;
import com.zl.service.BankCardService;
import com.zl.service.TransferRecordService;
import com.zl.service.TransferTypeService;
import com.zl.service.UserAccountService;

@Controller
public class BankCardController {
	@Autowired
	private BankCardService bankCardService ;//银行卡
	
	@Autowired
	private UserAccountService userAccountService;//资金账户
	
	@Autowired
	private TransferRecordService   transferRecordService;//记录
	
	@Autowired
	private TransferTypeService   transferTypeService;//转账类型
	
	@RequestMapping("/bankCards.action")
	@ResponseBody
	public 	PageVo bankCards(HttpSession session) {
		UserCenters    us = new UserCenters();
		if (session.getAttribute("user")!=null) {
			us =(UserCenters) session.getAttribute("user");
		}
		us.getUser_ID();
		int id =4;//暂时代替用户Id
		PageVo  page=new PageVo();
		page.setBancar(bankCardService.bankCards(id));
		page.setTransferType(transferTypeService.transferType());
		return page ;
	}

	//根据银行卡Id查询余额 
	/**
	 * 
	 * @param selected 银行卡id
	 * @param balance 金额
	 * @param pwd 资金密码
	 * @param sele 状态(充值/转入/转出)
	 * @return
	 */
	@RequestMapping("/qureyById.action")
	@ResponseBody
	@Transactional(propagation=Propagation.SUPPORTS)
	public ReturnDatas  quretyById(String selected,String balance,String pwd,String sele ) {
		ReturnDatas  ret = new ReturnDatas();//创建对象
		System.out.println(sele);
		double money=0;
		String password="";
		String num ="";
		int id = 0;
		if (sele==null || sele=="") {
			id=3;
		}else {
			id=Integer.parseInt(sele);
		}
		System.err.println(selected+"+"+id+"+"+pwd+"+"+balance);

		if (id!=2) {
			//调用查询银行卡余额的方法
			BankCard  bankCard=bankCardService.quretyById(selected);
			money= bankCard.getCard_Balance();
			password = bankCard.getCard_PWD();
			num = bankCard.getCard_Num();
		}else {
			//调用资金账户查询余额的方法
			UserAccount	userAccount=userAccountService.quretyById(selected);
			money= userAccount.getAccount_Balance();
			password = userAccount.getCapital_PWD();
			num = userAccount.getAccount_Num()+"";
		}
		//将字符串转换成数字
		double  bal=Double.parseDouble(balance);
		if (money < bal) {//判断余额
			ret.setStart("erreo");
			ret.setMsg("余额 不足!");
			return ret;
		}else if (!password.equals(pwd)) {//判断密码
			ret.setStart("erreo");
			ret.setMsg("密码错误!");
			return ret;
		}else {
			//调用修改方法 bankCard.getCard_Num() 银行卡号
		 ret = updateAmountOfMoney(selected,balance,num,id);
		 return ret;
		}
	}
	
	//私有的修改方法    @Transactional 事务同步
	/**
	 * 
	 * @param selected 银行卡id
	 * @param balance 金额
	 * @param num 银行卡号
	 * @param id 状态Id
	 * @return
	 */
	@Transactional
	private ReturnDatas updateAmountOfMoney(String selected,String balance,String num,int id) {
		ReturnDatas  retd  = new ReturnDatas();
		//根据银行卡id修改资金账户余额
		boolean b1=userAccountService.upDateAccount(selected,balance,id);
		//根据银行卡id修改银行卡余额
		boolean b2=bankCardService.upDaterBankCard(selected,balance,id);
		if (b2==true && b1 == true) {
			retd.setMsg("转账成功!");
			transferRecordService.insertByTransferRecord(retd.getMsg(),selected,balance,num, id);
		}else {
			retd.setStart("erreo");
			retd.setMsg("转账失败!");
			transferRecordService.insertByTransferRecord(retd.getMsg(),selected,balance,num, id);
		}
		return  retd;
	}
	
	
}
