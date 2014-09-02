package com.free.assist.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.Validate;
import org.apache.struts.action.ActionForm;

@SuppressWarnings("unchecked")
public class Helper {
    public static HashMap businessDicMap = new HashMap();// 以syscode为key存储售后t_saled_configure_info表的业务字典

    // 将以seperators分隔的str字符串转换成数组
    public static String[] split(String str, String seperators) {
        List list = new ArrayList();
        String temp = null;
        int length = seperators.length();
        do {
            if (str.length() < 0)
                break;
            int index = str.indexOf(seperators);
            if (index < 0) {
                list.add(str);
                break;
            }
            temp = str.substring(0, index);
            list.add(temp);
            str = str.substring(index + length, str.length());
        } while (true);
        int size = list.size();
        String[] result = new String[size];
        Object[] arr = list.toArray();
        System.arraycopy(arr, 0, result, 0, size);
        return result;
    }

    /**
     * 获得当前年份
     *
     * @return yyyy
     */
    public static String getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR) + "";
    }

    /**
     * 获取当前月份
     *
     * @return
     */
    public static String getCurrentMonth() {
        return (Calendar.getInstance().get(Calendar.MONTH) + 1) + "";
    }

    /**
     * 获取当前日
     *
     * @return
     */
    public static String getCurrentDay() {
        return (Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) + "";
    }

    /**
     * 获取时间串20071212
     *
     * @return
     */
    public static String getCurrentTimeStr() {
        return getCurrentYear() + getCurrentMonth() + getCurrentDay();
    }

    /**
     *
     */
    public static String getCurrentDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tmpStr = sdf.format(date);
        return tmpStr;
    }

    /**
     * 
     * @return 201401
     */
    public static String getCurrentDateMonth() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        String tmpStr = sdf.format(date);
        return tmpStr;
    }

    /**
     * 
     * @return 201401150101001
     */
    public static String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String tmpStr = sdf.format(date);
        return tmpStr;
    }

    public static boolean isNoNullElements(Collection collection) {
        Validate.notEmpty(collection, "数组为空!");
        for (Iterator it = collection.iterator(); it.hasNext();) {
            if (it.next() == null) {
                return false;
            }
        }
        return true;
    }

    public static ActionForm setQueryParam(ActionForm form) {
        return setQueryParam(form, "allQueryParam");
    }

    public static ActionForm setQueryParam(ActionForm form, String queryParamName) {
        try {
            StringBuffer sbf = new StringBuffer(100);
            String paramSeparator = "~`~";
            String paramValueSeparator = "=`=";
            Class clazz = Class.forName(form.getClass().getName());
            Method method =
                    clazz.getDeclaredMethod(
                            "get" + queryParamName.substring(0, 1).toUpperCase() + queryParamName.substring(1),
                            (Class[]) null);
            Method[] methods = clazz.getDeclaredMethods();
            String allQueryParamName = StringUtil.nullToEmptyOfObject(method.invoke(form, (Object[]) null));
            allQueryParamName = paramSeparator + allQueryParamName + paramSeparator;
            // 针对当前form取值
            sbf = getAllClassProp(methods, allQueryParamName, paramSeparator, paramValueSeparator, form, sbf);
            // 针对父form取值
            methods = clazz.getSuperclass().getDeclaredMethods();
            sbf = getAllClassProp(methods, allQueryParamName, paramSeparator, paramValueSeparator, form, sbf);

            if (sbf != null && !"".equals(sbf.toString().trim())) {
                method =
                        clazz.getDeclaredMethod(
                                "set" + queryParamName.substring(0, 1).toUpperCase() + queryParamName.substring(1),
                                String.class);
                method.invoke(form, sbf.toString());
            }
        } catch (Exception e) {
            System.out.println("error when setting values in Helper.setQueryParam==" + e);
        }
        return form;
    }

    private static StringBuffer getAllClassProp(Method[] methods, String allQueryParamName, String paramSeparator,
            String paramValueSeparator, ActionForm form, StringBuffer sbf) throws Exception {
        String methodName = null;
        Object returnValue = null;
        String strParameterValue = null;
        String strParameterName = null;
        String returnType = null;
        String array[] = null;
        String temp = null;
        for (int i = 0; i < methods.length; i++) {
            methodName = methods[i].getName();
            returnType = methods[i].getReturnType().getName();
            if (methodName.startsWith("get")) {
                strParameterName = methodName.substring(3, 4).toLowerCase() + methodName.substring(4);
                if (allQueryParamName.indexOf(paramSeparator + strParameterName + paramSeparator) != -1) {
                    returnValue = methods[i].invoke(form, (Object[]) null);
                    if (returnType.equals(String[].class.getName())) {
                        array = (String[]) returnValue;
                        temp = "";
                        if (array != null) {
                            for (int j = 0; j < array.length; j++) {
                                temp += array[j] + paramSeparator;
                            }
                        }
                        temp = "".equals(temp) ? "" : temp.substring(0, temp.length() - paramSeparator.length());
                        sbf.append(strParameterName);
                        sbf.append(paramValueSeparator);
                        sbf.append(temp);
                        sbf.append(paramSeparator);
                    } else {
                        strParameterValue = StringUtil.nullToEmptyOfObject(returnValue);
                        strParameterValue = strParameterValue.indexOf("===") != -1 ? "" : strParameterValue;
                        sbf.append(strParameterName);
                        sbf.append(paramValueSeparator);
                        sbf.append(strParameterValue);
                        sbf.append(paramSeparator);
                    }
                }
            }
        }
        return sbf;
    }

    public static ActionForm setFormByQueryParam(ActionForm form) {
        return setFormByQueryParam(form, "allQueryParam");
    }

    public static ActionForm setFormByQueryParam(ActionForm form, String queryParamName) {
        try {
            String paramSeparator = "~`~";
            String paramValueSeparator = "=`=";
            Class clazz = Class.forName(form.getClass().getName());
            Method method =
                    clazz.getDeclaredMethod(
                            "get" + queryParamName.substring(0, 1).toUpperCase() + queryParamName.substring(1),
                            (Class[]) null);
            String allQueryParam = StringUtil.nullToEmptyOfObject(method.invoke(form, (Object[]) null));
            String[] allQueryParamArray = split(allQueryParam, paramSeparator);
            Method[] methods = clazz.getDeclaredMethods();
            // 针对当前form设值
            setClassProp(methods, allQueryParamArray, paramSeparator, paramValueSeparator, form);
            // 针对父form设值
            methods = clazz.getSuperclass().getDeclaredMethods();
            // form=form.getClass().getSuperclass().cast(form);
            setClassProp(methods, allQueryParamArray, paramSeparator, paramValueSeparator, form);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("error when setting values in Helper.setFormByQueryParam==" + e);
        }
        return form;
    }

    public static void setClassProp(Method[] methods, String[] allQueryParamArray, String paramSeparator,
            String paramValueSeparator, ActionForm form) throws Exception {
        String methodName = null;
        String strParameterName = null;
        String[] queryParamNameValueArray = null;
        for (int i = 0; i < methods.length; i++) {
            methodName = methods[i].getName();
            if (methodName.startsWith("set")) {
                strParameterName = methodName.substring(3, 4).toLowerCase() + methodName.substring(4);
                for (String queryParamNameValue : allQueryParamArray) {
                    queryParamNameValueArray = split(queryParamNameValue, paramValueSeparator);
                    if (strParameterName.equals(queryParamNameValueArray[0]) && queryParamNameValueArray[1] != null
                            && !"".equals(queryParamNameValueArray[1].trim())) {
                        Class<?>[] zlass = methods[i].getParameterTypes();
                        if (zlass.length == 1) {
                            if (zlass[0] == Integer.class) {
                                methods[i].invoke(form, Integer.parseInt(queryParamNameValueArray[1]));
                            } else {
                                methods[i].invoke(form, queryParamNameValueArray[1]);
                            }

                        }
                    }
                }
            }
        }
    }

    public static void copyModeltoModel(Object src, Object des) {
        PropertyDescriptor[] pds = PropertyUtils.getPropertyDescriptors(des); // 得到to对象的字段属性集合
        for (int i = 0; i < pds.length; i++) {
            try {
                // 得到to对象的属性的类型
                String toClassName = ClassUtils.getShortClassName(pds[i].getPropertyType());
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

                if ("Class".equals(toClassName)) {
                    continue;
                } else {
                    // 得到form字段该字段的值 如果有值则赋值 否则继续下一个
                    // System.out.println("\n\n\n pds[i].getDisplayName()=" +
                    // pds[i].getDisplayName() + "\n\n\n");
                    Object o = PropertyUtils.getProperty(src, pds[i].getDisplayName());
                    if (o != null) {
                        if (toClassName.equals("Date") && fromClassName.equals("String")) { // 如果form该字段是字符串
                            // o = Helper.switchDate((String) o);
                            // BeanUtils.setProperty(des,
                            // pds[i].getDisplayName(), o);
                            ConvertUtilsBean convertUtils = new ConvertUtilsBean();
                            convertUtils.register(new DateConverter(), Date.class);
                            BeanUtilsBean beanUtils = new BeanUtilsBean(convertUtils, new PropertyUtilsBean());
                            o = Helper.switchDate((String) o);
                            beanUtils.setProperty(des, pds[i].getDisplayName(), o);
                        } else if (toClassName.equals("String") && fromClassName.equals("Date")) {
                            o = DateUtil.toStringByFormat((Date) o, "yyyy-MM-dd HH:mm:ss");
                            if (org.apache.commons.lang.StringUtils.contains((String) o, "00:00:00")) {
                                o =
                                        org.apache.commons.lang.StringUtils.substringBeforeLast((String) o, "00:00:00")
                                                .trim();
                            }
                            org.apache.commons.beanutils.BeanUtils.setProperty(des, pds[i].getDisplayName(), o);
                        } else if (toClassName.equals("Date") && fromClassName.equals("Date")) {
                            ConvertUtilsBean convertUtils = new ConvertUtilsBean();
                            convertUtils.register(new DateConverter(), Date.class);
                            BeanUtilsBean beanUtils = new BeanUtilsBean(convertUtils, new PropertyUtilsBean());
                            beanUtils.setProperty(des, pds[i].getDisplayName(), o);
                            // BeanUtils.setProperty(des,
                            // pds[i].getDisplayName(), o);
                        } else {
                            org.apache.commons.beanutils.BeanUtils.setProperty(des, pds[i].getDisplayName(), o);
                        }
                        // org.apache.commons.beanutils.BeanUtils.setProperty(des,pds[i].getDisplayName(),o);
                    }
                }
            } catch (Exception ex) {
                // System.out.println("赋值失败：" + ex);
            }
        }
    }

    public static Date switchDate(String str) {
        String format = null;
        if (Pattern
                .compile(
                        "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$")
                .matcher(str).find()) {
            format = "yyyy-MM-dd HH:mm:ss";
        } else if (Pattern
                .compile(
                        "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$")
                .matcher(str).find()) {
            format = "yyyy-MM-dd";
        } else if (Pattern
                .compile(
                        "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d$")
                .matcher(str).find()) {
            format = "yyyy-MM-dd HH:mm";
        } else {
            format = "EEE MMM dd HH:mm:ss zzz yyyy";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.US);
        try {
            return sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String replaceBlank(String str) {
        Pattern p = Pattern.compile("\\s*|\t|\r|\n");
        Matcher m = p.matcher(str);
        String after = m.replaceAll("");
        return after;
    }

}
