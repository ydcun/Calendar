package ydcun;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import util.Lunar;
import entity.Day;
import entity.Month;

/**
 * @author ydcun solar阳历 lunar阴历
 */
public class MyCalendar {
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

	/**
	 * 
	 * @param str yyyy-MM-dd的格式字符串
	 * @return
	 */
	public Day getDay(String str) {
		try {
			return getDay(sf.parse(str));
		} catch (ParseException e) {
			System.out.println("字符串日期格式不正确");
			e.printStackTrace();
		}
		return null;
	}
	public Day getDay(Date date) {
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		return getDay(cl);
	}
	public Day getDay(Calendar date) {
		Day day = new Day();
		day.setCountWeekMone(date.get(Calendar.WEEK_OF_MONTH));
		day.setCountWeekYear(date.get(Calendar.WEEK_OF_YEAR));
		day.setDay(date.get(Calendar.DAY_OF_MONTH));
		day.setMonth(date.get(Calendar.MONTH)+1);
		day.setQuarter(monthToQuarter(date.get(Calendar.MONTH)));
		day.setWeek(date.get(Calendar.DAY_OF_WEEK)-1);
		day.setYear(date.get(Calendar.YEAR));
		
		Lunar lunar = new Lunar(date);
		day.setDayLunar(lunar.getChinaDayString(lunar.getDay()));
		day.setMonthLunar(lunar.getMonth());
		day.setYearLunar(lunar.getYear());
		return day;
	}
	
	public Month getMonth(String str){
		try {
			getMonth(sf.parse(str));
		} catch (ParseException e) {
			System.out.println("日期转换错误");
			e.printStackTrace();
		}
		return null;
	}
	public Month getMonth(Date date){
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		return getMonth(cl);
	}
	public Month getMonth(Calendar date){
		Month month = new Month();
		try {
			getCountDayOfMonth(date);
		} catch (Exception e) {
			System.out.println("获取某月天数异常");
			e.printStackTrace();
		}
		
		
		
		return month;
		
	}
	
	/**
	 * 获取该月有多少天
	 * @param date
	 * @return
	 * @throws Exception
	 */
	private int getCountDayOfMonth(Calendar date) throws Exception{
		//先将这个月设置成一号，在加一个月，在减去一天  ，这时候就是这个月最后一天的日期，也就是这个月有多少天
		date.set(Calendar.DAY_OF_MONTH, 1);
		date.add(Calendar.MONTH, 1);
		date.add(Calendar.DAY_OF_MONTH,-1);
		int day = date.get(Calendar.DAY_OF_MONTH);
		return day;
		
	}
	//给月份返回第几季度
	private int monthToQuarter(int month){
		int quarter=0;
		if(month>=1&&month<=3) quarter=1;
		if(month>=4&&month<=6) quarter=2;
		if(month>=7&&month<=9) quarter=3;
		if(month>=10&&month<=12) quarter=4;
		return quarter;
	}

	public static void main(String[] args) {
//		new MyCalendar().getDay("2013-06-08");
		new MyCalendar().getMonth("2013-02-08");
	}
}
