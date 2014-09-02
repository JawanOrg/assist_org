package com.free.assist.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李猛
 */
public class ArrayUtil
{
	public static Map<String, String> toMap(String[] keys, String[] values)
	{
		if (keys == null || values == null)
		{
			return null;
		}
		if (keys.length != values.length)
		{
			throw new IllegalArgumentException("二个数组的长度不一致!");
		}
		final Map<String,String> map = new HashMap<String,String>((int) (keys.length * 1.5));
		for (int i=0; i< keys.length; i++)
		{
			String key   = keys[i];
			String value = values[i];
			map.put(key, value);
		}
		return map;
	}
}
