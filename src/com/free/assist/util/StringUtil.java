package com.free.assist.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

public class StringUtil {
    public StringUtil() {
    }

    public static boolean greateThan(String strf, String strt) {
        if (strf.compareTo(strt) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lessThan(String strf, String strt) {
        if (strf.compareTo(strt) < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean greatEqualThan(String strf, String strt) {
        if (strf.compareTo(strt) >= 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean lessEqualThan(String strf, String strt) {
        if (strf.compareTo(strt) <= 0) {
            return true;
        } else {
            return false;
        }
    }

    private static Object initLock = new Object();

    private static MessageDigest digest = null;

    private static final String commonWords[] = { "a", "and", "as", "at", "be", "do", "i", "if", "in", "is", "it",
            "so", "the", "to" };

    private static Map commonWordsMap = null;

    private static Random randGen = null;

    private static char numbersAndLetters[] = null;

    private static SimpleDateFormat datetimeformatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // private static SimpleDateFormat datetimeformatter = new
    // SimpleDateFormat("d-M月-yyyy HH:mm:ss");
    // 'DD-MON-YYYY HH24:MI:SS' '21-2月-2001 16:1:1'

    public static String datetimetostr(Date d, String sFormat) {
        if (d == null) {

            return "";

        } else {

            SimpleDateFormat dateformatter = new SimpleDateFormat(sFormat);
            String s = dateformatter.format(d);
            dateformatter = null;
            return s;
        }
    }

    public static String dateTimeToStr(Timestamp d, String sFormat) {
        if (d == null) {
            return "";
        } else {
            SimpleDateFormat dateformatter = new SimpleDateFormat(sFormat);
            String s = dateformatter.format(d);
            return s;
        }

    }

    public static Date strtodate(String s) {
        if (StringUtils.isBlank(s)) {
            return null;
        }
        Date date = null;
        try {
            date = new Date(datetimeformatter.parse(s).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static int str2num(String s) {
        if (s == null || "".equalsIgnoreCase(s)) {
            return -1;
        }
        if (StringUtils.isNumeric(s)) {
            return Integer.valueOf(s).intValue();
        } else {
            return -1;
        }
    }

    // 检测字符串是否存在中文字符

    public static boolean isChineseChar(String s) {
        boolean flag = false;
        if (s == null) {
            return true;
        }
        byte abyte0[] = s.getBytes();
        for (int i = 0; i < abyte0.length; i++) {
            if (abyte0[i] >= 0) {
                continue;
            }
            flag = true;
            break;
        }

        return flag;
    }

    // 把空字符串转换为empty

    public static final String nullToEmptyOfStr(String s) {
        if (s != null) {
            return s.trim();
        } else {
            return "";
        }
    }

    public static final String nullToEmptyOfObject(Object o) {
        if (o != null) {
            return o.toString();
        } else {
            return "";
        }
    }

    public static final String nullToEmptyOfObject(Object o, String defaultvalue) {
        if (o != null) {
            return o.toString();
        } else {
            return defaultvalue;
        }
    }

    public static final String nullOrEmptyToDefaultOfObject(Object o, String defaultvalue) {
        if (o != null && !"".equals(o)) {
            return o.toString();
        } else {
            return defaultvalue;
        }
    }

    public static final String escapeErrorChar(String s) {
        String s1 = null;
        s1 = s;
        if (s1 == null) {
            return s1;
        } else {
            s1 = replace(s1, "\\", "\\\\");
            s1 = replace(s1, "\"", "\\\"");
            return s1;
        }
    }

    // 检测字符串是否为数字串

    public static final boolean strIsDigital(String s) {
        boolean flag = false;
        boolean flag1 = true;
        char ac[] = s.toCharArray();
        for (int i = 0; i < ac.length;) {
            if (!Character.isDigit(ac[i])) {
                flag1 = false;
            }
            break;
        }

        return flag1;
    }

    // 检测身份证

    public static final boolean checkIdCard(String s, String s1) {
        boolean flag = true;
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        if (s.length() != 15 && s.length() != 18 || !isDate(s1)) {
            flag = false;
        } else if (s.length() == 15) {
            if (!strIsDigital(s)) {
                flag = false;
            } else {
                String s6 = "19" + s.substring(6, 8);
                String s8 = s.substring(8, 10);
                String s10 = s.substring(10, 12);
                String s12 = s6 + "-" + s8 + "-" + s10;
                if (!s12.equals(s1)) {
                    flag = false;
                }
            }
        } else if (s.substring(17, 18).equals("X") || s.substring(17, 18).equals("x")) {
            if (!strIsDigital(s.substring(0, 18))) {
                flag = false;
            }
        } else if (!strIsDigital(s)) {
            flag = false;
        } else {
            String s7 = s.substring(6, 10);
            String s9 = s.substring(10, 12);
            String s11 = s.substring(12, 14);
            String s13 = s7 + "-" + s9 + "-" + s11;
            if (!s13.equals(s1)) {
                flag = false;
            }
        }
        return flag;
    }

    // 日期判断

    public static boolean isDate(String s) {
        boolean flag = false;
        DateFormat dateformat = DateFormat.getDateInstance();
        if (s == null) {
            flag = false;
        }
        try {
            java.util.Date date = dateformat.parse(s);
            flag = true;
        } catch (Exception exception) {
            flag = false;
        }
        return flag;
    }

    public static String isInputError(int i, int j) {
        if ((i & j) > 0) {
            return "Error";
        } else {
            return "True";
        }
    }

    // 把字符串转换为向量

    public static Vector splite(String s, String s1) {
        Vector vector = new Vector();
        Object obj = null;
        Object obj1 = null;
        boolean flag = false;
        int i;
        for (; s.length() >= 0; s = s.substring(i + s1.length(), s.length())) {
            i = s.indexOf(s1);
            if (i < 0) {
                vector.addElement(s);
                break;
            }
            String s2 = s.substring(0, i);
            vector.addElement(s2);
        }

        return vector;
    }

    // 字符串替换 s 搜索字符串 s1 要查找字符串 s2 要替换字符串

    public static final String replace(String s, String s1, String s2) {
        if (s == null) {
            return null;
        }
        int i = 0;
        if ((i = s.indexOf(s1, i)) >= 0) {
            char ac[] = s.toCharArray();
            char ac1[] = s2.toCharArray();
            int j = s1.length();
            StringBuffer stringbuffer = new StringBuffer(ac.length);
            stringbuffer.append(ac, 0, i).append(ac1);
            i += j;
            int k;
            for (k = i; (i = s.indexOf(s1, i)) > 0; k = i) {
                stringbuffer.append(ac, k, i - k).append(ac1);
                i += j;
            }

            stringbuffer.append(ac, k, ac.length - k);
            return stringbuffer.toString();
        } else {
            return s;
        }
    }

    public static final String replaceIgnoreCase(String s, String s1, String s2) {
        if (s == null) {
            return null;
        }
        String s3 = s.toLowerCase();
        String s4 = s1.toLowerCase();
        int i = 0;
        if ((i = s3.indexOf(s4, i)) >= 0) {
            char ac[] = s.toCharArray();
            char ac1[] = s2.toCharArray();
            int j = s1.length();
            StringBuffer stringbuffer = new StringBuffer(ac.length);
            stringbuffer.append(ac, 0, i).append(ac1);
            i += j;
            int k;
            for (k = i; (i = s3.indexOf(s4, i)) > 0; k = i) {
                stringbuffer.append(ac, k, i - k).append(ac1);
                i += j;
            }

            stringbuffer.append(ac, k, ac.length - k);
            return stringbuffer.toString();
        } else {
            return s;
        }
    }

    public static final String replace(String s, String s1, String s2, int ai[]) {
        if (s == null) {
            return null;
        }
        int i = 0;
        if ((i = s.indexOf(s1, i)) >= 0) {
            int j = 0;
            j++;
            char ac[] = s.toCharArray();
            char ac1[] = s2.toCharArray();
            int k = s1.length();
            StringBuffer stringbuffer = new StringBuffer(ac.length);
            stringbuffer.append(ac, 0, i).append(ac1);
            i += k;
            int l;
            for (l = i; (i = s.indexOf(s1, i)) > 0; l = i) {
                j++;
                stringbuffer.append(ac, l, i - l).append(ac1);
                i += k;
            }

            stringbuffer.append(ac, l, ac.length - l);
            ai[0] = j;
            return stringbuffer.toString();
        } else {
            return s;
        }
    }

    public static final String formatInputStr(String s) {
        String s1 = s;
        s1 = nullToEmptyOfStr(s1);
        s1 = escapeHTMLTags(s1);
        return s1;
    }

    public static final String escapeHTMLTags(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        StringBuffer stringbuffer = new StringBuffer(s.length());
        byte byte0 = 32;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '<') {
                stringbuffer.append("&lt;");
            } else if (c == '>') {
                stringbuffer.append("&gt;");
            } else {
                stringbuffer.append(c);
            }
        }

        return stringbuffer.toString();
    }

    public static final synchronized String hash(String s) {
        if (digest == null) {
            try {
                digest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException nosuchalgorithmexception) {
                System.err.println("Failed to load the MD5 MessageDigest. Jive will be unable to function normally.");
                nosuchalgorithmexception.printStackTrace();
            }
        }
        digest.update(s.getBytes());
        return toHex(digest.digest());
    }

    public static final String toHex(byte abyte0[]) {
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 2);
        for (int i = 0; i < abyte0.length; i++) {
            if ((abyte0[i] & 0xff) < 16) {
                stringbuffer.append("0");
            }
            stringbuffer.append(Long.toString(abyte0[i] & 0xff, 16));
        }

        return stringbuffer.toString();
    }

    public static final String[] toLowerCaseWordArray(String s) {
        if (s == null || s.length() == 0) {
            return new String[0];
        }
        StringTokenizer stringtokenizer = new StringTokenizer(s, " ,\r\n.:/\\+");
        String as[] = new String[stringtokenizer.countTokens()];
        for (int i = 0; i < as.length; i++) {
            as[i] = stringtokenizer.nextToken().toLowerCase();
        }

        return as;
    }

    public static final String[] removeCommonWords(String as[]) {
        if (commonWordsMap == null) {
            synchronized (initLock) {
                if (commonWordsMap == null) {
                    commonWordsMap = new HashMap();
                    for (int i = 0; i < commonWords.length; i++) {
                        commonWordsMap.put(commonWords[i], commonWords[i]);
                    }

                }
            }
        }
        ArrayList arraylist = new ArrayList(as.length);
        for (int j = 0; j < as.length; j++) {
            if (!commonWordsMap.containsKey(as[j])) {
                arraylist.add(as[j]);
            }
        }

        return (String[]) arraylist.toArray(new String[arraylist.size()]);
    }

    public static final String randomString(int i) {
        if (i < 1) {
            return null;
        }
        if (randGen == null) {
            synchronized (initLock) {
                if (randGen == null) {
                    randGen = new Random();
                    numbersAndLetters =
                            "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                }
            }
        }
        char ac[] = new char[i];
        for (int j = 0; j < ac.length; j++) {
            ac[j] = numbersAndLetters[randGen.nextInt(71)];
        }

        return new String(ac);
    }

    public static final String chopAtWord(String s, int i) {
        if (s == null) {
            return s;
        }
        char ac[] = s.toCharArray();
        int j = s.length();
        if (i < j) {
            j = i;
        }
        for (int k = 0; k < j - 1; k++) {
            if (ac[k] == '\r' && ac[k + 1] == '\n') {
                return s.substring(0, k);
            }
            if (ac[k] == '\n') {
                return s.substring(0, k);
            }
        }

        if (ac[j - 1] == '\n') {
            return s.substring(0, j - 1);
        }
        if (s.length() < i) {
            return s;
        }
        for (int l = i - 1; l > 0; l--) {
            if (ac[l] == ' ') {
                return s.substring(0, l).trim();
            }
        }

        return s.substring(0, i);
    }

    public static final String highlightWords(String s, String as[], String s1, String s2) {
        if (s == null || as == null || s1 == null || s2 == null) {
            return null;
        }
        for (int i = 0; i < as.length; i++) {
            String s3 = s.toLowerCase();
            char ac[] = s.toCharArray();
            String s4 = as[i].toLowerCase();
            int j = 0;
            if ((j = s3.indexOf(s4, j)) >= 0) {
                int k = s4.length();
                StringBuffer stringbuffer = new StringBuffer(ac.length);
                boolean flag = false;
                char c = ' ';
                if (j - 1 > 0) {
                    c = ac[j - 1];
                    if (!Character.isLetter(c)) {
                        flag = true;
                    }
                }
                boolean flag1 = false;
                char c1 = ' ';
                if (j + k < ac.length) {
                    c1 = ac[j + k];
                    if (!Character.isLetter(c1)) {
                        flag1 = true;
                    }
                }
                if (flag && flag1 || j == 0 && flag1) {
                    stringbuffer.append(ac, 0, j);
                    if (flag && c == ' ') {
                        stringbuffer.append(c);
                    }
                    stringbuffer.append(s1);
                    stringbuffer.append(ac, j, k).append(s2);
                    if (flag1 && c1 == ' ') {
                        stringbuffer.append(c1);
                    }
                } else {
                    stringbuffer.append(ac, 0, j);
                    stringbuffer.append(ac, j, k);
                }
                j += k;
                int l;
                for (l = j; (j = s3.indexOf(s4, j)) > 0; l = j) {
                    boolean flag2 = false;
                    char c2 = ac[j - 1];
                    if (!Character.isLetter(c2)) {
                        flag2 = true;
                    }
                    boolean flag3 = false;
                    if (j + k < ac.length) {
                        c1 = ac[j + k];
                        if (!Character.isLetter(c1)) {
                            flag3 = true;
                        }
                    }
                    if (flag2 && flag3 || j + k == ac.length) {
                        stringbuffer.append(ac, l, j - l);
                        if (flag2 && c2 == ' ') {
                            stringbuffer.append(c2);
                        }
                        stringbuffer.append(s1);
                        stringbuffer.append(ac, j, k).append(s2);
                        if (flag3 && c1 == ' ') {
                            stringbuffer.append(c1);
                        }
                    } else {
                        stringbuffer.append(ac, l, j - l);
                        stringbuffer.append(ac, j, k);
                    }
                    j += k;
                }

                stringbuffer.append(ac, l, ac.length - l);
                s = stringbuffer.toString();
            }
        }

        return s;
    }

    public static final String escapeForXML(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        char ac[] = s.toCharArray();
        StringBuffer stringbuffer = new StringBuffer(ac.length);
        for (int i = 0; i < ac.length; i++) {
            char c = ac[i];
            if (c == '<') {
                stringbuffer.append("&lt;");
            } else if (c == '>') {
                stringbuffer.append("&gt;");
            } else if (c == '"') {
                stringbuffer.append("&quot;");
            } else if (c == '&') {
                stringbuffer.append("&amp;");
            } else {
                stringbuffer.append(c);
            }
        }

        return stringbuffer.toString();
    }

    public static final String unescapeFromXML(String s) {
        s = replace(s, "&lt;", "<");
        s = replace(s, "&gt;", ">");
        s = replace(s, "&amp;", "&");
        return replace(s, "&quot;", "\"");
    }

    public static final String formatTextArea(String s, int i) {
        if (s == null) {
            return "";
        }
        String s1 = s.trim();
        Vector vector = null;
        int j = i;
        s1 = s1 + "\n";
        vector = splite(s1, "\n");
        boolean flag = false;
        boolean flag1 = false;
        String s2 = "";
        String s4 = "";
        String s6 = "";
        char ac[] = s1.toCharArray();
        StringBuffer stringbuffer = new StringBuffer(ac.length);
        for (int k = 0; k < vector.size() - 1; k++) {
            String s5 = vector.elementAt(k).toString();
            s5 = replace(s5, "\r", "");
            if (s5.length() > j) {
                String s7 = s5;
                for (int l = 0; l < s5.length() / j; l++) {
                    String s3 = s7.substring(0, j) + "\n";
                    stringbuffer.append(s3.toCharArray(), 0, s3.toCharArray().length);
                    s7 = s7.substring(j, s7.length());
                }

                stringbuffer.append((s7 + "\n").toCharArray(), 0, (s7 + "\n").toCharArray().length);
            } else {
                stringbuffer.append((s5 + "\n").toCharArray(), 0, (s5 + "\n").toCharArray().length);
            }
        }

        return stringbuffer.toString().trim();
    }

    /**
     * author wjun
     *
     * @param value
     *            原值
     * @param precision
     *            小数精度
     * @return
     */
    public static String doubleToString(double value, int precision) {
        String val = Double.toString(value);
        if (val.indexOf(".") > 0) { // 如果有小数点,就按精度来取
            if ((val.substring(val.indexOf("."))).length() >= precision) { // 如果小数点位数大于精度，则按精度来取
                double add = 0.5; // 附加值，用于四舍五入
                for (int i = 0; i < precision; i++) {
                    add = add / 10;
                }
                double resource = value + add;
                String res = Double.toString(resource);
                String pre = res.substring(0, res.indexOf("."));
                String post = res.substring(res.indexOf("."), res.indexOf(".") + 1 + precision);
                val = pre + post;
            }
        }
        return val;
    }

    public static final String toChinese(String m_str) {
        String return_str = "";
        try {
            byte m_bstr[] = m_str.getBytes("8859_1");
            return_str = new String(m_bstr, "GBK");
        } catch (Exception e) {
            System.err.println("toChinese error caught: ".concat(String.valueOf(String.valueOf(e.getMessage()))));
        }
        return return_str;
    }

    public static final String toGB2312(String m_str) {
        String return_str = "";
        try {
            byte m_bstr[] = m_str.getBytes("8859_1");
            return_str = new String(m_bstr, "GB2312");
        } catch (Exception e) {
            System.err.println("toChinese error caught: ".concat(String.valueOf(String.valueOf(e.getMessage()))));
        }
        return return_str;
    }

    public static final String toBig5(String m_str) {
        String return_str = "";
        try {
            byte m_bstr[] = m_str.getBytes("8859_1");
            return_str = new String(m_bstr, "Big5");
        } catch (Exception e) {
            System.err.println("toBig5 error caught: ".concat(String.valueOf(String.valueOf(e.getMessage()))));
        }
        return return_str;
    }

    public static final String toISO8859(String m_str) {
        String return_str = "";
        try {
            byte m_bstr[] = m_str.getBytes("GB2312");
            return_str = new String(m_bstr, "8859_1");
        } catch (Exception e) {
            System.err.println("toChinese error caught: ".concat(String.valueOf(String.valueOf(e.getMessage()))));
        }
        return return_str;
    }

    /**
     * 取得字符串str在字符串src中出现第times次的位置 如果字符串str在字符串src中出现的次数少于times次,则返回-1
     * 否则返回具体的位置
     *
     * @param src
     * @param str
     * @param times
     * @return
     */
    public static int index(final String src, final String str, final int times) {
        int index = -1;
        int from = 0;
        if (times != 0) {
            for (int i = 0; i < times; i++) {
                index = src.indexOf(str, from);
                if (index != -1) {
                    from = index + str.length();
                } else {
                    break;
                }
                if (from >= src.length() && i < times - 1) {
                    index = -1;
                    break;
                }
            }
        } else {
            index = 0;
        }
        return index;
    }

    /**
     * 分隔字符串，连续分隔符之间的用空表示 例如：字符串“a||b|c"，返回结果为"a","","b","c"
     *
     * @param src
     * @param regex
     * @return
     */
    public static String[] splitIncludeEmpty(String src, String regex) {
        if (src != null) {
            ArrayList list = new ArrayList();
            int from = 0;
            int to = 0;
            String[] result = null;
            while (from < src.length()) {
                to = src.indexOf(regex, from);
                if (to != -1) {
                    // if (to == 0) {
                    // from += regex.length();
                    // } else {
                    list.add(src.substring(from, to));
                    from = to + regex.length();
                    // }
                } else {
                    list.add(src.substring(from));
                    from = src.length();
                }
            }

            result = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = (String) list.get(i);
            }

            return result;
        } else {
            return null;
        }
    }

    /**
     * 分隔字符串，连续分隔符之间没内容时忽略 例如：字符串“a||b|c"，返回结果为"a","b","c"
     *
     * @param src
     * @param regex
     * @return
     */
    public static String[] split(String src, String regex) {
        if (src != null) {
            ArrayList list = new ArrayList();
            int from = 0;
            int to = 0;
            String[] result = null;
            while (from < src.length()) {
                to = src.indexOf(regex, from);
                if (to != -1) {
                    if (to == from) {
                        from += regex.length();
                    } else {
                        list.add(src.substring(from, to));
                        from = to + regex.length();
                    }
                } else {
                    list.add(src.substring(from));
                    from = src.length();
                }
            }

            result = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = (String) list.get(i);
            }

            return result;
        } else {
            return null;
        }
    }

    /**
     * 把字符串src以regex出现times次的间隔分成数组 例如
     * src="a|b|c|d|e",regex="|",times=2,则返回的数组为{"a|b|","c|d|","e"}
     *
     * @param src
     * @param regex
     * @param times
     * @return
     */
    public static String[] split(String src, String regex, int times) {
        String[] result = null;

        ArrayList list = new ArrayList();
        if (times > 0) {
            int from = 0;
            int to = 0;
            int index = times;
            while (from < src.length() && to != -1) {
                to = index(src, regex, index);
                if (to != -1) {
                    list.add(src.substring(from, to + regex.length()));
                    from = to + regex.length();
                    index += times;
                } else {
                    list.add(src.substring(from));
                }
            }
            result = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = (String) list.get(i);
            }
        } else {
            result = new String[] { src };
        }
        return result;
    }

    /**
     * 高亮内容
     *
     * @param content
     * @param lightString
     * @param color
     * @param max
     * @param containLenght
     * @return
     */
    public static String highLightString(String content, String lightString, String color, int max, int containLenght) {
        String resultString = null;
        if (content != null) {
            int length = content.length();
            if (lightString != null && !lightString.trim().equals("")) {
                lightString = lightString.trim();
                int index = -1;
                int start = 0;
                int end = 0;
                StringBuffer sb = new StringBuffer();
                boolean fullIndex = true;
                for (int i = 0; i < max; i++) {
                    if (fullIndex) {
                        index = content.indexOf(lightString, start);
                        if (index != -1) {
                            start = index - containLenght;
                            end = index + lightString.length() + containLenght;
                            String fetchString = content.substring(start > 0 ? start : 0, end > length ? length : end);
                            sb.append(fetchString.replaceAll(lightString, "<font color='" + color + "'>" + lightString
                                    + "</font>"));
                            if (end < length) {
                                sb.append("...");
                            }
                            start = end;
                            if (start >= length) {
                                break;
                            }
                        } else {
                            fullIndex = false;
                        }
                    } else {
                        String[] subLightString = split(lightString, " ");
                        int total = i;
                        for (int m = 0; m < subLightString.length; m++) {
                            String sub = subLightString[m].trim();
                            for (int j = max; j >= total - 1; j--) {
                                index = content.indexOf(sub, start);
                                if (index != -1) {
                                    start = index - containLenght;
                                    end = index + sub.length() + containLenght;
                                    String fetchString =
                                            content.substring(start > 0 ? start : 0, end > length ? length : end);
                                    sb.append(fetchString.replaceAll(sub, "<font color='" + color + "'>" + sub
                                            + "</font>"));
                                    if (end < length) {
                                        sb.append("...");
                                    }
                                    start = end;
                                    total++;
                                    if (start >= length) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (total > max) {
                                break;
                            }
                        }
                        i = total;
                    }
                }
                resultString = sb.toString();
            } else {
                if (length > 50) {
                    resultString = content.substring(0, 50);
                } else {
                    resultString = content;
                }
            }
        }
        return resultString;
    }

    public static String changeGBKtoUTF8(String str) {
        try {
            return new String(str.getBytes("GBK"), "utf-8");
        } catch (UnsupportedEncodingException ex) {
            return null;
        }
    }

    public static List splitStringtoList(String str) {
        List list = new ArrayList();
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                list.add(i, str.substring(i, i + 1));
            }
        }
        return list;
    }

    /**
     * 根据一个字符串分别得到所有的中文 英文 数字 和其它
     *
     * @param str
     *            String
     * @return Map
     */
    public static Map getCn_En_Num_Oth(String str) {
        Map map = new HashMap();
        String CN = "";
        String EN = "";
        String NUM = "";
        String OTH = "";
        String End = null;
        if (str != null) {
            List list = StringUtil.splitStringtoList(str.trim());
            for (int i = 0; i < list.size(); i++) {
                String temp = (String) list.get(i);
                if (StringUtil.isChineseChar(temp)) {
                    CN += temp;
                } else if (StringUtils.isAlpha(temp)) {
                    EN += temp;
                } else if (StringUtils.isNumeric(temp)) {
                    NUM += temp;
                } else {
                    OTH += temp;
                }
            }
            if (list.size() >= 1) {
                if (list.get(list.size() - 1) != null) {
                    String temp = (String) list.get(list.size() - 1);
                    if (StringUtil.isChineseChar(temp)) {
                        End = "CN";
                    } else if (StringUtils.isAlpha(temp)) {
                        End = "EN";
                    } else if (StringUtils.isNumeric(temp)) {
                        End = "NUM";
                    } else {
                        End = "OTH";
                    }
                }
            }
        }
        map.put("CN", CN);
        map.put("EN", EN);
        map.put("NUM", NUM);
        map.put("OTH", OTH);
        map.put("END", End);
        return map;
    }

    public static String getEnFromStr(String str) {
        String EN = "";
        if (str != null) {
            List list = StringUtil.splitStringtoList(str.trim());
            for (int i = 0; i < list.size(); i++) {
                String temp = (String) list.get(i);
                if (StringUtil.isChineseChar(temp) || StringUtils.isAlpha(temp)) {
                    EN += temp;
                }
            }
        }
        return EN;
    }

    public static String escape(String src) {
        int i;
        char j;
        StringBuffer tmp = new StringBuffer();
        tmp.ensureCapacity(src.length() * 6);
        for (i = 0; i < src.length(); i++) {
            j = src.charAt(i);
            if (Character.isDigit(j) || Character.isLowerCase(j) || Character.isUpperCase(j)) {
                tmp.append(j);
            } else if (j < 256) {
                tmp.append("%");
                if (j < 16) {
                    tmp.append("0");
                }
                tmp.append(Integer.toString(j, 16));
            } else {
                tmp.append("%u");
                tmp.append(Integer.toString(j, 16));
            }
        }
        return tmp.toString();
    }

    public static String unescape(String src) {
        StringBuffer tmp = new StringBuffer();
        tmp.ensureCapacity(src.length());
        int lastPos = 0, pos = 0;
        char ch;
        while (lastPos < src.length()) {
            pos = src.indexOf("%", lastPos);
            if (pos == lastPos) {
                if (src.charAt(pos + 1) == 'u') {
                    ch = (char) Integer.parseInt(src.substring(pos + 2, pos + 6), 16);
                    tmp.append(ch);
                    lastPos = pos + 6;
                } else {
                    ch = (char) Integer.parseInt(src.substring(pos + 1, pos + 3), 16);
                    tmp.append(ch);
                    lastPos = pos + 3;
                }
            } else {
                if (pos == -1) {
                    tmp.append(src.substring(lastPos));
                    lastPos = src.length();
                } else {
                    tmp.append(src.substring(lastPos, pos));
                    lastPos = pos;
                }
            }
        }
        return tmp.toString();
    }

    public static boolean isDouble(String s) {
        try {
            double d = Double.valueOf(s).doubleValue();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isTime(String str) {
        if (str == null)
            return false;
        return Pattern.compile("(20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$").matcher(str).find();
    }

    public static boolean isNumeric(String s) {
        if ((s != null) && (!s.equals("")))
            return s.matches("^[0-9]*$");
        else
            return false;
    }

    public static boolean isDateTimeFormat(String str) {
        if (str == null)
            return false;
        return Pattern
                .compile(
                        "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$")
                .matcher(str).find();
    }

    public static boolean isDateTFormat(String str) {
        if (str == null)
            return false;
        return Pattern
                .compile(
                        "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d$")
                .matcher(str).find();
    }

    public static boolean isDateFormat(String str) {
        if (str == null)
            return false;
        return Pattern
                .compile(
                        "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$")
                .matcher(str).find();
    }

    public static boolean isMinuteTimeFormat(String str) {
        if (str == null)
            return false;
        return Pattern
                .compile(
                        "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d$")
                .matcher(str).find();
    }

    /**
     * 返回字符串的首字母转为大写的字符串
     *
     * @param string
     * @return
     */
    public static String toFirstLetterUppcase(String string) {
        if (string == null) {
            return null;
        }
        String name = string.trim();
        if (name.length() > 1) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
        } else {
            name = name.toUpperCase();
        }
        return name;
    }

    /**
     * 返回字符串的首字母转为小写的字符串
     *
     * @param string
     * @return
     */
    public static String toFirstLetterLowercase(String string) {
        if (string == null) {
            return null;
        }
        String name = string.trim();
        if (name.length() > 1) {
            name = name.substring(0, 1).toLowerCase() + name.substring(1);
        } else {
            name = name.toUpperCase();
        }
        return name;
    }

    public static boolean isUperCase(String str) {
        Pattern p = Pattern.compile("[A-Z]+");
        Matcher m = p.matcher(str);
        return m.find(0);
    }

    public static boolean isLowerCase(String str) {
        Pattern p = Pattern.compile("[a-z]+");
        Matcher m = p.matcher(str);
        return m.find(0);
    }

    public static String transerDBFieldToJavaFiled(String field) {
        field = field.toLowerCase();
        String[] str = field.split("");
        String keyChange = "";
        boolean flag = false;
        for (String temp : str) {
            if ("".equalsIgnoreCase(temp))
                continue;
            if (flag) {
                temp = temp.toUpperCase();
                flag = false;
            }
            if ("_".equalsIgnoreCase(temp)) {
                flag = true;
                continue;
            }
            keyChange += temp;
        }
        return keyChange;
    }

    public static String transerXMLFieldToJavaFiled(String field) {
        field = StringUtils.replace(field, "_", "");
        String name = field.trim();
        if (name.length() > 1) {
            name = name.substring(0, 1).toLowerCase() + name.substring(1);
        } else {
            name = name.toLowerCase();
        }
        return name;
    }

    public static String transerJavaFieldToDbField(String field) {
        String[] str = field.split("");
        String keyChange = "";
        for (String temp : str) {
            if ("".equalsIgnoreCase(temp))
                continue;
            if (StringUtil.isUperCase(temp)) {
                keyChange += "_";
            }
            keyChange += temp;
        }
        return keyChange;
    }

    /**
     * @see字符转换函数 如果字符串为null,返回为空,否则返回该字符串
     * @param Object
     * @return String
     */
    public static String nullObject2String(Object s) {
        String str = "";
        try {
            str = s.toString();
        } catch (Exception e) {
            str = "";
        }
        return str;
    }

    /**
     * 功能描述：将字符串转换为int型数据
     *
     * @param srcStr：待转换的源字符串
     * @author 戈亮锋
     * @version 2009-7-29 11:36:40
     * @return int： 将字符串转换为int型的数值
     */
    public static int toIntFromString(String srcStr) {
        if (srcStr == null || srcStr.equals("")) {
            return 0;
        }
        int ret = 0;
        try {
            ret = Integer.parseInt(srcStr.trim());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.err.println("Formate String to int failed!!!");
            return 0;
        }
        return ret;
    }

    /**
     * 功能描述：将字符串转换为float型数据
     *
     * @param srcStr：待转换的源字符串
     * @author 戈亮锋
     * @version 2009-8-25 17:30:59
     * @return float
     */
    public static float toFloatFromString(String srcStr) {
        if (srcStr == null || srcStr.equals("")) {
            return 0f;
        }
        float ret = 0f;
        try {
            ret = Float.parseFloat(srcStr.trim());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.err.println("Formate String to float failed!!!");
            return 0f;
        }
        return ret;
    }

    public static void main(String[] args) {
        String str = "A/f-";
        System.out.println(StringUtil.isChineseChar(str));
    }

    public static String padLeft(String s, int length) {
        byte[] bs = new byte[length];
        byte[] ss = s.getBytes();
        Arrays.fill(bs, (byte) (48 & 0xff));
        System.arraycopy(ss, 0, bs, length - ss.length, ss.length);
        return new String(bs);
    }

}
