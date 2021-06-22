package com.bridgelabes;

public class EmpWageBuilder {

	public static final int IS_EMP_PRESENT = 1;
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULLDAY = 8;

	public static void main(String[] args) 
	{
		int dailywage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) 
		{
			System.out.println("Emp is present");
			dailywage = FULLDAY * WAGE_PER_HOUR;
			System.out.println("Daily Emp Wage is : " + dailywage);
		} 
		else 
		{
			System.out.println("Emp is absent");

		}
		System.out.println("Daily Emp Wage is : " + dailywage);
	}
}