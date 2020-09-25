package com.javapractice;

public class EmpWageBuilderArray {
	
	public static final int partTime=1;
	public static final int fullTime=2;
	
	private int numOfCompany= 0;
	private EmployeeWageCalculator[] companyWageArray;
	
	public EmpWageBuilderArray()
	{
		companyWageArray= new EmployeeWageCalculator[5];
	}
	
	private void addCompany(String company, int maxWorkingHours, 
							int maxWorkingDays, int ratePerHour)
	{
		companyWageArray[numOfCompany] = new EmployeeWageCalculator(company,maxWorkingHours,maxWorkingDays,ratePerHour);
		numOfCompany++;
	}
	
	private void computeEmpWageObject()
	{
		for(int i=0; i<numOfCompany; i++)
		{
			companyWageArray[i].setTotalWage(this.computeEmpWage(companyWageArray[i]));
			System.out.println(companyWageArray[i]);
		}
	}
	
	public int computeEmpWage(EmployeeWageCalculator empWageCalc)
	{
		int totalworkingHrs=0, empHrs=0, totalWorkingHrs=0, workingDay=1; 
		
		while(totalworkingHrs<=empWageCalc.maxWorkingHours && 
				workingDay<=empWageCalc.maxWorkingDays)
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
		return totalWorkingHrs*empWageCalc.ratePerHour;
	}
	
	public static void main(String args[])
	{
		EmpWageBuilderArray empWageBuilder= new EmpWageBuilderArray();
		empWageBuilder.addCompany("DMart", 20, 2, 10);
		empWageBuilder.addCompany("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWageObject();
	}
}
