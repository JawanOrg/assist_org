package com.free.assist.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

/**
 * Created by IntelliJ IDEA. User: Hanjun Date: 2007-1-13 Time: 10:12:47 To
 * change this template use File | Settings | File Templates.
 */
public class DateUtil {
	public static final int			SECOND				= 1000;

	public static final int			MINUTE				= SECOND * 60;

	public static final int			HOUR				= MINUTE * 60;

	public static final int			DAY					= HOUR * 24;

	public static final int			WEEK				= DAY * 7;

	public static final int			YEAR				= DAY * 365;					// or
																						// 366
																						// ???

	private static final String		DEF_OUT_FORMAT		= "yyyy-MM-dd";

	private static SimpleDateFormat	datetimeformatter1	= new SimpleDateFormat(
																"yyyy-MM-dd HH:mm:ss");

	private static SimpleDateFormat	datetimeformatter	= new SimpleDateFormat(
																"yyyy/MM/dd HH:mm:ss");

    /**
	 * 一天中的天数
	 */
	public static long millionSecondsOfDay = 86400000;

	/**
	 * 得到日期的前后几天
	 * 
	 * @param date
	 * @param i
	 * @return
	 */
	public static Date getDate(Date date, int i) {
		// long seconds = date.getTime() + i * 86400000;

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, i);

