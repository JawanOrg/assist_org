/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuptIfaceGroupRelationExample extends BaseExample {
	protected String orderByClause;

	protected List<Criteria> oredCriteria;

	public SuptIfaceGroupRelationExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	protected SuptIfaceGroupRelationExample(SuptIfaceGroupRelationExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
	}

	public static class Criteria {
		protected List<String> criteriaWithoutValue;

		protected List<Map<String, Object>> criteriaWithSingleValue;

		protected List<Map<String, Object>> criteriaWithListValue;

		protected List<Map<String, Object>> criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList<String>();
			criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
			criteriaWithListValue = new ArrayList<Map<String, Object>>();
			criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0 || criteriaWithSingleValue.size() > 0 || criteriaWithListValue.size() > 0 || criteriaWithBetweenValue.size() > 0;
		}

		public List<String> getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List<Map<String, Object>> getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List<Map<String, Object>> getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List<Map<String, Object>> getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition, List<? extends Object> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			List<Object> list = new ArrayList<Object>();
			list.add(value1);
			list.add(value2);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andIfaceGroupIdIsNull() {
			addCriterion("iface_Group_Id is null");
			return this;
		}

		public Criteria andIfaceGroupIdIsNotNull() {
			addCriterion("iface_Group_Id is not null");
			return this;
		}

		public Criteria andIfaceGroupIdEqualTo(String value) {
			addCriterion("iface_Group_Id =", value, "ifaceGroupId");
			return this;
		}

		public Criteria andIfaceGroupIdNotEqualTo(String value) {
			addCriterion("iface_Group_Id <>", value, "ifaceGroupId");
			return this;
		}

		public Criteria andIfaceGroupIdGreaterThan(String value) {
			addCriterion("iface_Group_Id >", value, "ifaceGroupId");
			return this;
		}

		public Criteria andIfaceGroupIdGreaterThanOrEqualTo(String value) {
			addCriterion("iface_Group_Id >=", value, "ifaceGroupId");
			return this;
		}

		public Criteria andIfaceGroupIdLessThan(String value) {
			addCriterion("iface_Group_Id <", value, "ifaceGroupId");
			return this;
		}

		public Criteria andIfaceGroupIdLessThanOrEqualTo(String value) {
			addCriterion("iface_Group_Id <=", value, "ifaceGroupId");
			return this;
		}

		public Criteria andIfaceGroupIdLike(String value) {
			addCriterion("iface_Group_Id like", value, "ifaceGroupId");
			return this;
		}

		public Criteria andIfaceGroupIdNotLike(String value) {
			addCriterion("iface_Group_Id not like", value, "ifaceGroupId");
			return this;
		}

		public Criteria andIfaceGroupIdIn(List<String> values) {
			addCriterion("iface_Group_Id in", values, "ifaceGroupId");
			return this;
		}

		public Criteria andIfaceGroupIdNotIn(List<String> values) {
			addCriterion("iface_Group_Id not in", values, "ifaceGroupId");
			return this;
		}

		public Criteria andIfaceGroupIdBetween(String value1, String value2) {
			addCriterion("iface_Group_Id between", value1, value2, "ifaceGroupId");
			return this;
		}

		public Criteria andIfaceGroupIdNotBetween(String value1, String value2) {
			addCriterion("iface_Group_Id not between", value1, value2, "ifaceGroupId");
			return this;
		}

		public Criteria andInterfacecodeIsNull() {
			addCriterion("interfaceCode is null");
			return this;
		}

		public Criteria andInterfacecodeIsNotNull() {
			addCriterion("interfaceCode is not null");
			return this;
		}

		public Criteria andInterfacecodeEqualTo(String value) {
			addCriterion("interfaceCode =", value, "interfacecode");
			return this;
		}

		public Criteria andInterfacecodeNotEqualTo(String value) {
			addCriterion("interfaceCode <>", value, "interfacecode");
			return this;
		}

		public Criteria andInterfacecodeGreaterThan(String value) {
			addCriterion("interfaceCode >", value, "interfacecode");
			return this;
		}

		public Criteria andInterfacecodeGreaterThanOrEqualTo(String value) {
			addCriterion("interfaceCode >=", value, "interfacecode");
			return this;
		}

		public Criteria andInterfacecodeLessThan(String value) {
			addCriterion("interfaceCode <", value, "interfacecode");
			return this;
		}

		public Criteria andInterfacecodeLessThanOrEqualTo(String value) {
			addCriterion("interfaceCode <=", value, "interfacecode");
			return this;
		}

		public Criteria andInterfacecodeLike(String value) {
			addCriterion("interfaceCode like", value, "interfacecode");
			return this;
		}

		public Criteria andInterfacecodeNotLike(String value) {
			addCriterion("interfaceCode not like", value, "interfacecode");
			return this;
		}

		public Criteria andInterfacecodeIn(List<String> values) {
			addCriterion("interfaceCode in", values, "interfacecode");
			return this;
		}

		public Criteria andInterfacecodeNotIn(List<String> values) {
			addCriterion("interfaceCode not in", values, "interfacecode");
			return this;
		}

		public Criteria andInterfacecodeBetween(String value1, String value2) {
			addCriterion("interfaceCode between", value1, value2, "interfacecode");
			return this;
		}

		public Criteria andInterfacecodeNotBetween(String value1, String value2) {
			addCriterion("interfaceCode not between", value1, value2, "interfacecode");
			return this;
		}

		public Criteria andTaticgoupidIsNull() {
			addCriterion("taticGoupId is null");
			return this;
		}

		public Criteria andTaticgoupidIsNotNull() {
			addCriterion("taticGoupId is not null");
			return this;
		}

		public Criteria andTaticgoupidEqualTo(String value) {
			addCriterion("taticGoupId =", value, "taticgoupid");
			return this;
		}

		public Criteria andTaticgoupidNotEqualTo(String value) {
			addCriterion("taticGoupId <>", value, "taticgoupid");
			return this;
		}

		public Criteria andTaticgoupidGreaterThan(String value) {
			addCriterion("taticGoupId >", value, "taticgoupid");
			return this;
		}

		public Criteria andTaticgoupidGreaterThanOrEqualTo(String value) {
			addCriterion("taticGoupId >=", value, "taticgoupid");
			return this;
		}

		public Criteria andTaticgoupidLessThan(String value) {
			addCriterion("taticGoupId <", value, "taticgoupid");
			return this;
		}

		public Criteria andTaticgoupidLessThanOrEqualTo(String value) {
			addCriterion("taticGoupId <=", value, "taticgoupid");
			return this;
		}

		public Criteria andTaticgoupidLike(String value) {
			addCriterion("taticGoupId like", value, "taticgoupid");
			return this;
		}

		public Criteria andTaticgoupidNotLike(String value) {
			addCriterion("taticGoupId not like", value, "taticgoupid");
			return this;
		}

		public Criteria andTaticgoupidIn(List<String> values) {
			addCriterion("taticGoupId in", values, "taticgoupid");
			return this;
		}

		public Criteria andTaticgoupidNotIn(List<String> values) {
			addCriterion("taticGoupId not in", values, "taticgoupid");
			return this;
		}

		public Criteria andTaticgoupidBetween(String value1, String value2) {
			addCriterion("taticGoupId between", value1, value2, "taticgoupid");
			return this;
		}

		public Criteria andTaticgoupidNotBetween(String value1, String value2) {
			addCriterion("taticGoupId not between", value1, value2, "taticgoupid");
			return this;
		}

		public Criteria andPriorityIsNull() {
			addCriterion("priority is null");
			return this;
		}

		public Criteria andPriorityIsNotNull() {
			addCriterion("priority is not null");
			return this;
		}

		public Criteria andPriorityEqualTo(String value) {
			addCriterion("priority =", value, "priority");
			return this;
		}

		public Criteria andPriorityNotEqualTo(String value) {
			addCriterion("priority <>", value, "priority");
			return this;
		}

		public Criteria andPriorityGreaterThan(String value) {
			addCriterion("priority >", value, "priority");
			return this;
		}

		public Criteria andPriorityGreaterThanOrEqualTo(String value) {
			addCriterion("priority >=", value, "priority");
			return this;
		}

		public Criteria andPriorityLessThan(String value) {
			addCriterion("priority <", value, "priority");
			return this;
		}

		public Criteria andPriorityLessThanOrEqualTo(String value) {
			addCriterion("priority <=", value, "priority");
			return this;
		}

		public Criteria andPriorityLike(String value) {
			addCriterion("priority like", value, "priority");
			return this;
		}

		public Criteria andPriorityNotLike(String value) {
			addCriterion("priority not like", value, "priority");
			return this;
		}

		public Criteria andPriorityIn(List<String> values) {
			addCriterion("priority in", values, "priority");
			return this;
		}

		public Criteria andPriorityNotIn(List<String> values) {
			addCriterion("priority not in", values, "priority");
			return this;
		}

		public Criteria andPriorityBetween(String value1, String value2) {
			addCriterion("priority between", value1, value2, "priority");
			return this;
		}

		public Criteria andPriorityNotBetween(String value1, String value2) {
			addCriterion("priority not between", value1, value2, "priority");
			return this;
		}

		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return this;
		}

		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return this;
		}

		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return this;
		}

		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return this;
		}

		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "remark");
			return this;
		}

		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return this;
		}

		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return this;
		}

		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return this;
		}

		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return this;
		}

		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return this;
		}

		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return this;
		}

		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return this;
		}

		public Criteria andTatictypeEqualTo(String value) {
			addCriterion(" (exists (SELECT 1 FROM t_supt_tactic_group g WHERE  g.taticGoupId=t_supt_iface_group_relation.taticGoupId AND g.tatictype='" + value + "'))");
			return this;
		}
	}
}