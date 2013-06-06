package entity;

/**
 * @author xkj 实体对象 天 day
 */
/**
 * @author xkj
 *
 */
public class Day {
	/**
	 * 星期几
	 */
	private int week;   

	/**
	 * 阳历天
	 */
	private int day;  
	
	/**
	 *  阳历月份
	 */
	private int month; 
	
	/**
	 * 阳历年份
	 */
	private int year;   

	/**
	 * 阴历天
	 */
	private String dayLunar;  
	
	/**
	 * 阴历月份
	 */
	private String monthLunar;   
	
	/**
	 * 阴历年份
	 */
	private int yearLunar;
	

	/**
	 * 第几季度
	 */
	private int quarter; 
	
	/**
	 * 是这年的第几周
	 */
	private int countWeekYear;   
	
	/**
	 * 是这个月的第几周
	 */
	private int countWeekMone;
	/**
	 * 备注
	 */
	private int remark;
	/**
	 * 获取星期几
	 * @return week 星期几  
	 */
	public int getWeek() {
		return week;
	}
	/**  
	 * 设置星期几  
	 * @param week 星期几  
	 */
	public void setWeek(int week) {
		this.week = week;
	}
	/**
	 * 获取阳历天
	 * @return day 阳历天  
	 */
	public int getDay() {
		return day;
	}
	/**  
	 * 设置阳历天  
	 * @param day 阳历天  
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * 获取阳历月份
	 * @return month 阳历月份  
	 */
	public int getMonth() {
		return month;
	}
	/**  
	 * 设置阳历月份  
	 * @param month 阳历月份  
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * 获取阳历年份
	 * @return year 阳历年份  
	 */
	public int getYear() {
		return year;
	}
	/**  
	 * 设置阳历年份  
	 * @param year 阳历年份  
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * 获取阴历天
	 * @return dayLunar 阴历天  
	 */
	public String getDayLunar() {
		return dayLunar;
	}
	/**  
	 * 设置阴历天  
	 * @param dayLunar 阴历天  
	 */
	public void setDayLunar(String dayLunar) {
		this.dayLunar = dayLunar;
	}
	/**
	 * 获取阴历月份
	 * @return monthLunar 阴历月份  
	 */
	public String getMonthLunar() {
		return monthLunar;
	}
	/**  
	 * 设置阴历月份  
	 * @param monthLunar 阴历月份  
	 */
	public void setMonthLunar(String monthLunar) {
		this.monthLunar = monthLunar;
	}
	/**
	 * 获取阴历年份
	 * @return yearLunar 阴历年份  
	 */
	public int getYearLunar() {
		return yearLunar;
	}
	/**  
	 * 设置阴历年份  
	 * @param yearLunar 阴历年份  
	 */
	public void setYearLunar(int yearLunar) {
		this.yearLunar = yearLunar;
	}
	/**
	 * 获取第几季度
	 * @return quarter 第几季度  
	 */
	public int getQuarter() {
		return quarter;
	}
	/**  
	 * 设置第几季度  
	 * @param quarter 第几季度  
	 */
	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}
	/**
	 * 获取是这年的第几周
	 * @return countWeekYear 是这年的第几周  
	 */
	public int getCountWeekYear() {
		return countWeekYear;
	}
	/**  
	 * 设置是这年的第几周  
	 * @param countWeekYear 是这年的第几周  
	 */
	public void setCountWeekYear(int countWeekYear) {
		this.countWeekYear = countWeekYear;
	}
	/**
	 * 获取是这个月的第几周
	 * @return countWeekMone 是这个月的第几周  
	 */
	public int getCountWeekMone() {
		return countWeekMone;
	}
	/**  
	 * 设置是这个月的第几周  
	 * @param countWeekMone 是这个月的第几周  
	 */
	public void setCountWeekMone(int countWeekMone) {
		this.countWeekMone = countWeekMone;
	}
	/**
	 * 获取备注
	 * @return remark 备注  
	 */
	public int getRemark() {
		return remark;
	}
	/**  
	 * 设置备注  
	 * @param remark 备注  
	 */
	public void setRemark(int remark) {
		this.remark = remark;
	}
	
	
	
}
