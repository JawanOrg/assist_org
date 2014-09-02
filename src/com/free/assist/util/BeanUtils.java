package com.free.assist.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ReflectionUtils;

/**
 * 扩展Apache Commons BeanUtils, 提供反射方面缺失功能的封装.
 */
public class BeanUtils extends org.apache.commons.beanutils.BeanUtils {

	protected static final Log logger = LogFactory.getLog(BeanUtils.class);

	private BeanUtils() {
	}

	/**
	 * 循环向上转型,获取对象的DeclaredField.
	 * 
	 * @throws NoSuchFieldException
	 *             如果没有该Field时
	 */
	public static Field getDeclaredField(Object object, String propertyName) throws NoSuchFieldException {
		Assert.notNull(object);
		Assert.hasText(propertyName);
		return getDeclaredField(object.getClass(), propertyName);
	}

	/**
	 * 循环向上转型,获取对象的DeclaredField.
	 * 
	 * @throws NoSuchFieldException
	 *             如果没有该Field时
	 */
	public static Field getDeclaredField(Class clazz, String propertyName) throws NoSuchFieldException {
		Assert.notNull(clazz);
		Assert.hasText(propertyName);
		for (Class superClass = clazz; superClass != Object.class; superClass = superClass.getSuperclass()) {
			try {
				return superClass.getDeclaredField(propertyName);
			} catch (NoSuchFieldException e) {

			}
		}
		throw new NoSuchFieldException("No such field: " + clazz.getName() + '.' + propertyName);
	}

	/**
	 * 循环向上转型,获取对象的DeclaredField.
	 * 
	 */
	public static List<Field> getDeclaredFields(Class clazz) {
		Assert.notNull(clazz);
		List<Field> list = new ArrayList();
		for (Class superClass = clazz; superClass != Object.class; superClass = superClass.getSuperclass()) {
			Field[] ff = superClass.getDeclaredFields();
			if (ff != null && ff.length > 0) {
				for (Field f : ff) {
					list.add(f);
				}
			}
		}
		return list;
	}

	public static Object forceGetProperty(Object object, String propertyName) throws NoSuchFieldException {
		Assert.notNull(object);
		Assert.hasText(propertyName);

		Field field = getDeclaredField(object, propertyName);

		boolean accessible = field.isAccessible();
		field.setAccessible(true);

		Object result = null;
		try {
			result = field.get(object);
		} catch (IllegalAccessException e) {
			logger.info("error wont' happen");
		}
		field.setAccessible(accessible);
		return result;
	}

	public static Object getGetProperty(Object object, String propertyName) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		Assert.notNull(object);
		Assert.hasText(propertyName);
		if(object instanceof Map){
			Map map = (Map)object;
			return map.get(propertyName);
		}else{
			String methodName = BeanUtils.getGetterName(String.class, propertyName);
			Method method = object.getClass().getMethod(methodName, new Class[0]);
			Object result = method.invoke(object, new Object[0]);
			return result;
		}
	}

	public static Object nestecdGetProperty(Object object, String propertyName) throws SecurityException, IllegalArgumentException, NoSuchFieldException, NoSuchMethodException,
			IllegalAccessException, InvocationTargetException {
		if (StringUtils.contains(propertyName, ".")) {
			String[] fileds = StringUtils.split(propertyName, ".");
			for (String f : fileds) {
				try {
					object = BeanUtils.getGetProperty(object, f);
				} catch (Exception e) {
					e.printStackTrace();
					// throw new
					// BOException("无法从类【"+obj.getClass()+"】中找到属性【"+f+"】");
				}
				if (object == null) {
					break;
				}
			}
			return object;
		} else {
			return getGetProperty(object, propertyName);
		}
	}

	public static void forceSetProperty(Object object, String propertyName, Object newValue) throws NoSuchFieldException {
		Assert.notNull(object);
		Assert.hasText(propertyName);

		Field field = getDeclaredField(object, propertyName);
		boolean accessible = field.isAccessible();
		field.setAccessible(true);
		try {
			field.set(object, newValue);
		} catch (IllegalAccessException e) {
			logger.info("Error won't happen");
		}
		field.setAccessible(accessible);
	}

	public static Object invokePrivateMethod(Object object, String methodName, Object... params) throws NoSuchMethodException {
		Assert.notNull(object);
		Assert.hasText(methodName);
		Class[] types = new Class[params.length];
		for (int i = 0; i < params.length; i++) {
			types[i] = params[i].getClass();
		}

		Class clazz = object.getClass();
		Method method = null;
		for (Class superClass = clazz; superClass != Object.class; superClass = superClass.getSuperclass()) {
			try {
				method = superClass.getDeclaredMethod(methodName, types);
				break;
			} catch (NoSuchMethodException e) {
				//e.printStackTrace();
			}
		}

		if (method == null)
			throw new NoSuchMethodException("No Such Method:" + clazz.getSimpleName() + methodName);

		boolean accessible = method.isAccessible();
		method.setAccessible(true);
		Object result = null;
		try {
			result = method.invoke(object, params);
		} catch (Exception e) {
			ReflectionUtils.handleReflectionException(e);
		}
		method.setAccessible(accessible);
		return result;
	}

	/**
	 * 按Filed的类型取得Field列表.
	 */
	public static List<Field> getFieldsByType(Object object, Class type) {
		List<Field> list = new ArrayList<Field>();
		Field[] fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (field.getType().isAssignableFrom(type)) {
				list.add(field);
			}
		}
		return list;
	}

	public static Class getPropertyType(Class type, String name) throws NoSuchFieldException {
		return getDeclaredField(type, name).getType();
	}

	/**
	 * 获得field的getter函数名称.
	 */
	public static String getGetterName(Class type, String fieldName) {
		Assert.notNull(type, "Type required");
		Assert.hasText(fieldName, "FieldName required");

		if (type.getName().equals("boolean")) {
			return "is" + StringUtils.capitalize(fieldName);
		} else {
			return "get" + StringUtils.capitalize(fieldName);
		}
	}

	/**
	 * 获得field的getter函数,如果找不到该方法,返回null.
	 */
	public static Method getGetterMethod(Class type, String fieldName) {
		try {
			return type.getMethod(getGetterName(type, fieldName));
		} catch (NoSuchMethodException e) {
			// logger.error(e.getMessage(), e);
		}
		return null;
	}
}
