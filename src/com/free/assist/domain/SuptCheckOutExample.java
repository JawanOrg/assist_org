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

public class SuptCheckOutExample extends BaseExample {
    protected String orderByClause;

    protected String beforeOrSQL;

    protected List<Criteria> oredCriteria;

    public SuptCheckOutExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptCheckOutExample(SuptCheckOutExample example) {
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
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
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

        public Criteria andSendIdIsNull() {
            addCriterion("send_id is null");
            return this;
        }

        public Criteria andSendIdIsNotNull() {
            addCriterion("send_id is not null");
            return this;
        }

        public Criteria andSendIdEqualTo(String value) {
            addCriterion("send_id =", value, "sendId");
            return this;
        }

        public Criteria andSendIdNotEqualTo(String value) {
            addCriterion("send_id <>", value, "sendId");
            return this;
        }

        public Criteria andSendIdGreaterThan(String value) {
            addCriterion("send_id >", value, "sendId");
            return this;
        }

        public Criteria andSendIdGreaterThanOrEqualTo(String value) {
            addCriterion("send_id >=", value, "sendId");
            return this;
        }

        public Criteria andSendIdLessThan(String value) {
            addCriterion("send_id <", value, "sendId");
            return this;
        }

        public Criteria andSendIdLessThanOrEqualTo(String value) {
            addCriterion("send_id <=", value, "sendId");
            return this;
        }

        public Criteria andSendIdLike(String value) {
            addCriterion("send_id like", value, "sendId");
            return this;
        }

        public Criteria andSendIdNotLike(String value) {
            addCriterion("send_id not like", value, "sendId");
            return this;
        }

        public Criteria andSendIdIn(List<String> values) {
            addCriterion("send_id in", values, "sendId");
            return this;
        }

        public Criteria andSendIdNotIn(List<String> values) {
            addCriterion("send_id not in", values, "sendId");
            return this;
        }

        public Criteria andSendIdBetween(String value1, String value2) {
            addCriterion("send_id between", value1, value2, "sendId");
            return this;
        }

        public Criteria andSendIdNotBetween(String value1, String value2) {
            addCriterion("send_id not between", value1, value2, "sendId");
            return this;
        }

        public Criteria andCimpFaceIdIsNull() {
            addCriterion("cimp_face_id is null");
            return this;
        }

        public Criteria andCimpFaceIdIsNotNull() {
            addCriterion("cimp_face_id is not null");
            return this;
        }

        public Criteria andCimpFaceIdEqualTo(String value) {
            addCriterion("cimp_face_id =", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdNotEqualTo(String value) {
            addCriterion("cimp_face_id <>", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdGreaterThan(String value) {
            addCriterion("cimp_face_id >", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("cimp_face_id >=", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdLessThan(String value) {
            addCriterion("cimp_face_id <", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdLessThanOrEqualTo(String value) {
            addCriterion("cimp_face_id <=", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdLike(String value) {
            addCriterion("cimp_face_id like", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdNotLike(String value) {
            addCriterion("cimp_face_id not like", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdIn(List<String> values) {
            addCriterion("cimp_face_id in", values, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdNotIn(List<String> values) {
            addCriterion("cimp_face_id not in", values, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdBetween(String value1, String value2) {
            addCriterion("cimp_face_id between", value1, value2, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdNotBetween(String value1, String value2) {
            addCriterion("cimp_face_id not between", value1, value2, "cimpFaceId");
            return this;
        }

        public Criteria andOutNodeIsNull() {
            addCriterion("out_node is null");
            return this;
        }

        public Criteria andOutNodeIsNotNull() {
            addCriterion("out_node is not null");
            return this;
        }

        public Criteria andOutNodeEqualTo(String value) {
            addCriterion("out_node =", value, "outNode");
            return this;
        }

        public Criteria andOutNodeNotEqualTo(String value) {
            addCriterion("out_node <>", value, "outNode");
            return this;
        }

        public Criteria andOutNodeGreaterThan(String value) {
            addCriterion("out_node >", value, "outNode");
            return this;
        }

        public Criteria andOutNodeGreaterThanOrEqualTo(String value) {
            addCriterion("out_node >=", value, "outNode");
            return this;
        }

        public Criteria andOutNodeLessThan(String value) {
            addCriterion("out_node <", value, "outNode");
            return this;
        }

        public Criteria andOutNodeLessThanOrEqualTo(String value) {
            addCriterion("out_node <=", value, "outNode");
            return this;
        }

        public Criteria andOutNodeLike(String value) {
            addCriterion("out_node like", value, "outNode");
            return this;
        }

        public Criteria andOutNodeNotLike(String value) {
            addCriterion("out_node not like", value, "outNode");
            return this;
        }

        public Criteria andOutNodeIn(List<String> values) {
            addCriterion("out_node in", values, "outNode");
            return this;
        }

        public Criteria andOutNodeNotIn(List<String> values) {
            addCriterion("out_node not in", values, "outNode");
            return this;
        }

        public Criteria andOutNodeBetween(String value1, String value2) {
            addCriterion("out_node between", value1, value2, "outNode");
            return this;
        }

        public Criteria andOutNodeNotBetween(String value1, String value2) {
            addCriterion("out_node not between", value1, value2, "outNode");
            return this;
        }

        public Criteria andOutIschidNodeIsNull() {
            addCriterion("out_ischid_node is null");
            return this;
        }

        public Criteria andOutIschidNodeIsNotNull() {
            addCriterion("out_ischid_node is not null");
            return this;
        }

        public Criteria andOutIschidNodeEqualTo(String value) {
            addCriterion("out_ischid_node =", value, "outIschidNode");
            return this;
        }

        public Criteria andOutIschidNodeNotEqualTo(String value) {
            addCriterion("out_ischid_node <>", value, "outIschidNode");
            return this;
        }

        public Criteria andOutIschidNodeGreaterThan(String value) {
            addCriterion("out_ischid_node >", value, "outIschidNode");
            return this;
        }

        public Criteria andOutIschidNodeGreaterThanOrEqualTo(String value) {
            addCriterion("out_ischid_node >=", value, "outIschidNode");
            return this;
        }

        public Criteria andOutIschidNodeLessThan(String value) {
            addCriterion("out_ischid_node <", value, "outIschidNode");
            return this;
        }

        public Criteria andOutIschidNodeLessThanOrEqualTo(String value) {
            addCriterion("out_ischid_node <=", value, "outIschidNode");
            return this;
        }

        public Criteria andOutIschidNodeLike(String value) {
            addCriterion("out_ischid_node like", value, "outIschidNode");
            return this;
        }

        public Criteria andOutIschidNodeNotLike(String value) {
            addCriterion("out_ischid_node not like", value, "outIschidNode");
            return this;
        }

        public Criteria andOutIschidNodeIn(List<String> values) {
            addCriterion("out_ischid_node in", values, "outIschidNode");
            return this;
        }

        public Criteria andOutIschidNodeNotIn(List<String> values) {
            addCriterion("out_ischid_node not in", values, "outIschidNode");
            return this;
        }

        public Criteria andOutIschidNodeBetween(String value1, String value2) {
            addCriterion("out_ischid_node between", value1, value2, "outIschidNode");
            return this;
        }

        public Criteria andOutIschidNodeNotBetween(String value1, String value2) {
            addCriterion("out_ischid_node not between", value1, value2, "outIschidNode");
            return this;
        }

        public Criteria andOutParentNodeIsNull() {
            addCriterion("out_parent_node is null");
            return this;
        }

        public Criteria andOutParentNodeIsNotNull() {
            addCriterion("out_parent_node is not null");
            return this;
        }

        public Criteria andOutParentNodeEqualTo(String value) {
            addCriterion("out_parent_node =", value, "outParentNode");
            return this;
        }

        public Criteria andOutParentNodeNotEqualTo(String value) {
            addCriterion("out_parent_node <>", value, "outParentNode");
            return this;
        }

        public Criteria andOutParentNodeGreaterThan(String value) {
            addCriterion("out_parent_node >", value, "outParentNode");
            return this;
        }

        public Criteria andOutParentNodeGreaterThanOrEqualTo(String value) {
            addCriterion("out_parent_node >=", value, "outParentNode");
            return this;
        }

        public Criteria andOutParentNodeLessThan(String value) {
            addCriterion("out_parent_node <", value, "outParentNode");
            return this;
        }

        public Criteria andOutParentNodeLessThanOrEqualTo(String value) {
            addCriterion("out_parent_node <=", value, "outParentNode");
            return this;
        }

        public Criteria andOutParentNodeLike(String value) {
            addCriterion("out_parent_node like", value, "outParentNode");
            return this;
        }

        public Criteria andOutParentNodeNotLike(String value) {
            addCriterion("out_parent_node not like", value, "outParentNode");
            return this;
        }

        public Criteria andOutParentNodeIn(List<String> values) {
            addCriterion("out_parent_node in", values, "outParentNode");
            return this;
        }

        public Criteria andOutParentNodeNotIn(List<String> values) {
            addCriterion("out_parent_node not in", values, "outParentNode");
            return this;
        }

        public Criteria andOutParentNodeBetween(String value1, String value2) {
            addCriterion("out_parent_node between", value1, value2, "outParentNode");
            return this;
        }

        public Criteria andOutParentNodeNotBetween(String value1, String value2) {
            addCriterion("out_parent_node not between", value1, value2, "outParentNode");
            return this;
        }

        public Criteria andOutChidnodeOverIsNull() {
            addCriterion("out_chidnode_over is null");
            return this;
        }

        public Criteria andOutChidnodeOverIsNotNull() {
            addCriterion("out_chidnode_over is not null");
            return this;
        }

        public Criteria andOutChidnodeOverEqualTo(String value) {
            addCriterion("out_chidnode_over =", value, "outChidnodeOver");
            return this;
        }

        public Criteria andOutChidnodeOverNotEqualTo(String value) {
            addCriterion("out_chidnode_over <>", value, "outChidnodeOver");
            return this;
        }

        public Criteria andOutChidnodeOverGreaterThan(String value) {
            addCriterion("out_chidnode_over >", value, "outChidnodeOver");
            return this;
        }

        public Criteria andOutChidnodeOverGreaterThanOrEqualTo(String value) {
            addCriterion("out_chidnode_over >=", value, "outChidnodeOver");
            return this;
        }

        public Criteria andOutChidnodeOverLessThan(String value) {
            addCriterion("out_chidnode_over <", value, "outChidnodeOver");
            return this;
        }

        public Criteria andOutChidnodeOverLessThanOrEqualTo(String value) {
            addCriterion("out_chidnode_over <=", value, "outChidnodeOver");
            return this;
        }

        public Criteria andOutChidnodeOverLike(String value) {
            addCriterion("out_chidnode_over like", value, "outChidnodeOver");
            return this;
        }

        public Criteria andOutChidnodeOverNotLike(String value) {
            addCriterion("out_chidnode_over not like", value, "outChidnodeOver");
            return this;
        }

        public Criteria andOutChidnodeOverIn(List<String> values) {
            addCriterion("out_chidnode_over in", values, "outChidnodeOver");
            return this;
        }

        public Criteria andOutChidnodeOverNotIn(List<String> values) {
            addCriterion("out_chidnode_over not in", values, "outChidnodeOver");
            return this;
        }

        public Criteria andOutChidnodeOverBetween(String value1, String value2) {
            addCriterion("out_chidnode_over between", value1, value2, "outChidnodeOver");
            return this;
        }

        public Criteria andOutChidnodeOverNotBetween(String value1, String value2) {
            addCriterion("out_chidnode_over not between", value1, value2, "outChidnodeOver");
            return this;
        }

        public Criteria andInNodeIsNull() {
            addCriterion("in_node is null");
            return this;
        }

        public Criteria andInNodeIsNotNull() {
            addCriterion("in_node is not null");
            return this;
        }

        public Criteria andInNodeEqualTo(String value) {
            addCriterion("in_node =", value, "inNode");
            return this;
        }

        public Criteria andInNodeNotEqualTo(String value) {
            addCriterion("in_node <>", value, "inNode");
            return this;
        }

        public Criteria andInNodeGreaterThan(String value) {
            addCriterion("in_node >", value, "inNode");
            return this;
        }

        public Criteria andInNodeGreaterThanOrEqualTo(String value) {
            addCriterion("in_node >=", value, "inNode");
            return this;
        }

        public Criteria andInNodeLessThan(String value) {
            addCriterion("in_node <", value, "inNode");
            return this;
        }

        public Criteria andInNodeLessThanOrEqualTo(String value) {
            addCriterion("in_node <=", value, "inNode");
            return this;
        }

        public Criteria andInNodeLike(String value) {
            addCriterion("in_node like", value, "inNode");
            return this;
        }

        public Criteria andInNodeNotLike(String value) {
            addCriterion("in_node not like", value, "inNode");
            return this;
        }

        public Criteria andInNodeIn(List<String> values) {
            addCriterion("in_node in", values, "inNode");
            return this;
        }

        public Criteria andInNodeNotIn(List<String> values) {
            addCriterion("in_node not in", values, "inNode");
            return this;
        }

        public Criteria andInNodeBetween(String value1, String value2) {
            addCriterion("in_node between", value1, value2, "inNode");
            return this;
        }

        public Criteria andInNodeNotBetween(String value1, String value2) {
            addCriterion("in_node not between", value1, value2, "inNode");
            return this;
        }

        public Criteria andMappPattIsNull() {
            addCriterion("mapp_patt is null");
            return this;
        }

        public Criteria andMappPattIsNotNull() {
            addCriterion("mapp_patt is not null");
            return this;
        }

        public Criteria andMappPattEqualTo(String value) {
            addCriterion("mapp_patt =", value, "mappPatt");
            return this;
        }

        public Criteria andMappPattNotEqualTo(String value) {
            addCriterion("mapp_patt <>", value, "mappPatt");
            return this;
        }

        public Criteria andMappPattGreaterThan(String value) {
            addCriterion("mapp_patt >", value, "mappPatt");
            return this;
        }

        public Criteria andMappPattGreaterThanOrEqualTo(String value) {
            addCriterion("mapp_patt >=", value, "mappPatt");
            return this;
        }

        public Criteria andMappPattLessThan(String value) {
            addCriterion("mapp_patt <", value, "mappPatt");
            return this;
        }

        public Criteria andMappPattLessThanOrEqualTo(String value) {
            addCriterion("mapp_patt <=", value, "mappPatt");
            return this;
        }

        public Criteria andMappPattLike(String value) {
            addCriterion("mapp_patt like", value, "mappPatt");
            return this;
        }

        public Criteria andMappPattNotLike(String value) {
            addCriterion("mapp_patt not like", value, "mappPatt");
            return this;
        }

        public Criteria andMappPattIn(List<String> values) {
            addCriterion("mapp_patt in", values, "mappPatt");
            return this;
        }

        public Criteria andMappPattNotIn(List<String> values) {
            addCriterion("mapp_patt not in", values, "mappPatt");
            return this;
        }

        public Criteria andMappPattBetween(String value1, String value2) {
            addCriterion("mapp_patt between", value1, value2, "mappPatt");
            return this;
        }

        public Criteria andMappPattNotBetween(String value1, String value2) {
            addCriterion("mapp_patt not between", value1, value2, "mappPatt");
            return this;
        }

        public Criteria andMappForDataIsNull() {
            addCriterion("mapp_for_data is null");
            return this;
        }

        public Criteria andMappForDataIsNotNull() {
            addCriterion("mapp_for_data is not null");
            return this;
        }

        public Criteria andMappForDataEqualTo(String value) {
            addCriterion("mapp_for_data =", value, "mappForData");
            return this;
        }

        public Criteria andMappForDataNotEqualTo(String value) {
            addCriterion("mapp_for_data <>", value, "mappForData");
            return this;
        }

        public Criteria andMappForDataGreaterThan(String value) {
            addCriterion("mapp_for_data >", value, "mappForData");
            return this;
        }

        public Criteria andMappForDataGreaterThanOrEqualTo(String value) {
            addCriterion("mapp_for_data >=", value, "mappForData");
            return this;
        }

        public Criteria andMappForDataLessThan(String value) {
            addCriterion("mapp_for_data <", value, "mappForData");
            return this;
        }

        public Criteria andMappForDataLessThanOrEqualTo(String value) {
            addCriterion("mapp_for_data <=", value, "mappForData");
            return this;
        }

        public Criteria andMappForDataLike(String value) {
            addCriterion("mapp_for_data like", value, "mappForData");
            return this;
        }

        public Criteria andMappForDataNotLike(String value) {
            addCriterion("mapp_for_data not like", value, "mappForData");
            return this;
        }

        public Criteria andMappForDataIn(List<String> values) {
            addCriterion("mapp_for_data in", values, "mappForData");
            return this;
        }

        public Criteria andMappForDataNotIn(List<String> values) {
            addCriterion("mapp_for_data not in", values, "mappForData");
            return this;
        }

        public Criteria andMappForDataBetween(String value1, String value2) {
            addCriterion("mapp_for_data between", value1, value2, "mappForData");
            return this;
        }

        public Criteria andMappForDataNotBetween(String value1, String value2) {
            addCriterion("mapp_for_data not between", value1, value2, "mappForData");
            return this;
        }

        public Criteria andMappForFormatIsNull() {
            addCriterion("mapp_for_format is null");
            return this;
        }

        public Criteria andMappForFormatIsNotNull() {
            addCriterion("mapp_for_format is not null");
            return this;
        }

        public Criteria andMappForFormatEqualTo(String value) {
            addCriterion("mapp_for_format =", value, "mappForFormat");
            return this;
        }

        public Criteria andMappForFormatNotEqualTo(String value) {
            addCriterion("mapp_for_format <>", value, "mappForFormat");
            return this;
        }

        public Criteria andMappForFormatGreaterThan(String value) {
            addCriterion("mapp_for_format >", value, "mappForFormat");
            return this;
        }

        public Criteria andMappForFormatGreaterThanOrEqualTo(String value) {
            addCriterion("mapp_for_format >=", value, "mappForFormat");
            return this;
        }

        public Criteria andMappForFormatLessThan(String value) {
            addCriterion("mapp_for_format <", value, "mappForFormat");
            return this;
        }

        public Criteria andMappForFormatLessThanOrEqualTo(String value) {
            addCriterion("mapp_for_format <=", value, "mappForFormat");
            return this;
        }

        public Criteria andMappForFormatLike(String value) {
            addCriterion("mapp_for_format like", value, "mappForFormat");
            return this;
        }

        public Criteria andMappForFormatNotLike(String value) {
            addCriterion("mapp_for_format not like", value, "mappForFormat");
            return this;
        }

        public Criteria andMappForFormatIn(List<String> values) {
            addCriterion("mapp_for_format in", values, "mappForFormat");
            return this;
        }

        public Criteria andMappForFormatNotIn(List<String> values) {
            addCriterion("mapp_for_format not in", values, "mappForFormat");
            return this;
        }

        public Criteria andMappForFormatBetween(String value1, String value2) {
            addCriterion("mapp_for_format between", value1, value2, "mappForFormat");
            return this;
        }

        public Criteria andMappForFormatNotBetween(String value1, String value2) {
            addCriterion("mapp_for_format not between", value1, value2, "mappForFormat");
            return this;
        }

        public Criteria andMappAftDataIsNull() {
            addCriterion("mapp_aft_data is null");
            return this;
        }

        public Criteria andMappAftDataIsNotNull() {
            addCriterion("mapp_aft_data is not null");
            return this;
        }

        public Criteria andMappAftDataEqualTo(String value) {
            addCriterion("mapp_aft_data =", value, "mappAftData");
            return this;
        }

        public Criteria andMappAftDataNotEqualTo(String value) {
            addCriterion("mapp_aft_data <>", value, "mappAftData");
            return this;
        }

        public Criteria andMappAftDataGreaterThan(String value) {
            addCriterion("mapp_aft_data >", value, "mappAftData");
            return this;
        }

        public Criteria andMappAftDataGreaterThanOrEqualTo(String value) {
            addCriterion("mapp_aft_data >=", value, "mappAftData");
            return this;
        }

        public Criteria andMappAftDataLessThan(String value) {
            addCriterion("mapp_aft_data <", value, "mappAftData");
            return this;
        }

        public Criteria andMappAftDataLessThanOrEqualTo(String value) {
            addCriterion("mapp_aft_data <=", value, "mappAftData");
            return this;
        }

        public Criteria andMappAftDataLike(String value) {
            addCriterion("mapp_aft_data like", value, "mappAftData");
            return this;
        }

        public Criteria andMappAftDataNotLike(String value) {
            addCriterion("mapp_aft_data not like", value, "mappAftData");
            return this;
        }

        public Criteria andMappAftDataIn(List<String> values) {
            addCriterion("mapp_aft_data in", values, "mappAftData");
            return this;
        }

        public Criteria andMappAftDataNotIn(List<String> values) {
            addCriterion("mapp_aft_data not in", values, "mappAftData");
            return this;
        }

        public Criteria andMappAftDataBetween(String value1, String value2) {
            addCriterion("mapp_aft_data between", value1, value2, "mappAftData");
            return this;
        }

        public Criteria andMappAftDataNotBetween(String value1, String value2) {
            addCriterion("mapp_aft_data not between", value1, value2, "mappAftData");
            return this;
        }

        public Criteria andMappAftFormatIsNull() {
            addCriterion("mapp_aft_format is null");
            return this;
        }

        public Criteria andMappAftFormatIsNotNull() {
            addCriterion("mapp_aft_format is not null");
            return this;
        }

        public Criteria andMappAftFormatEqualTo(String value) {
            addCriterion("mapp_aft_format =", value, "mappAftFormat");
            return this;
        }

        public Criteria andMappAftFormatNotEqualTo(String value) {
            addCriterion("mapp_aft_format <>", value, "mappAftFormat");
            return this;
        }

        public Criteria andMappAftFormatGreaterThan(String value) {
            addCriterion("mapp_aft_format >", value, "mappAftFormat");
            return this;
        }

        public Criteria andMappAftFormatGreaterThanOrEqualTo(String value) {
            addCriterion("mapp_aft_format >=", value, "mappAftFormat");
            return this;
        }

        public Criteria andMappAftFormatLessThan(String value) {
            addCriterion("mapp_aft_format <", value, "mappAftFormat");
            return this;
        }

        public Criteria andMappAftFormatLessThanOrEqualTo(String value) {
            addCriterion("mapp_aft_format <=", value, "mappAftFormat");
            return this;
        }

        public Criteria andMappAftFormatLike(String value) {
            addCriterion("mapp_aft_format like", value, "mappAftFormat");
            return this;
        }

        public Criteria andMappAftFormatNotLike(String value) {
            addCriterion("mapp_aft_format not like", value, "mappAftFormat");
            return this;
        }

        public Criteria andMappAftFormatIn(List<String> values) {
            addCriterion("mapp_aft_format in", values, "mappAftFormat");
            return this;
        }

        public Criteria andMappAftFormatNotIn(List<String> values) {
            addCriterion("mapp_aft_format not in", values, "mappAftFormat");
            return this;
        }

        public Criteria andMappAftFormatBetween(String value1, String value2) {
            addCriterion("mapp_aft_format between", value1, value2, "mappAftFormat");
            return this;
        }

        public Criteria andMappAftFormatNotBetween(String value1, String value2) {
            addCriterion("mapp_aft_format not between", value1, value2, "mappAftFormat");
            return this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return this;
        }

        public Criteria andOrderIdEqualTo(Float value) {
            addCriterion("order_id =", value, "orderId");
            return this;
        }

        public Criteria andOrderIdNotEqualTo(Float value) {
            addCriterion("order_id <>", value, "orderId");
            return this;
        }

        public Criteria andOrderIdGreaterThan(Float value) {
            addCriterion("order_id >", value, "orderId");
            return this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Float value) {
            addCriterion("order_id >=", value, "orderId");
            return this;
        }

        public Criteria andOrderIdLessThan(Float value) {
            addCriterion("order_id <", value, "orderId");
            return this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Float value) {
            addCriterion("order_id <=", value, "orderId");
            return this;
        }

        public Criteria andOrderIdIn(List<Float> values) {
            addCriterion("order_id in", values, "orderId");
            return this;
        }

        public Criteria andOrderIdNotIn(List<Float> values) {
            addCriterion("order_id not in", values, "orderId");
            return this;
        }

        public Criteria andOrderIdBetween(Float value1, Float value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return this;
        }

        public Criteria andOrderIdNotBetween(Float value1, Float value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return this;
        }

        public Criteria andJoinNameIsNull() {
            addCriterion("join_name is null");
            return this;
        }

        public Criteria andJoinNameIsNotNull() {
            addCriterion("join_name is not null");
            return this;
        }

        public Criteria andJoinNameEqualTo(String value) {
            addCriterion("join_name =", value, "joinName");
            return this;
        }

        public Criteria andJoinNameNotEqualTo(String value) {
            addCriterion("join_name <>", value, "joinName");
            return this;
        }

        public Criteria andJoinNameGreaterThan(String value) {
            addCriterion("join_name >", value, "joinName");
            return this;
        }

        public Criteria andJoinNameGreaterThanOrEqualTo(String value) {
            addCriterion("join_name >=", value, "joinName");
            return this;
        }

        public Criteria andJoinNameLessThan(String value) {
            addCriterion("join_name <", value, "joinName");
            return this;
        }

        public Criteria andJoinNameLessThanOrEqualTo(String value) {
            addCriterion("join_name <=", value, "joinName");
            return this;
        }

        public Criteria andJoinNameLike(String value) {
            addCriterion("join_name like", value, "joinName");
            return this;
        }

        public Criteria andJoinNameNotLike(String value) {
            addCriterion("join_name not like", value, "joinName");
            return this;
        }

        public Criteria andJoinNameIn(List<String> values) {
            addCriterion("join_name in", values, "joinName");
            return this;
        }

        public Criteria andJoinNameNotIn(List<String> values) {
            addCriterion("join_name not in", values, "joinName");
            return this;
        }

        public Criteria andJoinNameBetween(String value1, String value2) {
            addCriterion("join_name between", value1, value2, "joinName");
            return this;
        }

        public Criteria andJoinNameNotBetween(String value1, String value2) {
            addCriterion("join_name not between", value1, value2, "joinName");
            return this;
        }

        public Criteria andJoinEnableIsNull() {
            addCriterion("JOIN_ENABLE is null");
            return this;
        }

        public Criteria andJoinEnableIsNotNull() {
            addCriterion("JOIN_ENABLE is not null");
            return this;
        }

        public Criteria andJoinEnableEqualTo(String value) {
            addCriterion("JOIN_ENABLE =", value, "joinEnable");
            return this;
        }

        public Criteria andJoinEnableNotEqualTo(String value) {
            addCriterion("JOIN_ENABLE <>", value, "joinEnable");
            return this;
        }

        public Criteria andJoinEnableGreaterThan(String value) {
            addCriterion("JOIN_ENABLE >", value, "joinEnable");
            return this;
        }

        public Criteria andJoinEnableGreaterThanOrEqualTo(String value) {
            addCriterion("JOIN_ENABLE >=", value, "joinEnable");
            return this;
        }

        public Criteria andJoinEnableLessThan(String value) {
            addCriterion("JOIN_ENABLE <", value, "joinEnable");
            return this;
        }

        public Criteria andJoinEnableLessThanOrEqualTo(String value) {
            addCriterion("JOIN_ENABLE <=", value, "joinEnable");
            return this;
        }

        public Criteria andJoinEnableLike(String value) {
            addCriterion("JOIN_ENABLE like", value, "joinEnable");
            return this;
        }

        public Criteria andJoinEnableNotLike(String value) {
            addCriterion("JOIN_ENABLE not like", value, "joinEnable");
            return this;
        }

        public Criteria andJoinEnableIn(List<String> values) {
            addCriterion("JOIN_ENABLE in", values, "joinEnable");
            return this;
        }

        public Criteria andJoinEnableNotIn(List<String> values) {
            addCriterion("JOIN_ENABLE not in", values, "joinEnable");
            return this;
        }

        public Criteria andJoinEnableBetween(String value1, String value2) {
            addCriterion("JOIN_ENABLE between", value1, value2, "joinEnable");
            return this;
        }

        public Criteria andJoinEnableNotBetween(String value1, String value2) {
            addCriterion("JOIN_ENABLE not between", value1, value2, "joinEnable");
            return this;
        }

        public Criteria andDepenNodeIsNull() {
            addCriterion("depen_node is null");
            return this;
        }

        public Criteria andDepenNodeIsNotNull() {
            addCriterion("depen_node is not null");
            return this;
        }

        public Criteria andDepenNodeEqualTo(String value) {
            addCriterion("depen_node =", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeNotEqualTo(String value) {
            addCriterion("depen_node <>", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeGreaterThan(String value) {
            addCriterion("depen_node >", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeGreaterThanOrEqualTo(String value) {
            addCriterion("depen_node >=", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeLessThan(String value) {
            addCriterion("depen_node <", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeLessThanOrEqualTo(String value) {
            addCriterion("depen_node <=", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeLike(String value) {
            addCriterion("depen_node like", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeNotLike(String value) {
            addCriterion("depen_node not like", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeIn(List<String> values) {
            addCriterion("depen_node in", values, "depenNode");
            return this;
        }

        public Criteria andDepenNodeNotIn(List<String> values) {
            addCriterion("depen_node not in", values, "depenNode");
            return this;
        }

        public Criteria andDepenNodeBetween(String value1, String value2) {
            addCriterion("depen_node between", value1, value2, "depenNode");
            return this;
        }

        public Criteria andDepenNodeNotBetween(String value1, String value2) {
            addCriterion("depen_node not between", value1, value2, "depenNode");
            return this;
        }

        public Criteria andDepenKeyIsNull() {
            addCriterion("depen_key is null");
            return this;
        }

        public Criteria andDepenKeyIsNotNull() {
            addCriterion("depen_key is not null");
            return this;
        }

        public Criteria andDepenKeyEqualTo(String value) {
            addCriterion("depen_key =", value, "depenKey");
            return this;
        }

        public Criteria andDepenKeyNotEqualTo(String value) {
            addCriterion("depen_key <>", value, "depenKey");
            return this;
        }

        public Criteria andDepenKeyGreaterThan(String value) {
            addCriterion("depen_key >", value, "depenKey");
            return this;
        }

        public Criteria andDepenKeyGreaterThanOrEqualTo(String value) {
            addCriterion("depen_key >=", value, "depenKey");
            return this;
        }

        public Criteria andDepenKeyLessThan(String value) {
            addCriterion("depen_key <", value, "depenKey");
            return this;
        }

        public Criteria andDepenKeyLessThanOrEqualTo(String value) {
            addCriterion("depen_key <=", value, "depenKey");
            return this;
        }

        public Criteria andDepenKeyLike(String value) {
            addCriterion("depen_key like", value, "depenKey");
            return this;
        }

        public Criteria andDepenKeyNotLike(String value) {
            addCriterion("depen_key not like", value, "depenKey");
            return this;
        }

        public Criteria andDepenKeyIn(List<String> values) {
            addCriterion("depen_key in", values, "depenKey");
            return this;
        }

        public Criteria andDepenKeyNotIn(List<String> values) {
            addCriterion("depen_key not in", values, "depenKey");
            return this;
        }

        public Criteria andDepenKeyBetween(String value1, String value2) {
            addCriterion("depen_key between", value1, value2, "depenKey");
            return this;
        }

        public Criteria andDepenKeyNotBetween(String value1, String value2) {
            addCriterion("depen_key not between", value1, value2, "depenKey");
            return this;
        }

        public Criteria andIsSimpsysIsNull() {
            addCriterion("is_simpsys is null");
            return this;
        }

        public Criteria andIsSimpsysIsNotNull() {
            addCriterion("is_simpsys is not null");
            return this;
        }

        public Criteria andIsSimpsysEqualTo(String value) {
            addCriterion("is_simpsys =", value, "isSimpsys");
            return this;
        }

        public Criteria andIsSimpsysNotEqualTo(String value) {
            addCriterion("is_simpsys <>", value, "isSimpsys");
            return this;
        }

        public Criteria andIsSimpsysGreaterThan(String value) {
            addCriterion("is_simpsys >", value, "isSimpsys");
            return this;
        }

        public Criteria andIsSimpsysGreaterThanOrEqualTo(String value) {
            addCriterion("is_simpsys >=", value, "isSimpsys");
            return this;
        }

        public Criteria andIsSimpsysLessThan(String value) {
            addCriterion("is_simpsys <", value, "isSimpsys");
            return this;
        }

        public Criteria andIsSimpsysLessThanOrEqualTo(String value) {
            addCriterion("is_simpsys <=", value, "isSimpsys");
            return this;
        }

        public Criteria andIsSimpsysLike(String value) {
            addCriterion("is_simpsys like", value, "isSimpsys");
            return this;
        }

        public Criteria andIsSimpsysNotLike(String value) {
            addCriterion("is_simpsys not like", value, "isSimpsys");
            return this;
        }

        public Criteria andIsSimpsysIn(List<String> values) {
            addCriterion("is_simpsys in", values, "isSimpsys");
            return this;
        }

        public Criteria andIsSimpsysNotIn(List<String> values) {
            addCriterion("is_simpsys not in", values, "isSimpsys");
            return this;
        }

        public Criteria andIsSimpsysBetween(String value1, String value2) {
            addCriterion("is_simpsys between", value1, value2, "isSimpsys");
            return this;
        }

        public Criteria andIsSimpsysNotBetween(String value1, String value2) {
            addCriterion("is_simpsys not between", value1, value2, "isSimpsys");
            return this;
        }

        public Criteria andDeclareSnIsNull() {
            addCriterion("declare_sn is null");
            return this;
        }

        public Criteria andDeclareSnIsNotNull() {
            addCriterion("declare_sn is not null");
            return this;
        }

        public Criteria andDeclareSnEqualTo(String value) {
            addCriterion("declare_sn =", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnNotEqualTo(String value) {
            addCriterion("declare_sn <>", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnGreaterThan(String value) {
            addCriterion("declare_sn >", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnGreaterThanOrEqualTo(String value) {
            addCriterion("declare_sn >=", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnLessThan(String value) {
            addCriterion("declare_sn <", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnLessThanOrEqualTo(String value) {
            addCriterion("declare_sn <=", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnLike(String value) {
            addCriterion("declare_sn like", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnNotLike(String value) {
            addCriterion("declare_sn not like", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnIn(List<String> values) {
            addCriterion("declare_sn in", values, "declareSn");
            return this;
        }

        public Criteria andDeclareSnNotIn(List<String> values) {
            addCriterion("declare_sn not in", values, "declareSn");
            return this;
        }

        public Criteria andDeclareSnBetween(String value1, String value2) {
            addCriterion("declare_sn between", value1, value2, "declareSn");
            return this;
        }

        public Criteria andDeclareSnNotBetween(String value1, String value2) {
            addCriterion("declare_sn not between", value1, value2, "declareSn");
            return this;
        }

        public Criteria andIsDoubuxmlIsNull() {
            addCriterion("is_doubuxml is null");
            return this;
        }

        public Criteria andIsDoubuxmlIsNotNull() {
            addCriterion("is_doubuxml is not null");
            return this;
        }

        public Criteria andIsDoubuxmlEqualTo(String value) {
            addCriterion("is_doubuxml =", value, "isDoubuxml");
            return this;
        }

        public Criteria andIsDoubuxmlNotEqualTo(String value) {
            addCriterion("is_doubuxml <>", value, "isDoubuxml");
            return this;
        }

        public Criteria andIsDoubuxmlGreaterThan(String value) {
            addCriterion("is_doubuxml >", value, "isDoubuxml");
            return this;
        }

        public Criteria andIsDoubuxmlGreaterThanOrEqualTo(String value) {
            addCriterion("is_doubuxml >=", value, "isDoubuxml");
            return this;
        }

        public Criteria andIsDoubuxmlLessThan(String value) {
            addCriterion("is_doubuxml <", value, "isDoubuxml");
            return this;
        }

        public Criteria andIsDoubuxmlLessThanOrEqualTo(String value) {
            addCriterion("is_doubuxml <=", value, "isDoubuxml");
            return this;
        }

        public Criteria andIsDoubuxmlLike(String value) {
            addCriterion("is_doubuxml like", value, "isDoubuxml");
            return this;
        }

        public Criteria andIsDoubuxmlNotLike(String value) {
            addCriterion("is_doubuxml not like", value, "isDoubuxml");
            return this;
        }

        public Criteria andIsDoubuxmlIn(List<String> values) {
            addCriterion("is_doubuxml in", values, "isDoubuxml");
            return this;
        }

        public Criteria andIsDoubuxmlNotIn(List<String> values) {
            addCriterion("is_doubuxml not in", values, "isDoubuxml");
            return this;
        }

        public Criteria andIsDoubuxmlBetween(String value1, String value2) {
            addCriterion("is_doubuxml between", value1, value2, "isDoubuxml");
            return this;
        }

        public Criteria andIsDoubuxmlNotBetween(String value1, String value2) {
            addCriterion("is_doubuxml not between", value1, value2, "isDoubuxml");
            return this;
        }

        public Criteria andDoubuNumIsNull() {
            addCriterion("doubu_num is null");
            return this;
        }

        public Criteria andDoubuNumIsNotNull() {
            addCriterion("doubu_num is not null");
            return this;
        }

        public Criteria andDoubuNumEqualTo(String value) {
            addCriterion("doubu_num =", value, "doubuNum");
            return this;
        }

        public Criteria andDoubuNumNotEqualTo(String value) {
            addCriterion("doubu_num <>", value, "doubuNum");
            return this;
        }

        public Criteria andDoubuNumGreaterThan(String value) {
            addCriterion("doubu_num >", value, "doubuNum");
            return this;
        }

        public Criteria andDoubuNumGreaterThanOrEqualTo(String value) {
            addCriterion("doubu_num >=", value, "doubuNum");
            return this;
        }

        public Criteria andDoubuNumLessThan(String value) {
            addCriterion("doubu_num <", value, "doubuNum");
            return this;
        }

        public Criteria andDoubuNumLessThanOrEqualTo(String value) {
            addCriterion("doubu_num <=", value, "doubuNum");
            return this;
        }

        public Criteria andDoubuNumLike(String value) {
            addCriterion("doubu_num like", value, "doubuNum");
            return this;
        }

        public Criteria andDoubuNumNotLike(String value) {
            addCriterion("doubu_num not like", value, "doubuNum");
            return this;
        }

        public Criteria andDoubuNumIn(List<String> values) {
            addCriterion("doubu_num in", values, "doubuNum");
            return this;
        }

        public Criteria andDoubuNumNotIn(List<String> values) {
            addCriterion("doubu_num not in", values, "doubuNum");
            return this;
        }

        public Criteria andDoubuNumBetween(String value1, String value2) {
            addCriterion("doubu_num between", value1, value2, "doubuNum");
            return this;
        }

        public Criteria andDoubuNumNotBetween(String value1, String value2) {
            addCriterion("doubu_num not between", value1, value2, "doubuNum");
            return this;
        }

        public Criteria andDoubuParIsNull() {
            addCriterion("doubu_par is null");
            return this;
        }

        public Criteria andDoubuParIsNotNull() {
            addCriterion("doubu_par is not null");
            return this;
        }

        public Criteria andDoubuParEqualTo(String value) {
            addCriterion("doubu_par =", value, "doubuPar");
            return this;
        }

        public Criteria andDoubuParNotEqualTo(String value) {
            addCriterion("doubu_par <>", value, "doubuPar");
            return this;
        }

        public Criteria andDoubuParGreaterThan(String value) {
            addCriterion("doubu_par >", value, "doubuPar");
            return this;
        }

        public Criteria andDoubuParGreaterThanOrEqualTo(String value) {
            addCriterion("doubu_par >=", value, "doubuPar");
            return this;
        }

        public Criteria andDoubuParLessThan(String value) {
            addCriterion("doubu_par <", value, "doubuPar");
            return this;
        }

        public Criteria andDoubuParLessThanOrEqualTo(String value) {
            addCriterion("doubu_par <=", value, "doubuPar");
            return this;
        }

        public Criteria andDoubuParLike(String value) {
            addCriterion("doubu_par like", value, "doubuPar");
            return this;
        }

        public Criteria andDoubuParNotLike(String value) {
            addCriterion("doubu_par not like", value, "doubuPar");
            return this;
        }

        public Criteria andDoubuParIn(List<String> values) {
            addCriterion("doubu_par in", values, "doubuPar");
            return this;
        }

        public Criteria andDoubuParNotIn(List<String> values) {
            addCriterion("doubu_par not in", values, "doubuPar");
            return this;
        }

        public Criteria andDoubuParBetween(String value1, String value2) {
            addCriterion("doubu_par between", value1, value2, "doubuPar");
            return this;
        }

        public Criteria andDoubuParNotBetween(String value1, String value2) {
            addCriterion("doubu_par not between", value1, value2, "doubuPar");
            return this;
        }

        public Criteria andDoubuChiIsNull() {
            addCriterion("doubu_chi is null");
            return this;
        }

        public Criteria andDoubuChiIsNotNull() {
            addCriterion("doubu_chi is not null");
            return this;
        }

        public Criteria andDoubuChiEqualTo(String value) {
            addCriterion("doubu_chi =", value, "doubuChi");
            return this;
        }

        public Criteria andDoubuChiNotEqualTo(String value) {
            addCriterion("doubu_chi <>", value, "doubuChi");
            return this;
        }

        public Criteria andDoubuChiGreaterThan(String value) {
            addCriterion("doubu_chi >", value, "doubuChi");
            return this;
        }

        public Criteria andDoubuChiGreaterThanOrEqualTo(String value) {
            addCriterion("doubu_chi >=", value, "doubuChi");
            return this;
        }

        public Criteria andDoubuChiLessThan(String value) {
            addCriterion("doubu_chi <", value, "doubuChi");
            return this;
        }

        public Criteria andDoubuChiLessThanOrEqualTo(String value) {
            addCriterion("doubu_chi <=", value, "doubuChi");
            return this;
        }

        public Criteria andDoubuChiLike(String value) {
            addCriterion("doubu_chi like", value, "doubuChi");
            return this;
        }

        public Criteria andDoubuChiNotLike(String value) {
            addCriterion("doubu_chi not like", value, "doubuChi");
            return this;
        }

        public Criteria andDoubuChiIn(List<String> values) {
            addCriterion("doubu_chi in", values, "doubuChi");
            return this;
        }

        public Criteria andDoubuChiNotIn(List<String> values) {
            addCriterion("doubu_chi not in", values, "doubuChi");
            return this;
        }

        public Criteria andDoubuChiBetween(String value1, String value2) {
            addCriterion("doubu_chi between", value1, value2, "doubuChi");
            return this;
        }

        public Criteria andDoubuChiNotBetween(String value1, String value2) {
            addCriterion("doubu_chi not between", value1, value2, "doubuChi");
            return this;
        }

        public Criteria andMappingSnIsNull() {
            addCriterion("mapping_sn is null");
            return this;
        }

        public Criteria andMappingSnIsNotNull() {
            addCriterion("mapping_sn is not null");
            return this;
        }

        public Criteria andMappingSnEqualTo(String value) {
            addCriterion("mapping_sn =", value, "mappingSn");
            return this;
        }

        public Criteria andMappingSnNotEqualTo(String value) {
            addCriterion("mapping_sn <>", value, "mappingSn");
            return this;
        }

        public Criteria andMappingSnGreaterThan(String value) {
            addCriterion("mapping_sn >", value, "mappingSn");
            return this;
        }

        public Criteria andMappingSnGreaterThanOrEqualTo(String value) {
            addCriterion("mapping_sn >=", value, "mappingSn");
            return this;
        }

        public Criteria andMappingSnLessThan(String value) {
            addCriterion("mapping_sn <", value, "mappingSn");
            return this;
        }

        public Criteria andMappingSnLessThanOrEqualTo(String value) {
            addCriterion("mapping_sn <=", value, "mappingSn");
            return this;
        }

        public Criteria andMappingSnLike(String value) {
            addCriterion("mapping_sn like", value, "mappingSn");
            return this;
        }

        public Criteria andMappingSnNotLike(String value) {
            addCriterion("mapping_sn not like", value, "mappingSn");
            return this;
        }

        public Criteria andMappingSnIn(List<String> values) {
            addCriterion("mapping_sn in", values, "mappingSn");
            return this;
        }

        public Criteria andMappingSnNotIn(List<String> values) {
            addCriterion("mapping_sn not in", values, "mappingSn");
            return this;
        }

        public Criteria andMappingSnBetween(String value1, String value2) {
            addCriterion("mapping_sn between", value1, value2, "mappingSn");
            return this;
        }

        public Criteria andMappingSnNotBetween(String value1, String value2) {
            addCriterion("mapping_sn not between", value1, value2, "mappingSn");
            return this;
        }

        public Criteria andAppendCharsIsNull() {
            addCriterion("APPEND_CHARS is null");
            return this;
        }

        public Criteria andAppendCharsIsNotNull() {
            addCriterion("APPEND_CHARS is not null");
            return this;
        }

        public Criteria andAppendCharsEqualTo(String value) {
            addCriterion("APPEND_CHARS =", value, "appendChars");
            return this;
        }

        public Criteria andAppendCharsNotEqualTo(String value) {
            addCriterion("APPEND_CHARS <>", value, "appendChars");
            return this;
        }

        public Criteria andAppendCharsGreaterThan(String value) {
            addCriterion("APPEND_CHARS >", value, "appendChars");
            return this;
        }

        public Criteria andAppendCharsGreaterThanOrEqualTo(String value) {
            addCriterion("APPEND_CHARS >=", value, "appendChars");
            return this;
        }

        public Criteria andAppendCharsLessThan(String value) {
            addCriterion("APPEND_CHARS <", value, "appendChars");
            return this;
        }

        public Criteria andAppendCharsLessThanOrEqualTo(String value) {
            addCriterion("APPEND_CHARS <=", value, "appendChars");
            return this;
        }

        public Criteria andAppendCharsLike(String value) {
            addCriterion("APPEND_CHARS like", value, "appendChars");
            return this;
        }

        public Criteria andAppendCharsNotLike(String value) {
            addCriterion("APPEND_CHARS not like", value, "appendChars");
            return this;
        }

        public Criteria andAppendCharsIn(List<String> values) {
            addCriterion("APPEND_CHARS in", values, "appendChars");
            return this;
        }

        public Criteria andAppendCharsNotIn(List<String> values) {
            addCriterion("APPEND_CHARS not in", values, "appendChars");
            return this;
        }

        public Criteria andAppendCharsBetween(String value1, String value2) {
            addCriterion("APPEND_CHARS between", value1, value2, "appendChars");
            return this;
        }

        public Criteria andAppendCharsNotBetween(String value1, String value2) {
            addCriterion("APPEND_CHARS not between", value1, value2, "appendChars");
            return this;
        }

        public Criteria andAppendNodesIsNull() {
            addCriterion("APPEND_NODES is null");
            return this;
        }

        public Criteria andAppendNodesIsNotNull() {
            addCriterion("APPEND_NODES is not null");
            return this;
        }

        public Criteria andAppendNodesEqualTo(String value) {
            addCriterion("APPEND_NODES =", value, "appendNodes");
            return this;
        }

        public Criteria andAppendNodesNotEqualTo(String value) {
            addCriterion("APPEND_NODES <>", value, "appendNodes");
            return this;
        }

        public Criteria andAppendNodesGreaterThan(String value) {
            addCriterion("APPEND_NODES >", value, "appendNodes");
            return this;
        }

        public Criteria andAppendNodesGreaterThanOrEqualTo(String value) {
            addCriterion("APPEND_NODES >=", value, "appendNodes");
            return this;
        }

        public Criteria andAppendNodesLessThan(String value) {
            addCriterion("APPEND_NODES <", value, "appendNodes");
            return this;
        }

        public Criteria andAppendNodesLessThanOrEqualTo(String value) {
            addCriterion("APPEND_NODES <=", value, "appendNodes");
            return this;
        }

        public Criteria andAppendNodesLike(String value) {
            addCriterion("APPEND_NODES like", value, "appendNodes");
            return this;
        }

        public Criteria andAppendNodesNotLike(String value) {
            addCriterion("APPEND_NODES not like", value, "appendNodes");
            return this;
        }

        public Criteria andAppendNodesIn(List<String> values) {
            addCriterion("APPEND_NODES in", values, "appendNodes");
            return this;
        }

        public Criteria andAppendNodesNotIn(List<String> values) {
            addCriterion("APPEND_NODES not in", values, "appendNodes");
            return this;
        }

        public Criteria andAppendNodesBetween(String value1, String value2) {
            addCriterion("APPEND_NODES between", value1, value2, "appendNodes");
            return this;
        }

        public Criteria andAppendNodesNotBetween(String value1, String value2) {
            addCriterion("APPEND_NODES not between", value1, value2, "appendNodes");
            return this;
        }

        public Criteria andIgnoreAbsentIsNull() {
            addCriterion("IGNORE_ABSENT is null");
            return this;
        }

        public Criteria andIgnoreAbsentIsNotNull() {
            addCriterion("IGNORE_ABSENT is not null");
            return this;
        }

        public Criteria andIgnoreAbsentEqualTo(String value) {
            addCriterion("IGNORE_ABSENT =", value, "ignoreAbsent");
            return this;
        }

        public Criteria andIgnoreAbsentNotEqualTo(String value) {
            addCriterion("IGNORE_ABSENT <>", value, "ignoreAbsent");
            return this;
        }

        public Criteria andIgnoreAbsentGreaterThan(String value) {
            addCriterion("IGNORE_ABSENT >", value, "ignoreAbsent");
            return this;
        }

        public Criteria andIgnoreAbsentGreaterThanOrEqualTo(String value) {
            addCriterion("IGNORE_ABSENT >=", value, "ignoreAbsent");
            return this;
        }

        public Criteria andIgnoreAbsentLessThan(String value) {
            addCriterion("IGNORE_ABSENT <", value, "ignoreAbsent");
            return this;
        }

        public Criteria andIgnoreAbsentLessThanOrEqualTo(String value) {
            addCriterion("IGNORE_ABSENT <=", value, "ignoreAbsent");
            return this;
        }

        public Criteria andIgnoreAbsentLike(String value) {
            addCriterion("IGNORE_ABSENT like", value, "ignoreAbsent");
            return this;
        }

        public Criteria andIgnoreAbsentNotLike(String value) {
            addCriterion("IGNORE_ABSENT not like", value, "ignoreAbsent");
            return this;
        }

        public Criteria andIgnoreAbsentIn(List<String> values) {
            addCriterion("IGNORE_ABSENT in", values, "ignoreAbsent");
            return this;
        }

        public Criteria andIgnoreAbsentNotIn(List<String> values) {
            addCriterion("IGNORE_ABSENT not in", values, "ignoreAbsent");
            return this;
        }

        public Criteria andIgnoreAbsentBetween(String value1, String value2) {
            addCriterion("IGNORE_ABSENT between", value1, value2, "ignoreAbsent");
            return this;
        }

        public Criteria andIgnoreAbsentNotBetween(String value1, String value2) {
            addCriterion("IGNORE_ABSENT not between", value1, value2, "ignoreAbsent");
            return this;
        }

        public Criteria andServerIdIsNull() {
            addCriterion("SERVER_ID is null");
            return this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("SERVER_ID is not null");
            return this;
        }

        public Criteria andServerIdEqualTo(String value) {
            addCriterion("SERVER_ID =", value, "serverId");
            return this;
        }

        public Criteria andServerIdNotEqualTo(String value) {
            addCriterion("SERVER_ID <>", value, "serverId");
            return this;
        }

        public Criteria andServerIdGreaterThan(String value) {
            addCriterion("SERVER_ID >", value, "serverId");
            return this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_ID >=", value, "serverId");
            return this;
        }

        public Criteria andServerIdLessThan(String value) {
            addCriterion("SERVER_ID <", value, "serverId");
            return this;
        }

        public Criteria andServerIdLessThanOrEqualTo(String value) {
            addCriterion("SERVER_ID <=", value, "serverId");
            return this;
        }

        public Criteria andServerIdLike(String value) {
            addCriterion("SERVER_ID like", value, "serverId");
            return this;
        }

        public Criteria andServerIdNotLike(String value) {
            addCriterion("SERVER_ID not like", value, "serverId");
            return this;
        }

        public Criteria andServerIdIn(List<String> values) {
            addCriterion("SERVER_ID in", values, "serverId");
            return this;
        }

        public Criteria andServerIdNotIn(List<String> values) {
            addCriterion("SERVER_ID not in", values, "serverId");
            return this;
        }

        public Criteria andServerIdBetween(String value1, String value2) {
            addCriterion("SERVER_ID between", value1, value2, "serverId");
            return this;
        }

        public Criteria andServerIdNotBetween(String value1, String value2) {
            addCriterion("SERVER_ID not between", value1, value2, "serverId");
            return this;
        }

        public Criteria andPathIndicatorIsNull() {
            addCriterion("PATH_INDICATOR is null");
            return this;
        }

        public Criteria andPathIndicatorIsNotNull() {
            addCriterion("PATH_INDICATOR is not null");
            return this;
        }

        public Criteria andPathIndicatorEqualTo(String value) {
            addCriterion("PATH_INDICATOR =", value, "pathIndicator");
            return this;
        }

        public Criteria andPathIndicatorNotEqualTo(String value) {
            addCriterion("PATH_INDICATOR <>", value, "pathIndicator");
            return this;
        }

        public Criteria andPathIndicatorGreaterThan(String value) {
            addCriterion("PATH_INDICATOR >", value, "pathIndicator");
            return this;
        }

        public Criteria andPathIndicatorGreaterThanOrEqualTo(String value) {
            addCriterion("PATH_INDICATOR >=", value, "pathIndicator");
            return this;
        }

        public Criteria andPathIndicatorLessThan(String value) {
            addCriterion("PATH_INDICATOR <", value, "pathIndicator");
            return this;
        }

        public Criteria andPathIndicatorLessThanOrEqualTo(String value) {
            addCriterion("PATH_INDICATOR <=", value, "pathIndicator");
            return this;
        }

        public Criteria andPathIndicatorLike(String value) {
            addCriterion("PATH_INDICATOR like", value, "pathIndicator");
            return this;
        }

        public Criteria andPathIndicatorNotLike(String value) {
            addCriterion("PATH_INDICATOR not like", value, "pathIndicator");
            return this;
        }

        public Criteria andPathIndicatorIn(List<String> values) {
            addCriterion("PATH_INDICATOR in", values, "pathIndicator");
            return this;
        }

        public Criteria andPathIndicatorNotIn(List<String> values) {
            addCriterion("PATH_INDICATOR not in", values, "pathIndicator");
            return this;
        }

        public Criteria andPathIndicatorBetween(String value1, String value2) {
            addCriterion("PATH_INDICATOR between", value1, value2, "pathIndicator");
            return this;
        }

        public Criteria andPathIndicatorNotBetween(String value1, String value2) {
            addCriterion("PATH_INDICATOR not between", value1, value2, "pathIndicator");
            return this;
        }

        public Criteria andAttachHomeIsNull() {
            addCriterion("ATTACH_HOME is null");
            return this;
        }

        public Criteria andAttachHomeIsNotNull() {
            addCriterion("ATTACH_HOME is not null");
            return this;
        }

        public Criteria andAttachHomeEqualTo(String value) {
            addCriterion("ATTACH_HOME =", value, "attachHome");
            return this;
        }

        public Criteria andAttachHomeNotEqualTo(String value) {
            addCriterion("ATTACH_HOME <>", value, "attachHome");
            return this;
        }

        public Criteria andAttachHomeGreaterThan(String value) {
            addCriterion("ATTACH_HOME >", value, "attachHome");
            return this;
        }

        public Criteria andAttachHomeGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACH_HOME >=", value, "attachHome");
            return this;
        }

        public Criteria andAttachHomeLessThan(String value) {
            addCriterion("ATTACH_HOME <", value, "attachHome");
            return this;
        }

        public Criteria andAttachHomeLessThanOrEqualTo(String value) {
            addCriterion("ATTACH_HOME <=", value, "attachHome");
            return this;
        }

        public Criteria andAttachHomeLike(String value) {
            addCriterion("ATTACH_HOME like", value, "attachHome");
            return this;
        }

        public Criteria andAttachHomeNotLike(String value) {
            addCriterion("ATTACH_HOME not like", value, "attachHome");
            return this;
        }

        public Criteria andAttachHomeIn(List<String> values) {
            addCriterion("ATTACH_HOME in", values, "attachHome");
            return this;
        }

        public Criteria andAttachHomeNotIn(List<String> values) {
            addCriterion("ATTACH_HOME not in", values, "attachHome");
            return this;
        }

        public Criteria andAttachHomeBetween(String value1, String value2) {
            addCriterion("ATTACH_HOME between", value1, value2, "attachHome");
            return this;
        }

        public Criteria andAttachHomeNotBetween(String value1, String value2) {
            addCriterion("ATTACH_HOME not between", value1, value2, "attachHome");
            return this;
        }

        public Criteria andFileNameNodeIsNull() {
            addCriterion("FILE_NAME_NODE is null");
            return this;
        }

        public Criteria andFileNameNodeIsNotNull() {
            addCriterion("FILE_NAME_NODE is not null");
            return this;
        }

        public Criteria andFileNameNodeEqualTo(String value) {
            addCriterion("FILE_NAME_NODE =", value, "fileNameNode");
            return this;
        }

        public Criteria andFileNameNodeNotEqualTo(String value) {
            addCriterion("FILE_NAME_NODE <>", value, "fileNameNode");
            return this;
        }

        public Criteria andFileNameNodeGreaterThan(String value) {
            addCriterion("FILE_NAME_NODE >", value, "fileNameNode");
            return this;
        }

        public Criteria andFileNameNodeGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME_NODE >=", value, "fileNameNode");
            return this;
        }

        public Criteria andFileNameNodeLessThan(String value) {
            addCriterion("FILE_NAME_NODE <", value, "fileNameNode");
            return this;
        }

        public Criteria andFileNameNodeLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME_NODE <=", value, "fileNameNode");
            return this;
        }

        public Criteria andFileNameNodeLike(String value) {
            addCriterion("FILE_NAME_NODE like", value, "fileNameNode");
            return this;
        }

        public Criteria andFileNameNodeNotLike(String value) {
            addCriterion("FILE_NAME_NODE not like", value, "fileNameNode");
            return this;
        }

        public Criteria andFileNameNodeIn(List<String> values) {
            addCriterion("FILE_NAME_NODE in", values, "fileNameNode");
            return this;
        }

        public Criteria andFileNameNodeNotIn(List<String> values) {
            addCriterion("FILE_NAME_NODE not in", values, "fileNameNode");
            return this;
        }

        public Criteria andFileNameNodeBetween(String value1, String value2) {
            addCriterion("FILE_NAME_NODE between", value1, value2, "fileNameNode");
            return this;
        }

        public Criteria andFileNameNodeNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME_NODE not between", value1, value2, "fileNameNode");
            return this;
        }

        public Criteria andAvailableIsNull() {
            addCriterion("IS_AVAILABLE is null");
            return this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("IS_AVAILABLE is not null");
            return this;
        }

        public Criteria andAvailableEqualTo(String value) {
            addCriterion("IS_AVAILABLE =", value, "available");
            return this;
        }

        public Criteria andAvailableNotEqualTo(String value) {
            addCriterion("IS_AVAILABLE <>", value, "available");
            return this;
        }

        public Criteria andAvailableGreaterThan(String value) {
            addCriterion("IS_AVAILABLE >", value, "available");
            return this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AVAILABLE >=", value, "available");
            return this;
        }

        public Criteria andAvailableLessThan(String value) {
            addCriterion("IS_AVAILABLE <", value, "available");
            return this;
        }

        public Criteria andAvailableLessThanOrEqualTo(String value) {
            addCriterion("IS_AVAILABLE <=", value, "available");
            return this;
        }

        public Criteria andAvailableLike(String value) {
            addCriterion("IS_AVAILABLE like", value, "available");
            return this;
        }

        public Criteria andAvailableNotLike(String value) {
            addCriterion("IS_AVAILABLE not like", value, "available");
            return this;
        }

        public Criteria andAvailableIn(List<String> values) {
            addCriterion("IS_AVAILABLE in", values, "available");
            return this;
        }

        public Criteria andAvailableNotIn(List<String> values) {
            addCriterion("IS_AVAILABLE not in", values, "available");
            return this;
        }

        public Criteria andAvailableBetween(String value1, String value2) {
            addCriterion("IS_AVAILABLE between", value1, value2, "available");
            return this;
        }

        public Criteria andAvailableNotBetween(String value1, String value2) {
            addCriterion("IS_AVAILABLE not between", value1, value2, "available");
            return this;
        }

        public Criteria andIsAnnotateIsNull() {
            addCriterion("IS_ANNOTATE is null");
            return this;
        }

        public Criteria andIsAnnotateIsNotNull() {
            addCriterion("IS_ANNOTATE is not null");
            return this;
        }

        public Criteria andIsAnnotateEqualTo(String value) {
            addCriterion("IS_ANNOTATE =", value, "isAnnotate");
            return this;
        }

        public Criteria andIsAnnotateNotEqualTo(String value) {
            addCriterion("IS_ANNOTATE <>", value, "isAnnotate");
            return this;
        }

        public Criteria andIsAnnotateGreaterThan(String value) {
            addCriterion("IS_ANNOTATE >", value, "isAnnotate");
            return this;
        }

        public Criteria andIsAnnotateGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ANNOTATE >=", value, "isAnnotate");
            return this;
        }

        public Criteria andIsAnnotateLessThan(String value) {
            addCriterion("IS_ANNOTATE <", value, "isAnnotate");
            return this;
        }

        public Criteria andIsAnnotateLessThanOrEqualTo(String value) {
            addCriterion("IS_ANNOTATE <=", value, "isAnnotate");
            return this;
        }

        public Criteria andIsAnnotateLike(String value) {
            addCriterion("IS_ANNOTATE like", value, "isAnnotate");
            return this;
        }

        public Criteria andIsAnnotateNotLike(String value) {
            addCriterion("IS_ANNOTATE not like", value, "isAnnotate");
            return this;
        }

        public Criteria andIsAnnotateIn(List<String> values) {
            addCriterion("IS_ANNOTATE in", values, "isAnnotate");
            return this;
        }

        public Criteria andIsAnnotateNotIn(List<String> values) {
            addCriterion("IS_ANNOTATE not in", values, "isAnnotate");
            return this;
        }

        public Criteria andIsAnnotateBetween(String value1, String value2) {
            addCriterion("IS_ANNOTATE between", value1, value2, "isAnnotate");
            return this;
        }

        public Criteria andIsAnnotateNotBetween(String value1, String value2) {
            addCriterion("IS_ANNOTATE not between", value1, value2, "isAnnotate");
            return this;
        }

        public Criteria andSuccessValueIsNull() {
            addCriterion("SUCCESS_VALUE is null");
            return this;
        }

        public Criteria andSuccessValueIsNotNull() {
            addCriterion("SUCCESS_VALUE is not null");
            return this;
        }

        public Criteria andSuccessValueEqualTo(String value) {
            addCriterion("SUCCESS_VALUE =", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueNotEqualTo(String value) {
            addCriterion("SUCCESS_VALUE <>", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueGreaterThan(String value) {
            addCriterion("SUCCESS_VALUE >", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueGreaterThanOrEqualTo(String value) {
            addCriterion("SUCCESS_VALUE >=", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueLessThan(String value) {
            addCriterion("SUCCESS_VALUE <", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueLessThanOrEqualTo(String value) {
            addCriterion("SUCCESS_VALUE <=", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueLike(String value) {
            addCriterion("SUCCESS_VALUE like", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueNotLike(String value) {
            addCriterion("SUCCESS_VALUE not like", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueIn(List<String> values) {
            addCriterion("SUCCESS_VALUE in", values, "successValue");
            return this;
        }

        public Criteria andSuccessValueNotIn(List<String> values) {
            addCriterion("SUCCESS_VALUE not in", values, "successValue");
            return this;
        }

        public Criteria andSuccessValueBetween(String value1, String value2) {
            addCriterion("SUCCESS_VALUE between", value1, value2, "successValue");
            return this;
        }

        public Criteria andSuccessValueNotBetween(String value1, String value2) {
            addCriterion("SUCCESS_VALUE not between", value1, value2, "successValue");
            return this;
        }
    }
    
    public String getBeforeOrSQL() {
		return beforeOrSQL;
	}

	public void setBeforeOrSQL(String beforeOrSQL) {
		this.beforeOrSQL = beforeOrSQL;
	}
}