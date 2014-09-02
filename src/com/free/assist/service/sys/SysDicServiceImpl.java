package com.free.assist.service.sys;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.assist.dao.SysDicConfigDAO;
import com.free.assist.dao.SysDicItemDAO;
import com.free.assist.domain.SysDicConfig;
import com.free.assist.domain.SysDicConfigExample;
import com.free.assist.domain.SysDicItem;
import com.free.assist.domain.SysDicItemExample;
import com.free.assist.service.BaseServiceImpl;

@Service("sysDicService")
public class SysDicServiceImpl extends BaseServiceImpl implements ISysDicService {

	@Autowired private SysDicConfigDAO mySysDicConfigDAO;
	@Autowired private SysDicItemDAO mySysDicItemDAO;

	//-------------------------------------------------------------------------
	//----------------------------       SysDicConfig begin ----------------------------
	/**
	 * DWR函数--新增数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String addDataSysDicConfig(SysDicConfig sto) throws Exception {
		String strRet="";
		if(sto.getDictionaryName()!=null&&!"".equalsIgnoreCase(sto.getDictionaryName())) {
			SysDicConfigExample ex=new SysDicConfigExample();
			ex.createCriteria().andDictionaryNameEqualTo(sto.getDictionaryName().trim());
			int count= this.mySysDicConfigDAO.countByExample(ex);
			if(count>=1) {
				strRet="字典名称重复!";
				return strRet;
			}
		}
		this.mySysDicConfigDAO.insert(sto);
		return strRet;
	}


	/**
	 * DWR函数--更新数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String updateDataSysDicConfig(SysDicConfig sto) throws Exception {
		String strRet="";
		if(sto.getDictionaryName()!=null&&!"".equalsIgnoreCase(sto.getDictionaryName())) {
			SysDicConfigExample ex=new SysDicConfigExample();
			ex.createCriteria().andDictionaryNameEqualTo(sto.getDictionaryName().trim()).andDictionaryIdNotEqualTo(sto.getDictionaryId());
			int count= this.mySysDicConfigDAO.countByExample(ex);
			if(count>=1) {
				strRet="字典名称重复!";
				return strRet;
			}
		}
		this.mySysDicConfigDAO.updateByPrimaryKeySelective(sto);
		return strRet;
	};


	/**
	 * DWR函数--删除数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String deleteDataSysDicConfig(String ids) throws Exception {
		String strRet="";
		String[] id = StringUtils.split(ids, "|");
		for(String s:id) {
			SysDicConfigExample heomaEx=new SysDicConfigExample();
			heomaEx.createCriteria().andDictionaryIdEqualTo(s);
			this.mySysDicConfigDAO.deleteByExample(heomaEx);
		}
		return strRet;
	}

	public List selectByExample(SysDicConfigExample example,int skipResults,int maxResults) {
		example.setSkipResults(skipResults).setMaxResults(maxResults);
		return mySysDicConfigDAO.selectByExample(example);
	}

	//----------------------------    SysDicConfig end ----------------------------
	//-------------------------------------------------------------------------

	//-------------------------------------------------------------------------
	//----------------------------     SysDicItem begin ----------------------------
	/**
	 * DWR函数--新增数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String addDataSysDicItem(SysDicItem sto) throws Exception {
		String strRet="";
		if(sto.getItemCode()!=null&&!"".equalsIgnoreCase(sto.getItemCode())) {
			SysDicItemExample ex=new SysDicItemExample();
			ex.createCriteria().andItemCodeEqualTo(sto.getItemCode().trim()).andDictionaryIdEqualTo(sto.getDictionaryId());
			int count= this.mySysDicItemDAO.countByExample(ex);
			if(count>=1) {
				strRet="条目代号重复!";
				return strRet;
			}
		}
		this.mySysDicItemDAO.insert(sto);
		return strRet;
	}


	/**
	 * DWR函数--更新数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String updateDataSysDicItem(SysDicItem sto) throws Exception {
		String strRet="";
		if(sto.getItemCode()!=null&&!"".equalsIgnoreCase(sto.getItemCode())) {
			SysDicItemExample ex=new SysDicItemExample();
			ex.createCriteria().andItemCodeEqualTo(sto.getItemCode().trim()).andDictionaryIdEqualTo(sto.getDictionaryId().trim());
			int count= this.mySysDicItemDAO.countByExample(ex);
			if(count>1) {
				strRet="条目代号重复!";
				return strRet;
			}
		}
		this.mySysDicItemDAO.updateByPrimaryKeySelective(sto);
		return strRet;
	};


	/**
	 * DWR函数--删除数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String deleteDataSysDicItem(String ids) throws Exception {
		String strRet="";
		String[] id = StringUtils.split(ids, ":");
		for(String s:id) {
			SysDicItemExample heomaEx=new SysDicItemExample();
			heomaEx.createCriteria().andItemIdEqualTo(s);
			this.mySysDicItemDAO.deleteByExample(heomaEx);
		}
		return strRet;
	}

	public List selectByExampleForDicItem(SysDicItemExample example,int skipResults,int maxResults) {
		example.setSkipResults(skipResults).setMaxResults(maxResults);
		return mySysDicItemDAO.selectByExample(example);
	}
	/**
	 * 根据code值取得name
	 * @param dictionaryCode
	 * @param itemCode
	 * @return
	 */
	public String getItemName(String dictionaryCode,String itemCode){
		String s="";
		if(dictionaryCode==null||dictionaryCode.equals("")){
			return "";
		}
		if(itemCode==null||itemCode.equals("")){
			return "";
		}
		List<SysDicItem> list = new ArrayList<SysDicItem>();
		List<SysDicConfig> configList = new ArrayList<SysDicConfig>();
		SysDicConfigExample cEx = new SysDicConfigExample();
		cEx.createCriteria().andDictionaryCodeEqualTo(dictionaryCode).andIsValidEqualTo("Y");
		configList = this.mySysDicConfigDAO.selectByExample(cEx);
		if(configList!=null&&configList.size()>0){
			SysDicConfig sysDicConfig=configList.get(0);
			SysDicItemExample itemEx = new SysDicItemExample();
			itemEx.createCriteria().andDictionaryIdEqualTo(sysDicConfig.getDictionaryId()).andItemCodeEqualTo(itemCode);
			list=this.selectByExample(itemEx);
			if(list!=null&&list.size()>0){
				s=list.get(0).getItemValue();
			}
		}

		return s;
	}

	//----------------------------    SysDicItem end ----------------------------
	//-------------------------------------------------------------------------
}