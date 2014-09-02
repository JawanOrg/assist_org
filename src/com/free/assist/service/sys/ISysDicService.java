package com.free.assist.service.sys;

import java.util.List;

import com.free.assist.domain.SysDicConfig;
import com.free.assist.domain.SysDicConfigExample;
import com.free.assist.domain.SysDicItem;
import com.free.assist.domain.SysDicItemExample;
import com.free.assist.service.BaseService;

public interface ISysDicService extends BaseService{
	public String addDataSysDicConfig(SysDicConfig sto) throws Exception;
	public String updateDataSysDicConfig(SysDicConfig sto) throws Exception;
	public String deleteDataSysDicConfig(String ids) throws Exception ;

	public String addDataSysDicItem(SysDicItem sto) throws Exception;
	public String updateDataSysDicItem(SysDicItem sto) throws Exception;
	public String deleteDataSysDicItem(String ids) throws Exception ;

	public List selectByExample(SysDicConfigExample example,int skipResults,int maxResults);

	public List selectByExampleForDicItem(SysDicItemExample example,int skipResults,int maxResults);

	public String getItemName(String dictionaryCode,String itemCode);
}
