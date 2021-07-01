package com.bridgelabes;

public class CompanyEmployeWage {
	public int WAGE_PER_HOUR;
	public int MAX_HRS_ALLOWED;
	public int NUM_OF_WROKING_DAY;
	public String company;
	public int totalEmpWage;
	
	public CompanyEmployeWage(int WAGE_PER_HOUR, int MAX_HRS_ALLOWED, int NUM_OF_WROKING_DAY, String company) {
		super();
		this.company = company;
		this.MAX_HRS_ALLOWED = MAX_HRS_ALLOWED;
		this.NUM_OF_WROKING_DAY = NUM_OF_WROKING_DAY;
		this.WAGE_PER_HOUR = WAGE_PER_HOUR;
	}
	
	@Override
	public String toString() {
		return "CompanyEmployeWage [WAGE_PER_HOUR=" + WAGE_PER_HOUR + ", MAX_HRS_ALLOWED=" + MAX_HRS_ALLOWED
				+ ", NUM_OF_WROKING_DAY=" + NUM_OF_WROKING_DAY + ", company=" + company + ", totalEmpWage="
				+ totalEmpWage + "]";
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
}
