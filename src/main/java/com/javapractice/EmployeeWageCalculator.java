package com.javapractice;

public class EmployeeWageCalculator {

	public final String company;
	public final int maxWorkingHours;
	public final int maxWorkingDays; 
	public final int ratePerHour;
	public int totalWage;
	
	public EmployeeWageCalculator (String company, int maxWorkingHours, 
							int maxWorkingDays, int ratePerHour)
	{
		this.company=company;
		this.ratePerHour=ratePerHour;
		this.maxWorkingDays=maxWorkingDays;
		this.maxWorkingHours=maxWorkingHours;
	}
	
	public void setTotalWage(int totalWage) 
	{
		this.totalWage=totalWage;
	}
	
	@Override
	public String toString()
	{
		return "Total Employee Wage for company "+ company + " :" + totalWage ;
	}
}
