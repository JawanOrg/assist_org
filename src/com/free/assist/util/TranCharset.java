package com.free.assist.util;

import java.io.UnsupportedEncodingException;

/**
 * <p>
 * 标题: 客户保障支撑系统
 * </p>
 * <p>
 * 描述: ...
 * </p>
 * <p>
 * 版权: Copyright (c) 2008
 * </p>
 * <p>
 * 公司: 广州瑞达通信技术有限公司
 * </p>
 * 
 * @version 1.0
 * @author 李猛
 * @date Dec 16, 2008
 * @time 10:05:03 AM
 */
public class TranCharset {
	private static final String PRE_FIX_UTF = "&#x";
	private static final String POS_FIX_UTF = ";";

	public TranCharset() {
	}

	/**
	 * Translate charset encoding to unicode
	 * 
	 * @param sTemp
	 *            charset encoding is gb2312
	 * @return charset encoding is unicode
	 */
	public static String XmlFormalize(String sTemp) {
		StringBuffer sb = new StringBuffer();

		if (sTemp == null || sTemp.equals("")) {
			return "";
		}
		String s = TranCharset.TranEncodeTOGB(sTemp);
		for (int i = 0; i < s.length(); i++) {
			char cChar = s.charAt(i);
			if (TranCharset.isGB(cChar)) {
				sb.append(PRE_FIX_UTF);
				sb.append(Integer.toHexString(cChar));
				sb.append(POS_FIX_UTF);
			} else {
				switch ((int) cChar) {
				case 32:
					sb.append("&#32;");
					break;
				case 34:
					sb.append("&quot;");
					break;
				case 38:
					sb.append("&amp;");
					break;
				case 60:
					sb.append("&lt;");
					break;
				case 62:
					sb.append("&gt;");
					break;
				default:
					sb.append(cChar);
				}
			}
		}
		return sb.toString();
	}

	/**
	 * 将字符串编码格式转成GBK
	 * 
	 * @param str
	 * @return
	 */
	public static String TranEncodeTOGB(String str) {
		try {
			String strEncode = TranCharset.getEncoding(str);
			String temp = new String(str.getBytes(strEncode), "GBK");
			return temp;
		} catch (java.io.IOException ex) {

			return null;
		}
	}

	/**
	 * 判断输入字符是否为gbk的编码格式
	 * 
	 * @param c
	 *            输入字符
	 * @return 如果是gbk返回真，否则返回假
	 */
	public static boolean isGB(char c) {
		Character ch = new Character(c);
		String sCh = ch.toString();
		try {
			byte[] bb = sCh.getBytes("GBK");
			if (bb.length > 1) {
				return true;
			}
		} catch (java.io.UnsupportedEncodingException ex) {
			return false;
		}
		return false;
	}

	/**
	 * 判断字符串的编码
	 * 
	 * @param str
	 * @return
	 */
	public static String getEncoding(String str) {
		String encode = "GBK";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s3 = encode;
				return s3;
			}
		} catch (Exception exception3) {
		}
		encode = "GB2312";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s = encode;
				return s;
			}
		} catch (Exception exception) {
		}
		encode = "ISO-8859-1";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s1 = encode;
				return s1;
			}
		} catch (Exception exception1) {
		}
		encode = "UTF-8";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s2 = encode;
				return s2;
			}
		} catch (Exception exception2) {
		}
		
		encode = "BIG5";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s4 = encode;
				return s4;
			}
		} catch (Exception exception3) {
		}
		return "";
	}
	
	


	public static void main(String args[]) throws UnsupportedEncodingException {
		String str = "<\"This is a test for *中网!@#$。，？\n\">";   
		System.out.println(XmlFormalize(str));
	}  
}

