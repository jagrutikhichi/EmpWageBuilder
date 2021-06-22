package com.bridgelabes;

public class EmpWageBuilder {

	public static final int IS_EMP_PRESENT = 1;
	public static final int IS_PART_TIME= 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULLDAY = 8;
	public static final int PART_TIME=4;
	public static final int NUM_OF_WROKING_DAY=20;

	public static void main(String[] args) 
	{
		int monthlyEmpWage = 0;
		int dailywage = 0;
		for (int day = 0; day < NUM_OF_WROKING_DAY; day++) 
		{
			double empCheck = Math.floor(Math.random() * 10) % 3;

			switch ((int) empCheck) {
			case IS_EMP_PRESENT:
				dailywage = FULLDAY * WAGE_PER_HOUR;
				break;
			case IS_PART_TIME:
				dailywage = PART_TIME * WAGE_PER_HOUR;				
				break;
			default:
				System.out.println("Emp is Absent");
			}
			monthlyEmpWage = monthlyEmpWage + dailywage ;
			System.out.println("Emp Wage is : "+dailywage);
			
		}
		System.out.println("monthly wage : " +monthlyEmpWage);
	}
}