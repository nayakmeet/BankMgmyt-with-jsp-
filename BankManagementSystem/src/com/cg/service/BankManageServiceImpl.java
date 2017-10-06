package com.cg.service;

import com.cg.bean.BankBean;
import com.cg.dao.BankManageDaoImpl;
import com.cg.dao.IBankManage;

public class BankManageServiceImpl implements IBankservice {

	IBankManage dao=new BankManageDaoImpl();
	
	@Override
	public int addDetails(BankBean bean) {
		
		return dao.addDetails(bean);
	}

}
