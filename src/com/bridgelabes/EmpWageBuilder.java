package com.bridgelabes;

public class EmpWageBuilder {

	public static final int IS_EMP_PRESENT= 1;
	
	 
		public static void main(String[] args) {
					
			double empCheck = Math.floor(Math.random()*10)%2;
			if(empCheck == 1) {
				System.out.println("Emp is present");
			}
			else {
				System.out.println("Emp is absent");
			}
		}
}