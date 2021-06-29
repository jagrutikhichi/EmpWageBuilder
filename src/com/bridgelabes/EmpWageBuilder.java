package com.bridgelabes;

public class EmpWageBuilder {

	public static final int IS_EMP_PRESENT = 1;
	public static final int IS_PART_TIME= 2;
	public static int WAGE_PER_HOUR;
	public static int MAX_HRS_ALLOWED;
	public static int NUM_OF_WROKING_DAY;
	public static String company;
	
	public EmpWageBuilder(int WAGE_PER_HOUR, int MAX_HRS_ALLOWED, int NUM_OF_WROKING_DAY, String company) {
		this.WAGE_PER_HOUR = WAGE_PER_HOUR;
		this.MAX_HRS_ALLOWED = MAX_HRS_ALLOWED;
		this.NUM_OF_WROKING_DAY = NUM_OF_WROKING_DAY;
		this.company = company;
	}
	
	public static void calculateEmpWage() {
		int monthlyEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;		
		while (totalEmpHrs < MAX_HRS_ALLOWED && totalWorkingDays < NUM_OF_WROKING_DAY)
		{
			totalWorkingDays++ ;
			int dailywage = 0;
			int empHrs = 0;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int) empCheck) {
			case IS_EMP_PRESENT:
				empHrs= 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
			}
			totalEmpHrs = totalEmpHrs + empHrs;
			dailywage = WAGE_PER_HOUR * empHrs ;
			monthlyEmpWage = monthlyEmpWage + dailywage ;			
		}
		System.out.println("monthly wage : " +monthlyEmpWage+" of "+company);
		System.out.println("total Hrs : " +totalEmpHrs);
	}
	
	public static void main(String[] args) 
	{
		EmpWageBuilder dmart = new EmpWageBuilder(20, 100, 20, "Dmart");
		dmart.calculateEmpWage();
		EmpWageBuilder reliance = new EmpWageBuilder(20, 100, 20, "Reliance");
		reliance.calculateEmpWage();
	}
}