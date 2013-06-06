package util;

import java.util.Calendar;

/**
	 * 判断来那个日历类型的时期相差多少年、月、天、小时、分钟、秒
	 */
public class Compare{
	/**
	 * 相差的年数
	 */
	private int year;
	/**
	 * 相差的月数
	 */
	private int month;
	/**
	 * 相差天数
	 */
	private int day;
	/**
	 * 相差小时
	 */
	private int hour;
	/**
	 * 相差分钟
	 */
	private int min;
	/**
	 * 相差秒
	 */
	private int second;
	private void spaceMonth(Calendar c1,Calendar c2){
		year =c1.get(Calendar.YEAR)-c2.get(Calendar.YEAR);
		month = c1.get(Calendar.MONTH)-c2.get(Calendar.MONTH);
		if(month<0&&year>0){
			year--;
			month+=12;
		}
		day = c1.get(Calendar.DAY_OF_MONTH)-c2.get(Calendar.DAY_OF_MONTH);
		if(day<0&&month>0){
			month--;
			day+=c1.get(Calendar.DAY_OF_MONTH);
		}
		hour =c1.get(Calendar.HOUR_OF_DAY)-c2.get(Calendar.HOUR_OF_DAY);
		if(hour<0&&day>0){
			day--;
			hour+=24;
		}
		min = c1.get(Calendar.MINUTE)-c2.get(Calendar.MINUTE);
		if(min<0&&hour>0){
			hour--;
			min+=60;
		}
		second = c1.get(Calendar.SECOND)-c2.get(Calendar.SECOND);
		if(second<0&&min>0){
			min--;
			second+=60;
		}
//		return year+"年"+month+"月"+day+"天"+hour+"小时"+min+"分钟"+second+"秒";
	}
	/**
	 * 获取相差的年数
	 * @return year 相差的年数  
	 */
	public int getYear() {
		return year;
	}
	/**  
	 * 设置相差的年数  
	 * @param year 相差的年数  
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * 获取相差的月数
	 * @return month 相差的月数  
	 */
	public int getMonth() {
		return month;
	}
	/**  
	 * 设置相差的月数  
	 * @param month 相差的月数  
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * 获取相差天数
	 * @return day 相差天数  
	 */
	public int getDay() {
		return day;
	}
	/**  
	 * 设置相差天数  
	 * @param day 相差天数  
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * 获取相差小时
	 * @return hour 相差小时  
	 */
	public int getHour() {
		return hour;
	}
	/**  
	 * 设置相差小时  
	 * @param hour 相差小时  
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}
	/**
	 * 获取相差分钟
	 * @return min 相差分钟  
	 */
	public int getMin() {
		return min;
	}
	/**  
	 * 设置相差分钟  
	 * @param min 相差分钟  
	 */
	public void setMin(int min) {
		this.min = min;
	}
	/**
	 * 获取相差秒
	 * @return second 相差秒  
	 */
	public int getSecond() {
		return second;
	}
	/**  
	 * 设置相差秒  
	 * @param second 相差秒  
	 */
	public void setSecond(int second) {
		this.second = second;
	}
	
	
	
}