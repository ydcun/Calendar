package entity;

import java.util.ArrayList;
import java.util.List;

public class Month {
	/**
	 * 这个月第一天是星期几
	 */
	private int firstWeek;
	/**
	 * 本月的所有DAY
	 */
	private List<Day> listDay;
	/**
	 * 这个月有多少天
	 */
	private int countDay;
	
	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 获取这个月第一天是星期几
	 * @return firstWeek 这个月第一天是星期几  
	 */
	public int getFirstWeek() {
		return firstWeek;
	}

	/**  
	 * 设置这个月第一天是星期几  
	 * @param firstWeek 这个月第一天是星期几  
	 */
	public void setFirstWeek(int firstWeek) {
		this.firstWeek = firstWeek;
	}

	/**
	 * 获取本月的所有DAY
	 * @return listDay 本月的所有DAY  
	 */
	public List<Day> getListDay() {
		return listDay;
	}

	/**  
	 * 设置本月的所有DAY  
	 * @param listDay 本月的所有DAY  
	 */
	public void setListDay(List<Day> listDay) {
		this.listDay = listDay;
	}

	/**
	 * 获取这个月有多少天
	 * @return countDay 这个月有多少天  
	 */
	public int getCountDay() {
		return countDay;
	}

	/**  
	 * 设置这个月有多少天  
	 * @param countDay 这个月有多少天  
	 */
	public void setCountDay(int countDay) {
		this.countDay = countDay;
	}

	/**
	 * 获取备注
	 * @return remark 备注  
	 */
	public String getRemark() {
		return remark;
	}

	/**  
	 * 设置备注  
	 * @param remark 备注  
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
	
}
