package com.EmployeeWageOOPs;

class EmpCalculation
{
    public static final int IS_FULLTIME = 1;
    public static final int IS_PARTTIME= 2;
    public static int TOTAL_WAGE = 0;
    static String company;
    int empRatePerHour,numOfWorkingDays,maxHrsPerMonth;
    EmpCalculation(String company, int empRatePerHour,int numOfWorkingDays,int maxHrsPerMonth)
    {
        EmpCalculation.company = company ;
        this.empRatePerHour=empRatePerHour;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHrsPerMonth=maxHrsPerMonth;
    }
    public void empCheck()
    {
        int	totalworkingDays = 0, empHrs = 0, totalHrs=0, totalDailyWage=0;
        while (totalworkingDays < numOfWorkingDays  && totalHrs < maxHrsPerMonth)
        {
            totalworkingDays++;
            System.out.println("For DAY"+totalworkingDays);
            int empCheck = (int)Math.floor(Math.random() * 10) % 3;
            switch(empCheck)
            {
                case IS_FULLTIME:
                    System.out.println("Employee is present and worked full-time");
                    empHrs = 8;
                    break;
                case IS_PARTTIME:
                    System.out.println("Employee is present and worked part-time");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    empHrs = 0;
            }
            totalDailyWage = empHrs * empRatePerHour;
            System.out.println("Daily employee wage is "+totalDailyWage);
            totalHrs = totalHrs + empHrs;
            TOTAL_WAGE = TOTAL_WAGE + totalDailyWage;
        }
        System.out.println("Total Wage of "+EmpCalculation.company+"'s employees in a month = "+EmpCalculation.TOTAL_WAGE);

    }

}
public class EmpWageComputation
{
    public static void main(String[] args)
    {

        EmpCalculation dmart = new EmpCalculation("D-MART",20,2,10);
        dmart.empCheck();
        EmpCalculation reliance = new EmpCalculation("RELIANCE",10,4,20);
        reliance.empCheck();

    }
}

