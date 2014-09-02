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
 * SpringӦ�������Ļ���
 * @author ����
 */
public final class SpringContextUtil implements BeanFactoryAware
{
	private static Logger logger = LoggerFactory.getLogger(SpringContextUtil.class);

	private static GenericBeanFactoryAccessor genericBeanFactoryAccessor;
	
	/**
	 * ʵ��ApplicationContextAware�ӿڵĻص����������������Ļ���
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
			logger.error("û������Spring ioc����������Spring ioc���������ˣ���ioc����û��ע��SpringContextUtil��");
			return false;
		}
		return SpringContextUtil.genericBeanFactoryAccessor.getBeanFactory().containsBean(beanName);
	}

}
