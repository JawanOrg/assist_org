package com.free.assist.web.tag;


public class SubString {

	/**
	 * 获取一个字符串的长度
	 * 
	 * @param str
	 * @return int
	 */
	public static int getLen(String str) {
		return str.length();
	}

	/**
	 * 截取字符串
	 * 
	 * @param str
	 * @param start
	 * @param end
	 * @return String
	 */
	public static String subString(String str, int start, int end) {
		return str.substring(start, end);
	}

}
