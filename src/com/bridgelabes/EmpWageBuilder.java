package com.bridgelabes;

public class EmpWageBuilder {

	public static final int IS_EMP_PRESENT = 1;
	public static final int IS_PART_TIME= 2;
	
	public static void calculateEmpWage(int WAGE_PER_HOUR, int MAX_HRS_ALLOWED, int NUM_OF_WROKING_DAY , String company) {
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
				System.out.println("Emp is Absent");
			}
			totalEmpHrs = totalEmpHrs + empHrs;
			dailywage = WAGE_PER_HOUR * empHrs ;
			monthlyEmpWage = monthlyEmpWage + dailywage ;
			
			System.out.println("Emp Wage is : "+dailywage);
			
		}
		System.out.println("monthly wage : " +monthlyEmpWage+" of "+company);
		System.out.println("total Hrs : " +totalEmpHrs);
	}
	
	public static void main(String[] args) 
	{
		calculateEmpWage(20, 100, 20,"Dmart");
		calculateEmpWage(15, 90, 20,"Relience");
	}
}