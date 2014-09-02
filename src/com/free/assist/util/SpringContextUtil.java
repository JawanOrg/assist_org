package com.free.assist.util;

import org.directwebremoting.spring.SpringCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.generic.GenericBeanFactoryAccessor;

/**
 * Spring应用上下文环境
 * @author 李猛
 */
public final class SpringContextUtil implements BeanFactoryAware
{
	private static Logger logger = LoggerFactory.getLogger(SpringContextUtil.class);

	private static GenericBeanFactoryAccessor genericBeanFactoryAccessor;
	
	/**
	 * 实现ApplicationContextAware接口的回调方法，设置上下文环境
	 * @param  beanFactory
	 * @throws BeansException
	 */
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException
	{
		SpringCreator.setOverrideBeanFactory(beanFactory);
		SpringContextUtil.genericBeanFactoryAccessor = new GenericBeanFactoryAccessor(( ListableBeanFactory)beanFactory);
	}

	public static <T> T getBean(String beanName, Class<T> className) throws BeansException
	{
		return (T) SpringContextUtil.genericBeanFactoryAccessor.getBean(beanName);
	}

	public static boolean containsBean(String beanName)
	{
		if (SpringContextUtil.genericBeanFactoryAccessor == null) {
			logger.error("没有启动Spring ioc容器，或者Spring ioc容器启动了，但ioc容器没有注册SpringContextUtil。");
			return false;
		}
		return SpringContextUtil.genericBeanFactoryAccessor.getBeanFactory().containsBean(beanName);
	}

}
