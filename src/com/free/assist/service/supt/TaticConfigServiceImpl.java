package com.free.assist.service.supt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.assist.dao.SuptIfaceGroupRelationDAO;
import com.free.assist.dao.SuptTaticElementDAO;
import com.free.assist.dao.SuptTaticGroupDAO;
import com.free.assist.dao.SuptTaticInstanceDAO;
import com.free.assist.dao.SuptTaticRelationDAO;
import com.free.assist.domain.SuptIfaceGroupRelation;
import com.free.assist.domain.SuptIfaceGroupRelationExample;
import com.free.assist.domain.SuptTaticElement;
import com.free.assist.domain.SuptTaticGroup;
import com.free.assist.domain.SuptTaticInstance;
import com.free.assist.domain.SuptTaticInstanceExample;
import com.free.assist.domain.SuptTaticRelation;
import com.free.assist.domain.SuptTaticRelationExample;
import com.free.assist.domain.SysUser;
import com.free.assist.service.BaseServiceImpl;
import com.free.assist.util.Helper;
import com.free.assist.util.StringUtil;

@Service("taticConfigService")
public class TaticConfigServiceImpl extends BaseServiceImpl implements ITaticConfigService {
	SuptTaticRelationDAO suptTaticRelationDAO;

	SuptTaticGroupDAO suptTaticGroupDAO;

	SuptTaticElementDAO suptTaticElementDAO;

	SuptTaticInstanceDAO suptTaticInstanceDAO;

	SuptIfaceGroupRelationDAO suptIfaceGroupRelationDAO;

	@Autowired
	public void setSuptTaticRelationDAO(SuptTaticRelationDAO suptTaticRelationDAO) {
		this.suptTaticRelationDAO = suptTaticRelationDAO;
	}

	@Autowired
	public void setSuptTaticGroupDAO(SuptTaticGroupDAO suptTaticGroupDAO) {
		this.suptTaticGroupDAO = suptTaticGroupDAO;
	}

	@Autowired
	public void setSuptTaticElementDAO(SuptTaticElementDAO suptTaticElementDAO) {
		this.suptTaticElementDAO = suptTaticElementDAO;
	}

	@Autowired
	public void setSuptTaticInstanceDAO(SuptTaticInstanceDAO suptTaticInstanceDAO) {
		this.suptTaticInstanceDAO = suptTaticInstanceDAO;
	}

	@Autowired
	public void setSuptIfaceGroupRelationDAO(SuptIfaceGroupRelationDAO suptIfaceGroupRelationDAO) {
		this.suptIfaceGroupRelationDAO = suptIfaceGroupRelationDAO;
	}

	/**
	 * 插入策略组
	 */
	public void insertTaticGroup(SuptTaticGroup model, SysUser user) {
		List<SuptTaticElement> list = model.getTaticElementList();
		this.suptTaticGroupDAO.insert(model);
		for (SuptTaticElement te : list) {
			SuptTaticRelation tr = new SuptTaticRelation();
			tr.setElementid(te.getElementid());
			tr.setTaticgoupid(model.getTaticgoupid());
			this.suptTaticRelationDAO.insert(tr);
		}
	}

	/**
	 * 修改策略组
	 * @throws Exception
	 */
	public void updateTaticGroup(SuptTaticGroup model, SysUser user) throws Exception {
		SuptIfaceGroupRelationExample grEx = new SuptIfaceGroupRelationExample();
		grEx.createCriteria().andTaticgoupidEqualTo(model.getTaticgoupid());
		Integer n = this.suptIfaceGroupRelationDAO.countByExample(grEx);
		if (n > 0) {
			throw new Exception("选中的策略组已经配置了策略实例，请先删除策略实例和策略关系");
		}
		List<SuptTaticElement> list = model.getTaticElementList();
		this.suptTaticGroupDAO.updateByPrimaryKey(model);
		SuptTaticRelationExample trEx = new SuptTaticRelationExample();
		trEx.createCriteria().andTaticgoupidEqualTo(model.getTaticgoupid());
		this.suptTaticRelationDAO.deleteByExample(trEx);
		for (SuptTaticElement te : list) {
			SuptTaticRelation tr = new SuptTaticRelation();
			tr.setElementid(te.getElementid());
			tr.setTaticgoupid(model.getTaticgoupid());
			this.suptTaticRelationDAO.insert(tr);
		}
	}

