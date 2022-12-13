package com.EmployeeWageOOPs;

class EmpCalculation
{
    public static final int IS_FULLTIME = 1;
    public static final int IS_PARTTIME = 2;
    public static int empHrs;
    public void empCheck()
    {
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
    }
}
class DailyWage
{
    public static final int EMP_RATE_PER_HOUR = 20;
    static int totalWage = 0;
    int totalDailyWage;
    public void dailyWageCalculation()
    {
        totalDailyWage = EmpCalculation.empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Daily employee wage is "+totalDailyWage);
    }
    public void totalWage()
    {
        totalWage = totalWage + totalDailyWage;
    }
}
public class EmpWageComputation
{
    public static int NUM_OF_WORKING_DAYS = 20;
    public static void main(String[] args)
    {
        for (int i = 1;  i<= NUM_OF_WORKING_DAYS; i++)
        {
            System.out.println("For DAY"+i);
            EmpCalculation emp = new EmpCalculation();
            emp.empCheck();
            DailyWage wage = new DailyWage();
            wage.dailyWageCalculation();
            wage.totalWage();
        }
        System.out.println("Total Wage of employee in a month = "+DailyWage.totalWage);
    }
}

