package com.free.assist.service.supt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.assist.dao.SuptValueListDAO;
import com.free.assist.domain.SuptValueList;
import com.free.assist.domain.SuptValueListExample;
import com.free.assist.service.BaseServiceImpl;

@Service("suptValueListService")
public class SuptValueListServiceImpl extends BaseServiceImpl implements ISuptValueListService {
	SuptValueListDAO suptValueListDAO;
	
	@Autowired
	public void setSuptValueListDAO(SuptValueListDAO suptValueListDAO) {
		this.suptValueListDAO = suptValueListDAO;
	}

	public String getSuptValue(String billId, String depend) {
		SuptValueListExample exp = new SuptValueListExample();
		exp.createCriteria().andBillIdEqualTo(billId);
		exp.createCriteria().andDepenNodeEqualTo(depend);
		List<SuptValueList> list = suptValueListDAO.selectByExample(exp);
		if(list==null || list.size()<1){
			return null;
		}
		return list.get(0).getValues();
	}


}
