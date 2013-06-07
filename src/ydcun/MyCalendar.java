package ydcun;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import util.Lunar;
import entity.Day;
import entity.Month;
import entity.Year;

/**
 * @author ydcun solar阳历 lunar阴历
 */
public class MyCalendar {
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

//----------------------------获取日对象---------------------------------		
	/**
	 * 
	 * @param str yyyy-MM-dd的格式字符串
	 * @param <T> 返回对象的类型
	 * @param t 
	 * @return
	 */
	public <T> T get(String str,T t){
		try {
			return get(sf.parse(str),t);
		} catch (ParseException e) {
			System.out.println("日份字符串日期格式不正确");
			e.printStackTrace();
		}
		return null;
		
	}
	public <T> T get(Date date,T t){
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		return get(cl,t);
	}
	public <T> T get(Calendar date,T t){
		String temp =t.getClass().getName();
		int i = temp.lastIndexOf(".");
		if(i!=-1)
			temp = temp.substring(temp.lastIndexOf(".")+1);
		
		if(temp.equals("Year")){
			t = (T) getYear(date);
		}else if(temp.equals("Month")){
			t = (T) getMonth(date);
		}else if(temp.equals("Day")){
			t= (T) getDay(date);
		}
		return t;
	}
	
//----------------------------获取日对象---------------------------------	
	
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
	
//-----------------------------获取月对象-----------------------------------	

	public Month getMonth(Calendar date){
		Month month = new Month();
		month.setCountDay(getCountDayOfMonth(date));	//设置该月有多少天
		date.set(Calendar.DAY_OF_MONTH, 1);
		month.setFirstWeek(date.get(Calendar.DAY_OF_WEEK)-1);	//设置这个月第一天是周几
		month.setListDay(getListDayOfMonth(date));	//设置该月所有天数组
		return month;
		
	}
//-----------------------------获取年对象-----------------------------------		

	public Year getYear(Calendar date){
		Year year = new Year();
		date.set(Calendar.MONTH, 2);
		year.setRyear(getCountDayOfMonth(date)>28);
		year.setListMonth(getListMonthOfYear(date));
		return year;
		
	}
	
	
//-----------------------------私有的方法----------------------------------		
	/**
	 * @param date 该年中的任意一天对象
	 * @return 该年所有对像
	 */
	private List<Month> getListMonthOfYear(Calendar date){
		List<Month> listMonth = new ArrayList<Month>();
		for(int i=0;i<12;i++){
			date.set(Calendar.MONTH, i+1);
			listMonth.add(getMonth(date));
		}
		return listMonth;
	}
	/**
	 * @param date 某月的任意一天日历对象
	 * @return  该月所有日的对象列表
	 */
	private List<Day> getListDayOfMonth(Calendar date){
		List<Day> listDay = new ArrayList<Day>();
		for(int i=0;i<getCountDayOfMonth(date);i++){
			date.set(Calendar.DAY_OF_MONTH, i+1);
			listDay.add(getDay(date));
		}
		return listDay;
		
	}
	/**
	 * 获取该月有多少天
	 * @param date
	 * @return
	 * @throws Exception
	 */
	private int getCountDayOfMonth(Calendar date){
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
//		new MyCalendar().getDay("2013-06-09");
//		new MyCalendar().getMonth("2013-06-08");
//		new MyCalendar().getYear("2013-02-02");
		MyCalendar m =new MyCalendar();

		Year year = m.get("2013-06-02", new Year());
//		Month month = m.get("2013-06-08", new Month());
//		Day day = m.get("2013-06-08", new Day());
//	
	}
}
