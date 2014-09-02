package com.free.assist.service.supt;

import java.util.List;

import org.dom4j.Document;

import com.free.assist.domain.SuptIfaceGroupRelation;
import com.free.assist.domain.SuptTaticGroup;
import com.free.assist.domain.SuptTaticInstance;
import com.free.assist.domain.SysUser;
import com.free.assist.service.BaseService;

public interface ISuptValueListService extends BaseService {
	
	public String getSuptValue(String billId, String depend);
	
}
