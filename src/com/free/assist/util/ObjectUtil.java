package com.free.assist.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.ClassUtils;

/**
 * 
 * @author 李猛
 * 
 */
public class ObjectUtil {
    public ObjectUtil() {
    }

    /**
     * 对象赋值
     * 
     * @param from
     * @param to
     * @deprecated
     */
    public static void copyObject(Object from, Object to) {
        Field[] fields = ObjectUtil.getAllFields(to.getClass());
        for (Object obj : fields) {
            Field field = (Field) obj;
            String fieldName = field.getName();
            try {
                String methodName = "get" + StringUtil.toFirstLetterUppcase(fieldName);
                Method method = from.getClass().getMethod(methodName, new Class[0]);
                Object value = method.invoke(from, new Object[0]);
                if (value != null) {
                    methodName = "set" + StringUtil.toFirstLetterUppcase(fieldName);
                    method = to.getClass().getMethod(methodName, new Class[] { value.getClass() });
                    method.invoke(to, value);
                }
            } catch (NoSuchMethodException e) {
                // 正常的异常
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 对象赋值 如果为空则不赋值
     * 
     * @param src
     *            Object
     * @param des
     *            Object
     */
    public static void copyModeltoModel(Object src, Object des) {
        PropertyDescriptor[] pds = PropertyUtils.getPropertyDescriptors(des); // 得到to对象的字段属性集合
        for (int i = 0; i < pds.length; i++) {
            try {
                // 得到to对象的属性的类型
                String className = ClassUtils.getShortClassName(pds[i].getPropertyType());
                // 根据此字段名去from对象查找 如果找不到则跳过 继续下一个to字段的赋值
                PropertyDescriptor descriptor = null;
                try {
                    descriptor = PropertyUtils.getPropertyDescriptor(src, pds[i].getDisplayName());
                    if (descriptor == null) {
                        continue; // Skip this property setter
                    }
                } catch (NoSuchMethodException e) {
                    continue; // Skip this property setter
                }
                // 得到form对象该字段的类型
                String fromClassName = ClassUtils.getShortClassName(descriptor.getPropertyType());

                if ("Class".equals(className)) {
                    continue;
                } else {
                    // 得到form字段该字段的值 如果有值则赋值 否则继续下一个
                    Object o = PropertyUtils.getProperty(src, pds[i].getDisplayName());
                    if (o != null) {
                        if (className.equals("Date") && fromClassName.equals("String")) { // 如果form该字段是字符串
                            // 而to该字段是日期
                            // 如果from的字符串格式正确
                            // 则转成日期
                            if (StringUtil.isDateTimeFormat((String) o)) {
                                o = DateUtil.toDateByFormat((String) o, "yyyy-MM-dd HH:mm:ss");
                            } else if (StringUtil.isDateFormat((String) o)) {
                                o = DateUtil.toDateByFormat((String) o, "yyyy-MM-dd");
                            } else if (StringUtil.isDateTFormat((String) o)) {
                                o = DateUtil.toDateByFormat((String) o, "yyyy-MM-dd HH:mm");
                            } else {
                                continue;
                            }
                        } else if (className.equals("String") && fromClassName.equals("Date")) {
                            o = DateUtil.toStringByFormat((Date) o, "yyyy-MM-dd HH:mm:ss");
                            if (org.apache.commons.lang.StringUtils.contains((String) o, "00:00:00")) {
                                o =
                                        org.apache.commons.lang.StringUtils.substringBeforeLast((String) o, "00:00:00")
                                                .trim();
                            }
                        }
                        org.apache.commons.beanutils.BeanUtils.setProperty(des, pds[i].getDisplayName(), o);
                        // ObjectUtil.setValueByPropertyName(des, pds[i].getDisplayName(), o);
                    }
                }
            } catch (Exception ex) {
                // System.out.println("赋值失败：" + ex);
            }
        }
    }

    /**
     * 把对象转为Map
     * 
     * @param bean
     *            Object
     * @return Map
     */
    public static Map describe(Object bean) {
        if (bean == null) {
            return (new java.util.HashMap());
        }
        Map description = new HashMap();
        PropertyDescriptor[] pds = PropertyUtils.getPropertyDescriptors(bean);
        for (int i = 0; i < pds.length; i++) {
            try {
                String className = ClassUtils.getShortClassName(pds[i].getPropertyType());
                if ("Class".equals(className)) {
                    continue;
                } else {
                    Object o = PropertyUtils.getProperty(bean, pds[i].getDisplayName());
                    if (o != null) {
                        description.put(pds[i].getDisplayName(), o);
                    }
                }
            } catch (Exception ex) {
                // System.out.println("赋值失败：" + ex);
            }
        }
        return (description);

    }

    /**
     * 对象简单赋值 from为空的字段也赋值到to的对象该字段
     * 
     * @param from
     *            Object
     * @param to
     *            Object
     */
    public static void copyObjectToObject(Object from, Object to) {
        PropertyDescriptor[] pds = PropertyUtils.getPropertyDescriptors(to); // 得到to对象的字段属性集合
        for (int i = 0; i < pds.length; i++) {
            try {
                // 得到to对象的属性的类型
                String className = ClassUtils.getShortClassName(pds[i].getPropertyType());
                // 根据此字段名去from对象查找 如果找不到则跳过 继续下一个to字段的赋值
                PropertyDescriptor descriptor = null;
                try {
                    descriptor = PropertyUtils.getPropertyDescriptor(from, pds[i].getDisplayName());
                    if (descriptor == null) {
                        continue; // Skip this property setter
                    }
                } catch (NoSuchMethodException e) {
                    continue; // Skip this property setter
                }
                // 得到form对象该字段的类型
                String fromClassName = ClassUtils.getShortClassName(descriptor.getPropertyType());

                if ("Class".equals(className)) {
                    continue;
                } else {
                    // 得到form字段该字段的值 如果有值则赋值 否则继续下一个
                    Object o = PropertyUtils.getProperty(from, pds[i].getDisplayName());

                    if (className.equals("Date") && fromClassName.equals("String")) { // 如果form该字段是字符串
                        // 而to该字段是日期
                        // 如果from的字符串格式正确
                        // 则转成日期
                        if (StringUtil.isDateTimeFormat((String) o)) {
                            o = DateUtil.toDateByFormat((String) o, "yyyy-MM-dd HH:mm:ss");
                        } else if (StringUtil.isDateFormat((String) o)) {
                            o = DateUtil.toDateByFormat((String) o, "yyyy-MM-dd");
                        } else if (StringUtil.isMinuteTimeFormat((String) o)) {
                            o = DateUtil.toDateByFormat((String) o, "yyyy-MM-dd HH:mm");
                        } else {
                            o = null;
                        }
                    } else if (className.equals("String") && fromClassName.equals("Date")) {
                        o = DateUtil.toStringByFormat((Date) o, "yyyy-MM-dd HH:mm:ss");
                        if (org.apache.commons.lang.StringUtils.contains((String) o, "00:00:00")) {
                            o = org.apache.commons.lang.StringUtils.substringBeforeLast((String) o, "00:00:00").trim();
                        }

                    }
                    org.apache.commons.beanutils.BeanUtils.setProperty(to, pds[i].getDisplayName(), o);

                }
            } catch (Exception ex) {
                // System.out.println("赋值失败：" + ex);
            }
        }

    }

    /**
     * 取得提供类的所有Field,包父类以及超类的Field
     * 
     * @param objClass
     * @return
     */
    public static Field[] getAllFields(Class objClass) {
        Map map = new HashMap();
        boolean end = false;
        Class c = objClass;
        while (!end) {
            Field[] fields = c.getDeclaredFields();
            for (int i = 0; fields != null && i < fields.length; i++) {
                String fieldName = fields[i].getName();
                String fieldType = fields[i].getType().getName();
                if (map.get(fieldType + "_" + fieldName) == null) {
                    map.put(fieldType + "_" + fieldName, fields[i]);
                }
            }
            c = c.getSuperclass();
            if (c == null) {
                end = true;
            }
        }
        Collection ct = map.values();
        if (ct.size() > 0) {
            Object[] objs = ct.toArray();
            Field[] fields = new Field[objs.length];
            for (int i = 0; i < objs.length; i++) {
                fields[i] = (Field) objs[i];
            }
            return fields;
        } else {
            return null;
        }
    }

    public static Object getValueByPropertyName(Object o, String property) {
        try {
            return PropertyUtils.getProperty(o, property);
        } catch (Exception e) {
            System.out.println("从[" + o.getClass().getSimpleName() + "]取值[" + property + "]失败!");
            return null;
        }
    }

    /**
     * 需要抛出异常
     * 
     * @author 李猛
     */
    protected static Object getPropertyValue(Object context, String propName) throws NoSuchFieldException {
        Object object = null;
        try {
            object = PropertyUtils.getProperty(context, propName);
        } catch (IllegalAccessException e) {
            throw new NoSuchFieldException(e.getMessage());
        } catch (InvocationTargetException e) {
            throw new NoSuchFieldException(e.getMessage());
        } catch (NoSuchMethodException e) {
            throw new NoSuchFieldException(e.getMessage());
        }
        return object;
    }

    public static void setValueByPropertyName(Object des, String property, Object value) {
        try {
            org.apache.commons.beanutils.BeanUtils.setProperty(des, property, value);
        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        }
    }

    public static <T> List CoventCollection(Collection<T> col) {
        List<T> tList = null;
        if (col != null) {
            Iterator<T> it = col.iterator();
            if (it.hasNext()) {
                tList = new ArrayList();
            }
            while (it.hasNext()) {
                tList.add(it.next());
            }
        }
        return tList;
    }

    public static void main(String[] args) {

    }
}