	/**
	 * 删除策略组
	 *
	 * @throws Exception
	 */
	public void delTaticGroup(SuptTaticGroup model, SysUser user) throws Exception {
		SuptIfaceGroupRelationExample grEx = new SuptIfaceGroupRelationExample();
		grEx.createCriteria().andTaticgoupidEqualTo(model.getTaticgoupid());
		Integer n = this.suptIfaceGroupRelationDAO.countByExample(grEx);
		if (n > 0) {
			throw new Exception("选中的策略组已经配置了策略实例，请先删除策略实例和策略关系");
		}

		SuptTaticRelationExample trEx = new SuptTaticRelationExample();
		trEx.createCriteria().andTaticgoupidEqualTo(model.getTaticgoupid());
		this.suptTaticRelationDAO.deleteByExample(trEx);
		this.suptTaticGroupDAO.deleteByPrimaryKey(model);
	}

	/**
	 * 增加策略实例
	 *
	 * @param model
	 * @param list
	 * @param user
	 */
	public void insertTaticInstance(SuptTaticInstance model, List<SuptTaticInstance> list, SysUser user) {
		String rowrecordid = StringUtil.nullToEmptyOfObject(model.getRowrecordid());
		if (!rowrecordid.equals("")) {
			SuptTaticInstanceExample ex = new SuptTaticInstanceExample();
			ex.createCriteria().andRowrecordidEqualTo(rowrecordid);
			this.suptTaticInstanceDAO.deleteByExample(ex);
		}
		String id = super.buildGUID();
		for (SuptTaticInstance ti : list) {
			ti.setInterfacecode(model.getInterfacecode());
			ti.setTaticgoupid(model.getTaticgoupid());
			ti.setRowrecordid(id);
			ti.setDispatchobject(model.getDispatchobject());
			ti.setChangeElement(model.getChangeElement());
			ti.setResulttype(model.getResulttype());
			this.suptTaticInstanceDAO.insert(ti);
		}
	}

	/**
	 * 增加策略组与接口关系
	 *
	 * @param model
	 * @param list
	 * @param user
	 */
	public void insertIfaceGroup(SuptIfaceGroupRelation model, List<SuptIfaceGroupRelation> list, SysUser user) {
		SuptIfaceGroupRelationExample ex = new SuptIfaceGroupRelationExample();
		ex.createCriteria().andInterfacecodeEqualTo(model.getInterfacecode());
		int n = super.selectCountByExample(ex);
		for (SuptIfaceGroupRelation gr : list) {
			n = n + 1;
			gr.setInterfacecode(model.getInterfacecode());
			gr.setPriority(n + "");
			this.suptIfaceGroupRelationDAO.insert(gr);
		}
	}

	/**
	 * 修改策略组与接口关系
	 *
	 * @param model
	 * @param list
	 * @param user
	 */
	public void updateIfaceGroup(List<SuptIfaceGroupRelation> list, SysUser user) {
		for (SuptIfaceGroupRelation gr : list) {
			this.suptIfaceGroupRelationDAO.updateByPrimaryKeySelective(gr);
		}
	}

	/**
	 * 取得策略配置对象
	 *
	 * @param methodId
	 * @param document
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String getTaticDispatchObject(String methodId, Document document) {
		SuptIfaceGroupRelationExample grEx = new SuptIfaceGroupRelationExample();
		grEx.createCriteria().andInterfacecodeEqualTo(methodId).andTatictypeEqualTo("tactic_dispatch");
		grEx.setOrderByClause(" t_supt_iface_group_relation.priority ");
		List<SuptIfaceGroupRelation> grList = this.selectByExample(grEx);
		String dispatchobject = null;
		for (SuptIfaceGroupRelation group : grList) {
			String taticGoupId = group.getTaticgoupid();
			SuptTaticInstanceExample tiEx = new SuptTaticInstanceExample();
			tiEx.createCriteria().andTaticgoupidEqualTo(taticGoupId).andInterfacecodeEqualTo(methodId).andMatchingRuleNotEqualTo("notUse");
			tiEx.setOrderByClause(" t_supt_tactic_instance.rowRecordId ");
			List<SuptTaticInstance> tiList = this.selectByExample(tiEx);
			String lastRowRecordId = null;
			String nextRowRecordId = null;
			for (SuptTaticInstance ti : tiList) {
				if (dispatchobject != null) {
					break;
				}
				if (lastRowRecordId == null) {
					lastRowRecordId = ti.getRowrecordid();
				}
				nextRowRecordId = ti.getRowrecordid();
				// 同一条配置记录
				if (lastRowRecordId.equals(nextRowRecordId)) {
					if ("equal".equalsIgnoreCase(ti.getMatchingRule())) {// 等于
						if (ti.getElevalue1().equals(document.selectSingleNode(ti.getXmlNodename()).getText())) {
							dispatchobject = ti.getDispatchobject();
						} else {
							dispatchobject = null;
						}
					}
					lastRowRecordId = nextRowRecordId;
				} else {
					lastRowRecordId = null;
					if (dispatchobject != null) {
						break;
					}
				}
			}
		}
		return dispatchobject;
	}

	/**
	 * 删除策略组与接口关系
	 *
	 * @throws Exception
	 */
	public void delIfaceGroup(SuptIfaceGroupRelation model, SysUser user) throws Exception {
		model = (SuptIfaceGroupRelation) this.suptIfaceGroupRelationDAO.selectByPrimaryKey(model);
		SuptTaticInstanceExample instanceEx = new SuptTaticInstanceExample();
		instanceEx.createCriteria().andInterfacecodeEqualTo(model.getInterfacecode()).andTaticgoupidEqualTo(model.getTaticgoupid());
		Integer n = this.suptTaticInstanceDAO.countByExample(instanceEx);
		if (n > 0) {
			throw new Exception("此接口下的策略组已经配置了实例信息，不能进行删除");
		}
		SuptIfaceGroupRelationExample ex = new SuptIfaceGroupRelationExample();
		ex.createCriteria().andIfaceGroupIdEqualTo(model.getIfaceGroupId());
		this.suptIfaceGroupRelationDAO.deleteByExample(ex);
	}

