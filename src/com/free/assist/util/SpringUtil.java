package com.free.assist.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {
	
	private static SpringUtil springUtil;
	
	private ApplicationContext ctx;
	
	private SpringUtil(){
		
	}
	
	public static SpringUtil getInstance(){
		if(springUtil == null){
			springUtil = new SpringUtil();
		}
		return springUtil;
	}
	

	
	public ApplicationContext getCtx(){
		if(ctx == null){
			String[] str = { "classpath*:conf/spring/*.xml" };
			ctx = new ClassPathXmlApplicationContext(str);
		}
		return ctx;
	}
	
	public static void main(String[] args){
		System.out.println(SpringUtil.getInstance().getCtx().equals(SpringUtil.getInstance().getCtx()));
	}

}
