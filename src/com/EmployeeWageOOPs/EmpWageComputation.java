package com.EmployeeWageOOPs;

class CompanyEmpWage
{

    public static final  int partTime=1,fullTime=2;
    public final String company;
    public final int salaryPerHour;
    public final int workingDays;
    public final int maxWorkingHours;
    public int totalEmpWage;
    public CompanyEmpWage (String company ,int salaryPerHour, int workingDays, int maxWorkingHours)
    {

        this.company = company;
        this.salaryPerHour = salaryPerHour;
        this.workingDays = workingDays;
        this.maxWorkingHours = maxWorkingHours;
    }
    public void setTotalEmpWage(int totalEmpWage)
    {
        this.totalEmpWage = totalEmpWage;
    }
    public String toString()
    {
        return " Total Emp Wage for " + company + " is " + totalEmpWage ;
    }
}
public class EmpWageComputation
{
    public static final  int partTime=1,fullTime=2;
    private int numberOfCompany=0;
    private CompanyEmpWage[] companyEmpWageArray;
    public EmpWageComputation()
    {
        companyEmpWageArray = new CompanyEmpWage[5];
    }
    private void addCompanyEmpWage(String company ,int salaryPerHour, int workingDays, int maxWorkingHours)
    {

        companyEmpWageArray[numberOfCompany]= new CompanyEmpWage(company, salaryPerHour, workingDays, maxWorkingHours);

        numberOfCompany ++;
    }
    private void computeEmpWage()
    {

        for(int i=0;i<numberOfCompany;i++)
        {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage)
    {

        int empHours=0,totalEmpHours=0,totalWorkingDays=0;

        while(totalWorkingDays < companyEmpWage.workingDays && totalEmpHours <= companyEmpWage.maxWorkingHours) {

            totalWorkingDays ++;

            int empCheck = (int)Math.floor(Math.random() *10 )% 3;

            switch(empCheck)
            {

                case partTime:
                    System.out.println("Employee is Present Part Time");
                    empHours=4;
                    break;

                case fullTime:
                    System.out.println("Employee is Present Full Time");
                    empHours=8;
                    break;

                default:
                    System.out.println("Employee is Absent");
                    empHours=0;
            }
            totalEmpHours += empHours;
            System.out.println("DAY:"+ totalWorkingDays +" Emphrs:" + totalEmpHours);
        }
        return totalEmpHours * companyEmpWage.salaryPerHour;
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Salary Calculator on Master branch");

        EmpWageComputation empWageBuild =new EmpWageComputation();
        empWageBuild.addCompanyEmpWage("TCS",5,2,10);
        empWageBuild.addCompanyEmpWage("Accenture",3,4,20);
        empWageBuild.computeEmpWage();
    }
}