		return calendar.getTime();

	}

	/**
	 * 得到日期的前后小时
	 * 
	 * @param date
	 * @param
	 * @return
	 */
	public static Date getDateByHour(Date date, int hour) {
		// long seconds = date.getTime() + i * 86400000;

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR, hour);

		return calendar.getTime();

	}
	
	/**
	 * 得到日期的前后分钟
	 * 
	 * @param date
	 * @param
	 * @return
	 */
	public static Date getDateByMinute(Date date, int min) {
		// long seconds = date.getTime() + i * 86400000;

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, min);

		return calendar.getTime();

	}

	/**
	 * 得到两个日期之间的天数,两头不算,取出数据后，可以根据需要再加
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int getDay(Date date1, Date date2) {
		return (int) ((date2.getTime() - date1.getTime()) / millionSecondsOfDay);
	}
	
	/**
	 * 取出2个日期间的天数,只要日期有间隔就算1天
	 * @param from
	 * @param to
	 * @return
	 */
	public static int getDaysBetween(Date from, Date to) {
		Calendar d1 = Calendar.getInstance();
		d1.setTime(from);
		Calendar d2 = Calendar.getInstance();
		d2.setTime(to);
		if (d1.after(d2)) { // swap dates so that d1 is start and d2 is end
			java.util.Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}
		int days = d2.get(java.util.Calendar.DAY_OF_YEAR)
				- d1.get(java.util.Calendar.DAY_OF_YEAR);
		int y2 = d2.get(java.util.Calendar.YEAR);
		if (d1.get(java.util.Calendar.YEAR) != y2) {
			d1 = (java.util.Calendar) d1.clone();
			do {
				days += d1.getActualMaximum(java.util.Calendar.DAY_OF_YEAR);
				d1.add(java.util.Calendar.YEAR, 1);
			} while (d1.get(java.util.Calendar.YEAR) != y2);
		}
		return days;
	}
	
	/**
	 * 得到两个日期之间的天数,两头不算,取出数据后，可以根据需要再加
	 * date2-date1
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int getDaysBetweenDate(Date date1, Date date2) {
    	Calendar c1 = Calendar.getInstance();
		c1.setTime(date1);		
		Calendar c2 = Calendar.getInstance();
		c2.setTime(date2);
        return (int)( c2.getTimeInMillis()-c1.getTimeInMillis() )/(60000*60*24);
	}
	
	/**
	 * 得到两个日期之间的小时数,两头不算,取出数据后，可以根据需要再加
	 * date2-date1
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int getHoursBetweenDate(Date date1, Date date2) {
    	Calendar c1 = Calendar.getInstance();
		c1.setTime(date1);		
		Calendar c2 = Calendar.getInstance();
		c2.setTime(date2);
        return (int)( c2.getTimeInMillis()-c1.getTimeInMillis() )/(60000*60);
	}
	
	/**
	 * 得到两个日期之间的分钟数,两头不算,取出数据后，可以根据需要再加
	 * date2-date1
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int getMinituesBetweenDate(Date date1, Date date2) {
    	Calendar c1 = Calendar.getInstance();
		c1.setTime(date1);		
		Calendar c2 = Calendar.getInstance();
		c2.setTime(date2);
        return (int)( c2.getTimeInMillis()-c1.getTimeInMillis() )/(60000);
	}
	
	/**
	 * 得到两个日期之间的秒数,两头不算,取出数据后，可以根据需要再加
	 * date2-date1
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int getSecondsBetweenDate(Date date1, Date date2) {
    	Calendar c1 = Calendar.getInstance();
		c1.setTime(date1);		
		Calendar c2 = Calendar.getInstance();
		c2.setTime(date2);
        return (int)( c2.getTimeInMillis()-c1.getTimeInMillis() )/(1000);
	}
	
	/**
	 * addMonth个月后的同一天，如果当前日，大约目标月的最大日，则制定系统将调整成目标月的最后一天
	 * @param date
	 * @param addMonth
	 * @return
	 */
	public static Date addMinitues(Date date, int min){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, min);
		return calendar.getTime();
	}
	
	/**
	 * addMonth个月后的同一天，如果当前日，大约目标月的最大日，则制定系统将调整成目标月的最后一天
	 * @param date
	 * @param addMonth
	 * @return
	 */
	public static Date addHours(Date date, int hour){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR, hour);
		return calendar.getTime();
	}

	/**
	 * 根据日期取出是星期几
	 * 
	 * @param date
	 *            Date
	 * @return int 返回1-7
	 */
	public static int getWeekOfDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return (calendar.get(Calendar.DAY_OF_WEEK) - 1) == 0 ? 7 : calendar.get(Calendar.DAY_OF_WEEK) - 1;
	}

	/**
	 * 根据 年 月 得到这个月的天数
	 * 
	 * @param year
	 *            int
	 * @param month
	 *            int
	 * @param
	 * @return int
	 */
	public static int getDaysOfMonth(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);
		int monthDays = calendar.getActualMaximum(Calendar.DATE);
		return monthDays;
	}

	public static int getDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	public static int getMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) + 1;
	}

	public static int getYearOfDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	public static int getMonthOfDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) + 1;
	}

	public static java.sql.Date getSqlDate(Date date) {
		return new java.sql.Date(date.getTime());
	}

	/**
	 * 取得没有时间的日期格式为 yyyy-mm-dd
	 * 
	 * @param date
	 *            Date
	 * @return Date
	 */
	public static Date getDate(Date date) {
		String str = dateToString(date);
		return getDate(str);

	}
	
	public static List<Date> getDateList(Date date1, Date date2) {
		int day = getDay(date1, date2);

		List dates = new ArrayList();

		for (int i = 0; i <= day; i++) {
			Date date = getDate(date1, i);
			dates.add(date);
		}
		return dates;
	}

	public static List<String> getDates(Date date1, Date date2) {
		int day = getDay(date1, date2);

		List dates = new ArrayList();

		for (int i = 0; i <= day; i++) {
			Date date = getDate(date1, i);
			dates.add(toStringByFormat(date, "yyyy-MM-dd"));
		}
		return dates;
	}

	public static List<String> getFormatDates(Date date1, Date date2, String format) {
		int day = getDay(date1, date2);

		List dates = new ArrayList();

		for (int i = 0; i <= day; i++) {
			Date date = getDate(date1, i);
			dates.add(toStringByFormat(date, format));
		}
		return dates;
	}

	/**
	 * 产生唯一日期时间序列
	 * 
	 * @param
	 * @return String
	 */
	public static String getUniueTimeString() {
		return String.valueOf(Calendar.getInstance().getTimeInMillis());
	}

	public static String dateToString(Date date) {
		if (date == null) {
			return "";
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String tmpStr = "";
		if (date != null) {
			tmpStr = sdf.format(date);
		}

		return tmpStr;
	}
	public static String datetimeToStringHour(Date date) {
		if (date == null) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH");
		String tmpStr = "";
		if (date != null) {
			tmpStr = sdf.format(date);
		}

		return tmpStr;
	}

	public static String datetimeToString(Date date) {
		if (date == null) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String tmpStr = "";
		if (date != null) {
			tmpStr = sdf.format(date);
		}

		return tmpStr;
	}

	public static String datetimesToString(Date date) {
		if (date == null) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String tmpStr = "";
		if (date != null) {
			tmpStr = sdf.format(date);
		}

		return tmpStr;
	}

	public static String toStringByFormat(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String tmpStr = "";
		if (date != null) {
			tmpStr = sdf.format(date);
		}

		return tmpStr;
	}

	public static Date toDateByFormat(String str, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Date stringToDate(String str) {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Date stringToDateTime(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			// e.printStackTrace();
			return null;
		}
	}

	public static Date stringToDatetime(String str) {
		if (str == null) {
			return null;
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			// e.printStackTrace();
			return null;
		}
	}
	
	public static Date strtodate1(String s) throws ParseException {
		try {
			Date date = new Date(datetimeformatter1.parse(s).getTime());
			return date;
		} catch (ParseException e) {
			//e.printStackTrace();
			Date date1 = new Date(datetimeformatter.parse(s).getTime());
			return date1;
		}

	}
	
	public static java.sql.Date strtosqldate1(String s) {
		try {
			java.sql.Date date = new java.sql.Date(datetimeformatter1.parse(s).getTime());
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			java.sql.Date date1 = (java.sql.Date) new Date();
			return date1;
		}

	}

	public static Date getDate(String str) {
		if (str == null || str.equals("")) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			// e.printStackTrace();
			return null;
		}

	}
	
	public static boolean isDate(String str) {
		if (str == null || str.equals("")) {
			return false;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			sdf.parse(str);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	public static String getTimeString(int duration) {
		int hours = duration / DateUtil.HOUR;
		int remain = duration - (hours * DateUtil.HOUR);
		int minutes = remain / DateUtil.MINUTE;
		StringBuffer time = new StringBuffer(64);
		if (hours != 0) {
			if (hours == 1) {
				time.append("1 hour and ");
			} else {
				time.append(hours).append(" hours and ");
			}
		}
		if (minutes == 1) {
			time.append("1 minute");
		} else {
			// what if minutes == 0 ???
			time.append(minutes).append(" minute(s)");
		}
		return time.toString();
	}

	/**
	 * 日期比较小于等于
	 * f<=t
	 * @param
	 */
	public static boolean beforeEqual(Date f, Date t) {		
		if(f.compareTo(t)<=0){
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 日期比较 大于等于
	 * 
	 * @param
	 */
	public static boolean afterEqual(Date f, Date t) {
		if(f.compareTo(t)>=0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean between(Date d, Date s, Date e) {
		if (d.before(e) && d.after(s)) {
			return true;
		} else {
			return false;
		}
	}

       /**
    * 获得当天日期
    * @return yyyy-mm-dd
    */
   public static String getCurrentDateStr()
   {
      String curDateStr = "";

      Calendar cal = Calendar.getInstance();
      int year  = cal.get(Calendar.YEAR);
      int month = cal.get(Calendar.MONTH) + 1;
      int day   = cal.get(Calendar.DAY_OF_MONTH);

      curDateStr  = String.valueOf(year) + "-";
      curDateStr += ( (month < 10) ? "0" + String.valueOf(month) : String.valueOf(month)) + "-";
      curDateStr += ( (day < 10) ? "0" + String.valueOf(day) : String.valueOf(day));

      return curDateStr;
   }


       /**
    * 获得当天月份
    * @return yyyy-mm
    */
   public static String getCurrentMonthStr()
   {
      String curDateStr = "";

      Calendar cal = Calendar.getInstance();
      int year  = cal.get(Calendar.YEAR);
      int month = cal.get(Calendar.MONTH) + 1;
      int day   = cal.get(Calendar.DAY_OF_MONTH);

      curDateStr  = String.valueOf(year) + "-";
      curDateStr += ( (month < 10) ? "0" + String.valueOf(month) : String.valueOf(month));

      return curDateStr;
   }
    	public static String format(Date date, String outFormat) {
		return format(date, outFormat, Locale.ENGLISH);
	}
    	public static String format(Date date, String outFormat, Locale locale) {
		if (outFormat == null || "".compareTo(outFormat) == 0) {
			outFormat = DEF_OUT_FORMAT;
		}
		SimpleDateFormat outDateFormat = null;
		if (locale == null) {
			outDateFormat = new SimpleDateFormat(outFormat, Locale.ENGLISH);
		} else {
			outDateFormat = new SimpleDateFormat(outFormat, locale);
		}
		String outDate = outDateFormat.format(date);
		return outDate;
	}

    public static Date getBeforetime(Date date, int interval) {
        GregorianCalendar gca = new GregorianCalendar();
        gca.setTime(date);
        gca.add(GregorianCalendar.MONTH, (-1) * interval);
        return gca.getTime();
    }

    //得到当前时间对应的前一个月时间
    public static String getBeforetime(Date date) {
        return format(getBeforetime(date, 1), DEF_OUT_FORMAT);
    }
    
    /**
     * 得到当前时间对应的之后第i个月的时间,yyyy-mm-dd.
     * @param date
     * @param i
     * @return
     */
    public static String getTargetBeforeTime(Date date,int i){
    	return format(getBeforetime(date, i), DEF_OUT_FORMAT);
    }

    //得到这个传入月份的第一天 （格式为YYYY-MM-dd）
  public static  Date getFirstDateOfMonth(String  dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     Date date= null;
     try {
         date = sdf.parse(dateString);
     } catch (ParseException e) {
         e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
     }
        Calendar ca = Calendar.getInstance();
        ca.setTime(date) ;
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMinimum(Calendar.DAY_OF_MONTH));
        return ca.getTime();
    }

 //得到这个传入月份的最后一天（格式为YYYY-MM-dd）
  public static  Date getEndDateOfMonth(String  dateString) {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     Date date= null;
     try {
         date = sdf.parse(dateString);
     } catch (ParseException e) {
         e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
     }
        Calendar ca = Calendar.getInstance();
        ca.setTime(date) ;
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        return ca.getTime();
    }

        //得到传入月份上个月的第一天（格式为YYYY-MM-dd）
  public static  Date getFirstDateOfPreMonth(String  dateString) {
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     Date date= null;
     try {
         date = sdf.parse(dateString);
     } catch (ParseException e) {
         e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
     }
         Calendar ca = Calendar.getInstance();
        GregorianCalendar gca = new GregorianCalendar();
		gca.setTime(date);
		gca.add(GregorianCalendar.MONTH, (-1) * 1);
		ca.setTime(gca.getTime());
		ca.set(Calendar.DAY_OF_MONTH, ca.getActualMinimum(Calendar.DAY_OF_MONTH));
        return ca.getTime();
    }

 //得到传入月份上个月的最后一天 （格式为YYYY-MM-dd）
  public static  Date getEndDateOfPreMonth(String  dateString) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     Date date= null;
     try {
         date = sdf.parse(dateString);
     } catch (ParseException e) {
         e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
     }
     Calendar ca = Calendar.getInstance();
        GregorianCalendar gca = new GregorianCalendar();
		gca.setTime(date);
		gca.add(GregorianCalendar.MONTH, (-1) * 1);
		ca.setTime(gca.getTime());
		ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        return ca.getTime();
    }
  
	/**
	 * 根据传入的日期，得到年和月拼装成的int
	 * @param date
	 * @return 年和月拼装成的int
	 */
	public static int getCurrentDateMonthInt(Date date)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR) * 100 + calendar.get(Calendar.MONTH) + 1;
	}
	
	/**
	 * addMonth个月后的同一天，如果当前日，大约目标月的最大日，则制定系统将调整成目标月的最后一天
	 * @param date
	 * @param addMonth
	 * @return
	 */
	public static Date addMonths(Date date, int addMonth){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, addMonth);
		return calendar.getTime();
	}
	
	/**
	 * 指定日期之后的最近target日的那天，返回yyyy-MM-dd格式的日期
	 * @param date
	 * @param targetDay
	 * @return
	 */
	public static Date nextNearestDay(Date date, int targetDay){
		if(targetDay < 0 || targetDay > 28){
			return null;
		}
		date = getDate(date);
		int year = getYearOfDate(date);
		int month = getMonth(date);
		int day = getDay(date);
		if(day > targetDay){
			date = addMonths(date, 1);
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, targetDay);
		return calendar.getTime();
		
		
	}

    public static void main(String[] args) {
    	Date d1 = DateUtil.stringToDateTime("2009-08-08 13:13:13.222");
    	//Date d2 = DateUtil.toDateByFormat("2008-02-03 00:00:21","yyyy-MM-dd HH:mm:ss");
    	//Calendar c1 = Calendar.getInstance();
		//c1.setTime(d1);		
		//Calendar c2 = Calendar.getInstance();
		//c2.setTime(d2);
    	//System.out.println(c1.getMinimum(Calendar.AM)+"========");
    	System.out.println();
	}
}
