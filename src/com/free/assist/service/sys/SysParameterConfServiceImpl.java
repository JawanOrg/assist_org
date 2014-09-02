package com.free.assist.service.sys;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.assist.dao.SysParameterConfDAO;
import com.free.assist.domain.SysParameterConf;
import com.free.assist.domain.SysParameterConfExample;
import com.free.assist.service.BaseServiceImpl;

@Service("sysParameterConfService")
public class SysParameterConfServiceImpl extends BaseServiceImpl implements ISysParameterConfService {

	@Autowired
	private SysParameterConfDAO mySysParameterConfDAO;

	/**
	 * DWR����--��������
	 *
	 * @param sto
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String addDataSysParameterConf(SysParameterConf sto) throws Exception {
		String strRet = "";
		if (sto.getParName() != null && !"".equalsIgnoreCase(sto.getParName())) {
			SysParameterConfExample ex = new SysParameterConfExample();
			ex.createCriteria().andParNameEqualTo(sto.getParName().trim());
			int count = this.mySysParameterConfDAO.countByExample(ex);
			if (count >= 1) {
				strRet = "���������ظ�!";
				return strRet;
			}
		}
		this.mySysParameterConfDAO.insert(sto);
		return strRet;
	}

	/**
	 * DWR����--��������
	 *
	 * @param sto
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String updateDataSysParameterConf(SysParameterConf sto) throws Exception {
		String strRet = "";
		if (sto.getParName() != null && !"".equalsIgnoreCase(sto.getParName())) {
			SysParameterConfExample ex = new SysParameterConfExample();
			ex.createCriteria().andParNameEqualTo(sto.getParName().trim()).andParIdNotEqualTo(sto.getParId());
			int count = this.mySysParameterConfDAO.countByExample(ex);
			if (count >= 1) {
				strRet = "ϵͳ�����ظ�!";
				return strRet;
			}
		}
		this.mySysParameterConfDAO.updateByPrimaryKeySelective(sto);
		return strRet;
	};

	/**
	 * DWR����--ɾ������
	 *
	 * @param sto
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String deleteDataSysParameterConf(String ids) throws Exception {
		String strRet = "";
		String[] id = StringUtils.split(ids, "|");
		for (String s : id) {
			SysParameterConf spc = new SysParameterConf();
			spc.setParId(s);
			this.mySysParameterConfDAO.deleteByPrimaryKey(spc);
		}
		return strRet;
	}

	public String getParValueByParName(String parName) throws Exception {
		String parValue = "";
		SysParameterConfExample spcEx = new SysParameterConfExample();
		spcEx.createCriteria().andParNameEqualTo(parName);
		List<SysParameterConf> spcList = this.mySysParameterConfDAO.selectByExample(spcEx);
		if (spcList != null && spcList.size() > 0) {
			parValue = spcList.get(0).getParValue();
		}
		return parValue;
	}

	public String getParValueByParName(String parName, String defaultValue) throws Exception {
		String parValue = this.getParValueByParName(parName);
		return (parValue == null || "".equals(parValue.trim())) ? defaultValue : parValue;
	}
}