package com.free.assist.service;

public class SuptConstants {

	//定义错误类型
	public static final String ERROR_TYPE_JIEXI = "J";  //解析规则错误
	public static final String ERROR_TYPE_CHANGER = "C";  //XML转换错误
	public static final String ERROR_TYPE_SYS = "S";  //系统异常
	public static final String ERROR_TYPE_STATIC = "T";  //静态数据转换错误
	public static final String ERROR_TYPE_GEI = "G";  //格式错误
	
	//定义错误处理方式
	public static final String ERROR_TACK_BACK = "BACK";  //返回源系统
	public static final String ERROR_TACK_POP = "POP";  //人工调用
	public static final String ERROR_TACK_AUTO = "AUTO";  //自动调用
}
