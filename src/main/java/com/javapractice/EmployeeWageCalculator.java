package com.javapractice;

public class EmployeeWageCalculator {

	public static final int partTime=1;
	public static final int fullTime=2;
	
	
	
	public static void computeEmpWage(String company, int maxWorkingHours, int maxWorkingDays, int ratePerHour)
	{
		int totalWage=0, totalworkingHrs=0, empHrs=0, totalWorkingHrs=0, workingDay=1; 
		
		while(totalworkingHrs<=maxWorkingHours && 
				workingDay<=maxWorkingDays)
		{
			int empCheck=(int)(Math.random()*3);
			switch(empCheck)
			{
				case partTime:
					empHrs=4;
					break;
				case fullTime:
					empHrs=8;
					break;
				default:
					empHrs=0;
			}
			totalWorkingHrs+=empHrs;
			System.out.println("Day#"+ workingDay + " working hours:" + empHrs);
			workingDay++;
		}
		totalWage=totalWorkingHrs*ratePerHour;
		System.out.println("Total Employee Wage for company "+ company + " :" + totalWage);
	}
	
	public static void main(String args[])
	{
		computeEmpWage("Dmart", 20, 2, 10);
		computeEmpWage("Reliance", 10, 4, 20);
	}
}
