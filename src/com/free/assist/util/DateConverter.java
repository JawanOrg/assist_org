package com.free.assist.util;

import java.text.ParseException;

import org.apache.commons.beanutils.Converter;
import org.apache.commons.lang.time.DateUtils;

/**
 * struts1.2的自定义转换器
 * @author 李猛
 */
public class DateConverter implements Converter {
    
    private String[] patterns = {"yyyy-MM-dd", "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mm:ss", "yyyy/MM/dd HH:mm:ss"};
    
    /**
     * 日期转换器
     */
	public Object convert(Class type, Object value) {
		if (value == null) {
			return null;
		} else if (value instanceof String) {
			Object dateObj = null;
			try {
				dateObj = DateUtils.parseDate((String)value, patterns);
			} catch (ParseException e) {
				//转换失败
			}
            return dateObj;
		} else {
			return null;
		}
	}

}
