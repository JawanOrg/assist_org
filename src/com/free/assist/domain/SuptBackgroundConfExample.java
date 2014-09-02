/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuptBackgroundConfExample extends BaseExample {
	protected String orderByClause;

	protected List<Criteria> oredCriteria;

	public SuptBackgroundConfExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	protected SuptBackgroundConfExample(SuptBackgroundConfExample example) {
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

		public Criteria andBackgroundTypeIsNull() {
			addCriterion("BACKGROUND_TYPE is null");
			return this;
		}

		public Criteria andBackgroundTypeIsNotNull() {
			addCriterion("BACKGROUND_TYPE is not null");
			return this;
		}

		public Criteria andBackgroundTypeEqualTo(String value) {
			addCriterion("BACKGROUND_TYPE =", value, "backgroundType");
			return this;
		}

		public Criteria andBackgroundTypeNotEqualTo(String value) {
			addCriterion("BACKGROUND_TYPE <>", value, "backgroundType");
			return this;
		}

		public Criteria andBackgroundTypeGreaterThan(String value) {
			addCriterion("BACKGROUND_TYPE >", value, "backgroundType");
			return this;
		}

		public Criteria andBackgroundTypeGreaterThanOrEqualTo(String value) {
			addCriterion("BACKGROUND_TYPE >=", value, "backgroundType");
			return this;
		}

		public Criteria andBackgroundTypeLessThan(String value) {
			addCriterion("BACKGROUND_TYPE <", value, "backgroundType");
			return this;
		}

		public Criteria andBackgroundTypeLessThanOrEqualTo(String value) {
			addCriterion("BACKGROUND_TYPE <=", value, "backgroundType");
			return this;
		}

		public Criteria andBackgroundTypeLike(String value) {
			addCriterion("BACKGROUND_TYPE like", value, "backgroundType");
			return this;
		}

		public Criteria andBackgroundTypeNotLike(String value) {
			addCriterion("BACKGROUND_TYPE not like", value, "backgroundType");
			return this;
		}

		public Criteria andBackgroundTypeIn(List<String> values) {
			addCriterion("BACKGROUND_TYPE in", values, "backgroundType");
			return this;
		}

		public Criteria andBackgroundTypeNotIn(List<String> values) {
			addCriterion("BACKGROUND_TYPE not in", values, "backgroundType");
			return this;
		}

		public Criteria andBackgroundTypeBetween(String value1, String value2) {
			addCriterion("BACKGROUND_TYPE between", value1, value2, "backgroundType");
			return this;
		}

		public Criteria andBackgroundTypeNotBetween(String value1, String value2) {
			addCriterion("BACKGROUND_TYPE not between", value1, value2, "backgroundType");
			return this;
		}

		public Criteria andBackgroundTypeDescIsNull() {
			addCriterion("BACKGROUND_TYPE_DESC is null");
			return this;
		}

		public Criteria andBackgroundTypeDescIsNotNull() {
			addCriterion("BACKGROUND_TYPE_DESC is not null");
			return this;
		}

		public Criteria andBackgroundTypeDescEqualTo(String value) {
			addCriterion("BACKGROUND_TYPE_DESC =", value, "backgroundTypeDesc");
			return this;
		}

		public Criteria andBackgroundTypeDescNotEqualTo(String value) {
			addCriterion("BACKGROUND_TYPE_DESC <>", value, "backgroundTypeDesc");
			return this;
		}

		public Criteria andBackgroundTypeDescGreaterThan(String value) {
			addCriterion("BACKGROUND_TYPE_DESC >", value, "backgroundTypeDesc");
			return this;
		}

		public Criteria andBackgroundTypeDescGreaterThanOrEqualTo(String value) {
			addCriterion("BACKGROUND_TYPE_DESC >=", value, "backgroundTypeDesc");
			return this;
		}

		public Criteria andBackgroundTypeDescLessThan(String value) {
			addCriterion("BACKGROUND_TYPE_DESC <", value, "backgroundTypeDesc");
			return this;
		}

		public Criteria andBackgroundTypeDescLessThanOrEqualTo(String value) {
			addCriterion("BACKGROUND_TYPE_DESC <=", value, "backgroundTypeDesc");
			return this;
		}

		public Criteria andBackgroundTypeDescLike(String value) {
			addCriterion("BACKGROUND_TYPE_DESC like", value, "backgroundTypeDesc");
			return this;
		}

		public Criteria andBackgroundTypeDescNotLike(String value) {
			addCriterion("BACKGROUND_TYPE_DESC not like", value, "backgroundTypeDesc");
			return this;
		}

		public Criteria andBackgroundTypeDescIn(List<String> values) {
			addCriterion("BACKGROUND_TYPE_DESC in", values, "backgroundTypeDesc");
			return this;
		}

		public Criteria andBackgroundTypeDescNotIn(List<String> values) {
			addCriterion("BACKGROUND_TYPE_DESC not in", values, "backgroundTypeDesc");
			return this;
		}

		public Criteria andBackgroundTypeDescBetween(String value1, String value2) {
			addCriterion("BACKGROUND_TYPE_DESC between", value1, value2, "backgroundTypeDesc");
			return this;
		}

		public Criteria andBackgroundTypeDescNotBetween(String value1, String value2) {
			addCriterion("BACKGROUND_TYPE_DESC not between", value1, value2, "backgroundTypeDesc");
			return this;
		}

		public Criteria andExecIntervalIsNull() {
			addCriterion("EXEC_INTERVAL is null");
			return this;
		}

		public Criteria andExecIntervalIsNotNull() {
			addCriterion("EXEC_INTERVAL is not null");
			return this;
		}

		public Criteria andExecIntervalEqualTo(Integer value) {
			addCriterion("EXEC_INTERVAL =", value, "execInterval");
			return this;
		}

		public Criteria andExecIntervalNotEqualTo(Integer value) {
			addCriterion("EXEC_INTERVAL <>", value, "execInterval");
			return this;
		}

		public Criteria andExecIntervalGreaterThan(Integer value) {
			addCriterion("EXEC_INTERVAL >", value, "execInterval");
			return this;
		}

		public Criteria andExecIntervalGreaterThanOrEqualTo(Integer value) {
			addCriterion("EXEC_INTERVAL >=", value, "execInterval");
			return this;
		}

		public Criteria andExecIntervalLessThan(Integer value) {
			addCriterion("EXEC_INTERVAL <", value, "execInterval");
			return this;
		}

		public Criteria andExecIntervalLessThanOrEqualTo(Integer value) {
			addCriterion("EXEC_INTERVAL <=", value, "execInterval");
			return this;
		}

		public Criteria andExecIntervalIn(List<Integer> values) {
			addCriterion("EXEC_INTERVAL in", values, "execInterval");
			return this;
		}

		public Criteria andExecIntervalNotIn(List<Integer> values) {
			addCriterion("EXEC_INTERVAL not in", values, "execInterval");
			return this;
		}

		public Criteria andExecIntervalBetween(Integer value1, Integer value2) {
			addCriterion("EXEC_INTERVAL between", value1, value2, "execInterval");
			return this;
		}

		public Criteria andExecIntervalNotBetween(Integer value1, Integer value2) {
			addCriterion("EXEC_INTERVAL not between", value1, value2, "execInterval");
			return this;
		}

		public Criteria andLastRunTimeIsNull() {
			addCriterion("LAST_RUN_TIME is null");
			return this;
		}

		public Criteria andLastRunTimeIsNotNull() {
			addCriterion("LAST_RUN_TIME is not null");
			return this;
		}

		public Criteria andLastRunTimeEqualTo(Date value) {
			addCriterion("LAST_RUN_TIME =", value, "lastRunTime");
			return this;
		}

		public Criteria andLastRunTimeNotEqualTo(Date value) {
			addCriterion("LAST_RUN_TIME <>", value, "lastRunTime");
			return this;
		}

		public Criteria andLastRunTimeGreaterThan(Date value) {
			addCriterion("LAST_RUN_TIME >", value, "lastRunTime");
			return this;
		}

		public Criteria andLastRunTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("LAST_RUN_TIME >=", value, "lastRunTime");
			return this;
		}

		public Criteria andLastRunTimeLessThan(Date value) {
			addCriterion("LAST_RUN_TIME <", value, "lastRunTime");
			return this;
		}

		public Criteria andLastRunTimeLessThanOrEqualTo(Date value) {
			addCriterion("LAST_RUN_TIME <=", value, "lastRunTime");
			return this;
		}

		public Criteria andLastRunTimeIn(List<Date> values) {
			addCriterion("LAST_RUN_TIME in", values, "lastRunTime");
			return this;
		}

		public Criteria andLastRunTimeNotIn(List<Date> values) {
			addCriterion("LAST_RUN_TIME not in", values, "lastRunTime");
			return this;
		}

		public Criteria andLastRunTimeBetween(Date value1, Date value2) {
			addCriterion("LAST_RUN_TIME between", value1, value2, "lastRunTime");
			return this;
		}

		public Criteria andLastRunTimeNotBetween(Date value1, Date value2) {
			addCriterion("LAST_RUN_TIME not between", value1, value2, "lastRunTime");
			return this;
		}

		public Criteria andNextRunTimeIsNull() {
			addCriterion("NEXT_RUN_TIME is null");
			return this;
		}

		public Criteria andNextRunTimeIsNotNull() {
			addCriterion("NEXT_RUN_TIME is not null");
			return this;
		}

		public Criteria andNextRunTimeEqualTo(Date value) {
			addCriterion("NEXT_RUN_TIME =", value, "nextRunTime");
			return this;
		}

		public Criteria andNextRunTimeNotEqualTo(Date value) {
			addCriterion("NEXT_RUN_TIME <>", value, "nextRunTime");
			return this;
		}

		public Criteria andNextRunTimeGreaterThan(Date value) {
			addCriterion("NEXT_RUN_TIME >", value, "nextRunTime");
			return this;
		}

		public Criteria andNextRunTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("NEXT_RUN_TIME >=", value, "nextRunTime");
			return this;
		}

		public Criteria andNextRunTimeLessThan(Date value) {
			addCriterion("NEXT_RUN_TIME <", value, "nextRunTime");
			return this;
		}

		public Criteria andNextRunTimeLessThanOrEqualTo(Date value) {
			addCriterion("NEXT_RUN_TIME <=", value, "nextRunTime");
			return this;
		}

		public Criteria andNextRunTimeIn(List<Date> values) {
			addCriterion("NEXT_RUN_TIME in", values, "nextRunTime");
			return this;
		}

		public Criteria andNextRunTimeNotIn(List<Date> values) {
			addCriterion("NEXT_RUN_TIME not in", values, "nextRunTime");
			return this;
		}

		public Criteria andNextRunTimeBetween(Date value1, Date value2) {
			addCriterion("NEXT_RUN_TIME between", value1, value2, "nextRunTime");
			return this;
		}

		public Criteria andNextRunTimeNotBetween(Date value1, Date value2) {
			addCriterion("NEXT_RUN_TIME not between", value1, value2, "nextRunTime");
			return this;
		}

		public Criteria andIsValidIsNull() {
			addCriterion("IS_VALID is null");
			return this;
		}

		public Criteria andIsValidIsNotNull() {
			addCriterion("IS_VALID is not null");
			return this;
		}

		public Criteria andIsValidEqualTo(String value) {
			addCriterion("IS_VALID =", value, "isValid");
			return this;
		}

		public Criteria andIsValidNotEqualTo(String value) {
			addCriterion("IS_VALID <>", value, "isValid");
			return this;
		}

		public Criteria andIsValidGreaterThan(String value) {
			addCriterion("IS_VALID >", value, "isValid");
			return this;
		}

		public Criteria andIsValidGreaterThanOrEqualTo(String value) {
			addCriterion("IS_VALID >=", value, "isValid");
			return this;
		}

		public Criteria andIsValidLessThan(String value) {
			addCriterion("IS_VALID <", value, "isValid");
			return this;
		}

		public Criteria andIsValidLessThanOrEqualTo(String value) {
			addCriterion("IS_VALID <=", value, "isValid");
			return this;
		}

		public Criteria andIsValidLike(String value) {
			addCriterion("IS_VALID like", value, "isValid");
			return this;
		}

		public Criteria andIsValidNotLike(String value) {
			addCriterion("IS_VALID not like", value, "isValid");
			return this;
		}

		public Criteria andIsValidIn(List<String> values) {
			addCriterion("IS_VALID in", values, "isValid");
			return this;
		}

		public Criteria andIsValidNotIn(List<String> values) {
			addCriterion("IS_VALID not in", values, "isValid");
			return this;
		}

		public Criteria andIsValidBetween(String value1, String value2) {
			addCriterion("IS_VALID between", value1, value2, "isValid");
			return this;
		}

		public Criteria andIsValidNotBetween(String value1, String value2) {
			addCriterion("IS_VALID not between", value1, value2, "isValid");
			return this;
		}

		public Criteria andIsNormalIsNull() {
			addCriterion("IS_NORMAL is null");
			return this;
		}

		public Criteria andIsNormalIsNotNull() {
			addCriterion("IS_NORMAL is not null");
			return this;
		}

		public Criteria andIsNormalEqualTo(String value) {
			addCriterion("IS_NORMAL =", value, "isNormal");
			return this;
		}

		public Criteria andIsNormalNotEqualTo(String value) {
			addCriterion("IS_NORMAL <>", value, "isNormal");
			return this;
		}

		public Criteria andIsNormalGreaterThan(String value) {
			addCriterion("IS_NORMAL >", value, "isNormal");
			return this;
		}

		public Criteria andIsNormalGreaterThanOrEqualTo(String value) {
			addCriterion("IS_NORMAL >=", value, "isNormal");
			return this;
		}

		public Criteria andIsNormalLessThan(String value) {
			addCriterion("IS_NORMAL <", value, "isNormal");
			return this;
		}

		public Criteria andIsNormalLessThanOrEqualTo(String value) {
			addCriterion("IS_NORMAL <=", value, "isNormal");
			return this;
		}

		public Criteria andIsNormalLike(String value) {
			addCriterion("IS_NORMAL like", value, "isNormal");
			return this;
		}

		public Criteria andIsNormalNotLike(String value) {
			addCriterion("IS_NORMAL not like", value, "isNormal");
			return this;
		}

		public Criteria andIsNormalIn(List<String> values) {
			addCriterion("IS_NORMAL in", values, "isNormal");
			return this;
		}

		public Criteria andIsNormalNotIn(List<String> values) {
			addCriterion("IS_NORMAL not in", values, "isNormal");
			return this;
		}

		public Criteria andIsNormalBetween(String value1, String value2) {
			addCriterion("IS_NORMAL between", value1, value2, "isNormal");
			return this;
		}

		public Criteria andIsNormalNotBetween(String value1, String value2) {
			addCriterion("IS_NORMAL not between", value1, value2, "isNormal");
			return this;
		}

		public Criteria andSpare1IsNull() {
			addCriterion("SPARE1 is null");
			return this;
		}

		public Criteria andSpare1IsNotNull() {
			addCriterion("SPARE1 is not null");
			return this;
		}

		public Criteria andSpare1EqualTo(String value) {
			addCriterion("SPARE1 =", value, "spare1");
			return this;
		}

		public Criteria andSpare1NotEqualTo(String value) {
			addCriterion("SPARE1 <>", value, "spare1");
			return this;
		}

		public Criteria andSpare1GreaterThan(String value) {
			addCriterion("SPARE1 >", value, "spare1");
			return this;
		}

		public Criteria andSpare1GreaterThanOrEqualTo(String value) {
			addCriterion("SPARE1 >=", value, "spare1");
			return this;
		}

		public Criteria andSpare1LessThan(String value) {
			addCriterion("SPARE1 <", value, "spare1");
			return this;
		}

		public Criteria andSpare1LessThanOrEqualTo(String value) {
			addCriterion("SPARE1 <=", value, "spare1");
			return this;
		}

		public Criteria andSpare1Like(String value) {
			addCriterion("SPARE1 like", value, "spare1");
			return this;
		}

		public Criteria andSpare1NotLike(String value) {
			addCriterion("SPARE1 not like", value, "spare1");
			return this;
		}

		public Criteria andSpare1In(List<String> values) {
			addCriterion("SPARE1 in", values, "spare1");
			return this;
		}

		public Criteria andSpare1NotIn(List<String> values) {
			addCriterion("SPARE1 not in", values, "spare1");
			return this;
		}

		public Criteria andSpare1Between(String value1, String value2) {
			addCriterion("SPARE1 between", value1, value2, "spare1");
			return this;
		}

		public Criteria andSpare1NotBetween(String value1, String value2) {
			addCriterion("SPARE1 not between", value1, value2, "spare1");
			return this;
		}

		public Criteria andSpare2IsNull() {
			addCriterion("SPARE2 is null");
			return this;
		}

		public Criteria andSpare2IsNotNull() {
			addCriterion("SPARE2 is not null");
			return this;
		}

		public Criteria andSpare2EqualTo(String value) {
			addCriterion("SPARE2 =", value, "spare2");
			return this;
		}

		public Criteria andSpare2NotEqualTo(String value) {
			addCriterion("SPARE2 <>", value, "spare2");
			return this;
		}

		public Criteria andSpare2GreaterThan(String value) {
			addCriterion("SPARE2 >", value, "spare2");
			return this;
		}

		public Criteria andSpare2GreaterThanOrEqualTo(String value) {
			addCriterion("SPARE2 >=", value, "spare2");
			return this;
		}

		public Criteria andSpare2LessThan(String value) {
			addCriterion("SPARE2 <", value, "spare2");
			return this;
		}

		public Criteria andSpare2LessThanOrEqualTo(String value) {
			addCriterion("SPARE2 <=", value, "spare2");
			return this;
		}

		public Criteria andSpare2Like(String value) {
			addCriterion("SPARE2 like", value, "spare2");
			return this;
		}

		public Criteria andSpare2NotLike(String value) {
			addCriterion("SPARE2 not like", value, "spare2");
			return this;
		}

		public Criteria andSpare2In(List<String> values) {
			addCriterion("SPARE2 in", values, "spare2");
			return this;
		}

		public Criteria andSpare2NotIn(List<String> values) {
			addCriterion("SPARE2 not in", values, "spare2");
			return this;
		}

		public Criteria andSpare2Between(String value1, String value2) {
			addCriterion("SPARE2 between", value1, value2, "spare2");
			return this;
		}

		public Criteria andSpare2NotBetween(String value1, String value2) {
			addCriterion("SPARE2 not between", value1, value2, "spare2");
			return this;
		}

		public Criteria andSpare3IsNull() {
			addCriterion("SPARE3 is null");
			return this;
		}

		public Criteria andSpare3IsNotNull() {
			addCriterion("SPARE3 is not null");
			return this;
		}

		public Criteria andSpare3EqualTo(String value) {
			addCriterion("SPARE3 =", value, "spare3");
			return this;
		}

		public Criteria andSpare3NotEqualTo(String value) {
			addCriterion("SPARE3 <>", value, "spare3");
			return this;
		}

		public Criteria andSpare3GreaterThan(String value) {
			addCriterion("SPARE3 >", value, "spare3");
			return this;
		}

		public Criteria andSpare3GreaterThanOrEqualTo(String value) {
			addCriterion("SPARE3 >=", value, "spare3");
			return this;
		}

		public Criteria andSpare3LessThan(String value) {
			addCriterion("SPARE3 <", value, "spare3");
			return this;
		}

		public Criteria andSpare3LessThanOrEqualTo(String value) {
			addCriterion("SPARE3 <=", value, "spare3");
			return this;
		}

		public Criteria andSpare3Like(String value) {
			addCriterion("SPARE3 like", value, "spare3");
			return this;
		}

		public Criteria andSpare3NotLike(String value) {
			addCriterion("SPARE3 not like", value, "spare3");
			return this;
		}

		public Criteria andSpare3In(List<String> values) {
			addCriterion("SPARE3 in", values, "spare3");
			return this;
		}

		public Criteria andSpare3NotIn(List<String> values) {
			addCriterion("SPARE3 not in", values, "spare3");
			return this;
		}

		public Criteria andSpare3Between(String value1, String value2) {
			addCriterion("SPARE3 between", value1, value2, "spare3");
			return this;
		}

		public Criteria andSpare3NotBetween(String value1, String value2) {
			addCriterion("SPARE3 not between", value1, value2, "spare3");
			return this;
		}
	}
}