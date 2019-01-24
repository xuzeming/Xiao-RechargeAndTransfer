package com.zl.mapper;

import java.util.List;

import com.zl.pojo.ConditionalClass;
import com.zl.pojo.TransferRecord;

public interface TransferRecordMapper {
	//添加
	void transferRecordInsert(TransferRecord trf);
	/**
	 *  总记录
	 * @param cond
	 * @return
	 */
	Integer getByCount(ConditionalClass cond);
	/**
	    *  分页数据
	 * @param cond
	 * @return
	 */
	List<TransferRecord> qureyByfy(ConditionalClass cond);

}
