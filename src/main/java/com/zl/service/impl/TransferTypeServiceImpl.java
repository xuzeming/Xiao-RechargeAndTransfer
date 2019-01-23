package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.TransferTypeMapper;
import com.zl.pojo.TransferType;
import com.zl.service.TransferTypeService;
@Service
public class TransferTypeServiceImpl implements TransferTypeService {
	@Autowired
	private TransferTypeMapper transferTypeMapper;
	@Override
	public List<TransferType> transferType() {
		
		return transferTypeMapper.selectAll();
	}

}
