/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibatis.sqlmap.client.extensions.ParameterSetter;
import com.ibatis.sqlmap.client.extensions.ResultGetter;
import com.ibatis.sqlmap.client.extensions.TypeHandlerCallback;

/**
 * @author 李猛
 * @version 1
 * @date 2009-9-28 上午10:14:52
 */
public class BooleanTypeHandlerCallback implements TypeHandlerCallback {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final String YES = "Y";

	private static final String NO = "N";

	/* (non-Javadoc)
	 * @see com.ibatis.sqlmap.client.extensions.TypeHandlerCallback#getResult(com.ibatis.sqlmap.client.extensions.ResultGetter)
	 */
	public Object getResult(ResultGetter getter) throws SQLException {
		String s = getter.getString();
		if (YES.equalsIgnoreCase(s)) {
			return new Boolean(true);
		} else if (NO.equalsIgnoreCase(s)) {
			return new Boolean(false);
		} else {
			String errInfo = String.format("Unexpected value %s found where %s or %s was expected.", s, YES, NO);
			logger.error(errInfo);
			throw new SQLException(errInfo);
		}
	}

	/* (non-Javadoc)
	 * @see com.ibatis.sqlmap.client.extensions.TypeHandlerCallback#setParameter(com.ibatis.sqlmap.client.extensions.ParameterSetter, java.lang.Object)
	 */
	public void setParameter(ParameterSetter setter, Object parameter) throws SQLException {
		boolean b = ((Boolean) parameter).booleanValue();
		if (b) {
			setter.setString(YES);
		} else {
			setter.setString(NO);
		}
	}

	/* (non-Javadoc)
	 * @see com.ibatis.sqlmap.client.extensions.TypeHandlerCallback#valueOf(java.lang.String)
	 */
	public Object valueOf(String s) {
		if (YES.equalsIgnoreCase(s)) {
			return Boolean.TRUE;
		} else if (NO.equalsIgnoreCase(s)) {
			return Boolean.FALSE;
		} else {
			logger.error("Unexpected value " + s + " found where " + YES + " or " + NO + " was expected.");
			return Boolean.FALSE;
		}
	}

}
