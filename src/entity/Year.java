package entity;

import java.util.List;

public class Year {
	/**
	 * 是否是闰年
	 */
	private boolean isRyear;
	private List<Month> listMonth;
	private String remark;
	/**
	 * 获取是否是闰年
	 * @return isRyear 是否是闰年  
	 */
	public boolean isRyear() {
		return isRyear;
	}
	/**  
	 * 设置是否是闰年  
	 * @param isRyear 是否是闰年  
	 */
	public void setRyear(boolean isRyear) {
		this.isRyear = isRyear;
	}
	/**
	 * 获取listMonth
	 * @return listMonth listMonth  
	 */
	public List<Month> getListMonth() {
		return listMonth;
	}
	/**  
	 * 设置listMonth  
	 * @param listMonth listMonth  
	 */
	public void setListMonth(List<Month> listMonth) {
		this.listMonth = listMonth;
	}
	/**
	 * 获取remark
	 * @return remark remark  
	 */
	public String getRemark() {
		return remark;
	}
	/**  
	 * 设置remark  
	 * @param remark remark  
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
