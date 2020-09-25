package com.javapractice;

public class EmployeeWageCalculator {

	public static final int partTime=1;
	public static final int fullTime=2;
	private final String company;
	private final int maxWorkingHours;
	private final int maxWorkingDays; 
	private final int ratePerHour;
	private int totalWage;
	
	public EmployeeWageCalculator (String company, int maxWorkingHours, 
							int maxWorkingDays, int ratePerHour)
	{
		this.company=company;
		this.ratePerHour=ratePerHour;
		this.maxWorkingDays=maxWorkingDays;
		this.maxWorkingHours=maxWorkingHours;
	}
	
	public void computeEmpWage()
	{
		int totalworkingHrs=0, empHrs=0, totalWorkingHrs=0, workingDay=1; 
		
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
	}
	
	@Override
	public String toString()
	{
		return "Total Employee Wage for company "+ company + " :" + totalWage ;
	}
	
	public static void main(String args[])
	{
		EmployeeWageCalculator dMart= new EmployeeWageCalculator("Dmart", 20, 2, 10);
		dMart.computeEmpWage();
		System.out.println(dMart);
		EmployeeWageCalculator reliance= new EmployeeWageCalculator("Reliance", 10, 4, 20);
		reliance.computeEmpWage();
		System.out.println(reliance);
		
	}
}