	/**
	 * 通过策略取得转换值
	 *
	 * @param methodId
	 * @param document
	 * @return
	 */
	public String getTatiConversionValue(String methodId, String elementName, Document document, Map<String, String> map, String taticGroupType) {
		String conversionValue = "";
		SuptIfaceGroupRelationExample grEx = new SuptIfaceGroupRelationExample();
		grEx.createCriteria().andInterfacecodeEqualTo(methodId).andTatictypeEqualTo(taticGroupType);
		grEx.setOrderByClause(" t_supt_iface_group_relation.priority ");
		List<SuptIfaceGroupRelation> grList = this.selectByExample(grEx);
		for (SuptIfaceGroupRelation group : grList) {
			if (conversionValue != null && !"".equals(conversionValue)) {
				break;
			}
			String taticGoupId = group.getTaticgoupid();
			SuptTaticInstanceExample tiEx = new SuptTaticInstanceExample();
			tiEx.createCriteria().andTaticgoupidEqualTo(taticGoupId).andInterfacecodeEqualTo(methodId).andChangeElementEqualTo(elementName).andMatchingRuleNotEqualTo("notUse");
			tiEx.setOrderByClause(" t_supt_tactic_instance.rowRecordId ");
			List<SuptTaticInstance> tiList = this.selectByExample(tiEx);
			String lastRowRecordId = null;
			String nextRowRecordId = null;
			List<String> noUseRecordList = new ArrayList<String>();
			for (SuptTaticInstance ti : tiList) {
				if (lastRowRecordId == null) {
					lastRowRecordId = ti.getRowrecordid();
				}
				nextRowRecordId = ti.getRowrecordid();
				if (lastRowRecordId.equals(nextRowRecordId) && !noUseRecordList.contains(nextRowRecordId)) {
					if ("notUse".equalsIgnoreCase(ti.getMatchingRule())) {// 无效
						continue;
					} else if ("equal".equalsIgnoreCase(ti.getMatchingRule())) {// 等于
						if (document.selectSingleNode(ti.getXmlNodename()) != null && ti.getElevalue1().equals(document.selectSingleNode(ti.getXmlNodename()).getText())) {
							conversionValue = this.getDispatchobject(ti.getResulttype(), ti.getDispatchobject(), document);
						} else {
							conversionValue = "";
							noUseRecordList.add(nextRowRecordId);// 添加已经读取并且无效的记录编号
							lastRowRecordId = null;
						}
					} else if ("notEqual".equalsIgnoreCase(ti.getMatchingRule())) {// 不等于
						if (document.selectSingleNode(ti.getXmlNodename()) != null && !ti.getElevalue1().equals(document.selectSingleNode(ti.getXmlNodename()).getText())) {
							conversionValue = this.getDispatchobject(ti.getResulttype(), ti.getDispatchobject(), document);
						} else {
							conversionValue = "";
							noUseRecordList.add(nextRowRecordId);// 添加已经读取并且无效的记录编号
							lastRowRecordId = null;
						}
					} else if ("like".equalsIgnoreCase(ti.getMatchingRule())) {// 模糊
						if (document.selectSingleNode(ti.getXmlNodename()) != null && document.selectSingleNode(ti.getXmlNodename()).getText().indexOf(ti.getElevalue1()) != -1) {
							conversionValue = this.getDispatchobject(ti.getResulttype(), ti.getDispatchobject(), document);
						} else {
							conversionValue = "";
							noUseRecordList.add(nextRowRecordId);// 添加已经读取并且无效的记录编号
							lastRowRecordId = null;
						}
					} else if ("rlike".equalsIgnoreCase(ti.getMatchingRule())) {// 右模糊
						if (document.selectSingleNode(ti.getXmlNodename()) != null && document.selectSingleNode(ti.getXmlNodename()).getText().startsWith(ti.getElevalue1())) {
							conversionValue = this.getDispatchobject(ti.getResulttype(), ti.getDispatchobject(), document);
						} else {
							conversionValue = "";
							noUseRecordList.add(nextRowRecordId);// 添加已经读取并且无效的记录编号
							lastRowRecordId = null;
						}
					} else if ("llike".equalsIgnoreCase(ti.getMatchingRule())) {// 左模糊
						if (document.selectSingleNode(ti.getXmlNodename()) != null && document.selectSingleNode(ti.getXmlNodename()).getText().endsWith(ti.getElevalue1())) {
							conversionValue = this.getDispatchobject(ti.getResulttype(), ti.getDispatchobject(), document);
						} else {
							conversionValue = "";
							noUseRecordList.add(nextRowRecordId);// 添加已经读取并且无效的记录编号
							lastRowRecordId = null;
						}
					} else if ("existValue".equalsIgnoreCase(ti.getMatchingRule())) {// 已存在值：即事先已取得或是通过策略已得到的值
						if (document.selectSingleNode(ti.getXmlNodename()) != null && ti.getElevalue1().equals(map.get(ti.getXmlNodename()))) {
							conversionValue = this.getDispatchobject(ti.getResulttype(), ti.getDispatchobject(), document);
						} else {
							conversionValue = "";
							noUseRecordList.add(nextRowRecordId);// 添加已经读取并且无效的记录编号
							lastRowRecordId = null;
						}
					} else if ("null".equalsIgnoreCase(ti.getMatchingRule())) {// 为空
						if (document.selectSingleNode(ti.getXmlNodename()) != null && document.selectSingleNode(ti.getXmlNodename()).getText().trim().length() == 0) {
							conversionValue = this.getDispatchobject(ti.getResulttype(), ti.getDispatchobject(), document);
						} else {
							conversionValue = "";
							noUseRecordList.add(nextRowRecordId);// 添加已经读取并且无效的记录编号
							lastRowRecordId = null;
						}
					} else if ("notNull".equalsIgnoreCase(ti.getMatchingRule())) {// 不为空
						if (document.selectSingleNode(ti.getXmlNodename()) != null && document.selectSingleNode(ti.getXmlNodename()).getText().trim().length() > 0) {
							conversionValue = this.getDispatchobject(ti.getResulttype(), ti.getDispatchobject(), document);
						} else {
							conversionValue = "";
							noUseRecordList.add(nextRowRecordId);// 添加已经读取并且无效的记录编号
							lastRowRecordId = null;
						}
					} else if ("greater".equalsIgnoreCase(ti.getMatchingRule())) {// 大于

					} else if ("less".equalsIgnoreCase(ti.getMatchingRule())) {// 小于

					} else if ("greaterAndEqual".equalsIgnoreCase(ti.getMatchingRule())) {// 大于等于

					} else if ("lessAndEqual".equalsIgnoreCase(ti.getMatchingRule())) {// 小于等于

					}
				} else {
					lastRowRecordId = null;
					if (conversionValue != null && !"".equals(conversionValue)) {
						break;
					}
				}
			}
		}
		return conversionValue;
	}

	// 取得策略结果值
	private String getDispatchobject(String resultType, String dispatchobject, Document document) {
		String conversionValue = "";
		if ("xmlNode".equalsIgnoreCase(resultType)) {
			if (dispatchobject != null && dispatchobject.indexOf(";") != -1) {// 存在多个值则只返回存在的那一个即可
				String[] dispatchobjectArrays = Helper.split(dispatchobject, ";");
				for (String disObj : dispatchobjectArrays) {
					if (document.selectSingleNode(disObj) != null && document.selectSingleNode(disObj).getText() != null && document.selectSingleNode(disObj).getText().trim().length() > 0) {
						conversionValue = document.selectSingleNode(disObj).getText();
						break;
					}
				}
			} else {
				if (document.selectSingleNode(dispatchobject) != null) {
					conversionValue = document.selectSingleNode(dispatchobject).getText();
				}
			}
		} else {
			conversionValue = dispatchobject;
		}
		return conversionValue;
	}
}
