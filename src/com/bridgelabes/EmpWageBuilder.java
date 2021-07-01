package com.bridgelabes;

public class EmpWageBuilder {

	public static final int IS_EMP_PRESENT = 1;
	public static final int IS_PART_TIME= 2;
	
	public CompanyEmployeWage[] companyEmployeWageArray;
	private int numOfCompanies = 0;
	
	
	public EmpWageBuilder() {
		super();
		companyEmployeWageArray = new CompanyEmployeWage[5];
	}
	public void addcompanyEmpWage(int WAGE_PER_HOUR, int MAX_HRS_ALLOWED, int NUM_OF_WROKING_DAY, String company) {
		companyEmployeWageArray[numOfCompanies] = new CompanyEmployeWage(WAGE_PER_HOUR, MAX_HRS_ALLOWED, NUM_OF_WROKING_DAY, company);
		numOfCompanies++;
	}
	public void computeEmpWage() {
		for (int i = 0; i<companyEmployeWageArray.length; i++) {
			CompanyEmployeWage companyEmployeWage = companyEmployeWageArray[i];
			if (companyEmployeWage != null) {
				int monthlyEmployeeWage = this.calculateEmpWage(companyEmployeWage);
				companyEmployeWage.setTotalEmpWage(monthlyEmployeeWage);
				System.out.println("Company employee wage is :"+companyEmployeWage);
			}
		}
	}
	public int calculateEmpWage(CompanyEmployeWage companyEmployeWage) {
		int monthlyEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;		
		while (totalEmpHrs < companyEmployeWage.MAX_HRS_ALLOWED && totalWorkingDays < companyEmployeWage.NUM_OF_WROKING_DAY)
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
				empHrs = 0;
				break;
			}
			totalEmpHrs = totalEmpHrs + empHrs;
			dailywage = companyEmployeWage.WAGE_PER_HOUR * empHrs ;
			monthlyEmpWage = monthlyEmpWage + dailywage ;
			System.out.println(monthlyEmpWage);
		}
		return monthlyEmpWage;
	}
	
	public static void main(String[] args) 
	{
		EmpWageBuilder wageBuilder = new EmpWageBuilder();
		wageBuilder.addcompanyEmpWage(20, 100, 20, "Dmart");
		wageBuilder.addcompanyEmpWage(15, 200, 20, "Relience");
	}
}