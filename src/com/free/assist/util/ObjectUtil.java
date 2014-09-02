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
 * @author ����
 * 
 */
public class ObjectUtil {
    public ObjectUtil() {
    }

    /**
     * ����ֵ
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
                // �������쳣
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
     * ����ֵ ���Ϊ���򲻸�ֵ
     * 
     * @param src
     *            Object
     * @param des
     *            Object
     */
    public static void copyModeltoModel(Object src, Object des) {
        PropertyDescriptor[] pds = PropertyUtils.getPropertyDescriptors(des); // �õ�to������ֶ����Լ���
        for (int i = 0; i < pds.length; i++) {
            try {
                // �õ�to��������Ե�����
                String className = ClassUtils.getShortClassName(pds[i].getPropertyType());
                // ���ݴ��ֶ���ȥfrom������� ����Ҳ��������� ������һ��to�ֶεĸ�ֵ
                PropertyDescriptor descriptor = null;
                try {
                    descriptor = PropertyUtils.getPropertyDescriptor(src, pds[i].getDisplayName());
                    if (descriptor == null) {
                        continue; // Skip this property setter
                    }
                } catch (NoSuchMethodException e) {
                    continue; // Skip this property setter
                }
                // �õ�form������ֶε�����
                String fromClassName = ClassUtils.getShortClassName(descriptor.getPropertyType());

                if ("Class".equals(className)) {
                    continue;
                } else {
                    // �õ�form�ֶθ��ֶε�ֵ �����ֵ��ֵ ���������һ��
                    Object o = PropertyUtils.getProperty(src, pds[i].getDisplayName());
                    if (o != null) {
                        if (className.equals("Date") && fromClassName.equals("String")) { // ���form���ֶ����ַ���
                            // ��to���ֶ�������
                            // ���from���ַ�����ʽ��ȷ
                            // ��ת������
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
                // System.out.println("��ֵʧ�ܣ�" + ex);
            }
        }
    }

    /**
     * �Ѷ���תΪMap
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
                // System.out.println("��ֵʧ�ܣ�" + ex);
            }
        }
        return (description);

    }

    /**
     * ����򵥸�ֵ fromΪ�յ��ֶ�Ҳ��ֵ��to�Ķ�����ֶ�
     * 
     * @param from
     *            Object
     * @param to
     *            Object
     */
    public static void copyObjectToObject(Object from, Object to) {
        PropertyDescriptor[] pds = PropertyUtils.getPropertyDescriptors(to); // �õ�to������ֶ����Լ���
        for (int i = 0; i < pds.length; i++) {
            try {
                // �õ�to��������Ե�����
                String className = ClassUtils.getShortClassName(pds[i].getPropertyType());
                // ���ݴ��ֶ���ȥfrom������� ����Ҳ��������� ������һ��to�ֶεĸ�ֵ
                PropertyDescriptor descriptor = null;
                try {
                    descriptor = PropertyUtils.getPropertyDescriptor(from, pds[i].getDisplayName());
                    if (descriptor == null) {
                        continue; // Skip this property setter
                    }
                } catch (NoSuchMethodException e) {
                    continue; // Skip this property setter
                }
                // �õ�form������ֶε�����
                String fromClassName = ClassUtils.getShortClassName(descriptor.getPropertyType());

                if ("Class".equals(className)) {
                    continue;
                } else {
                    // �õ�form�ֶθ��ֶε�ֵ �����ֵ��ֵ ���������һ��
                    Object o = PropertyUtils.getProperty(from, pds[i].getDisplayName());

                    if (className.equals("Date") && fromClassName.equals("String")) { // ���form���ֶ����ַ���
                        // ��to���ֶ�������
                        // ���from���ַ�����ʽ��ȷ
                        // ��ת������
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
                // System.out.println("��ֵʧ�ܣ�" + ex);
            }
        }

    }

    /**
     * ȡ���ṩ�������Field,�������Լ������Field
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
            System.out.println("��[" + o.getClass().getSimpleName() + "]ȡֵ[" + property + "]ʧ��!");
            return null;
        }
    }

    /**
     * ��Ҫ�׳��쳣
     * 
     * @author ����
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
