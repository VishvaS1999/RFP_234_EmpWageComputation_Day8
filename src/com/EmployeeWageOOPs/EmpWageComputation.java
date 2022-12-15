package com.EmployeeWageOOPs;


public class EmpWageComputation
{
    public static final int partTime = 1;
    public static final int fullTime = 2;
    private final String company;
    private final int salaryPerHour;
    private final int workingDays;
    private final int maxWorkingHours;
    private int totalEmpWage;
    public EmpWageComputation(String company, int salaryPerHour, int workingDays,
                      int maxWorkingHours)
    {

        this.company = company;
        this.salaryPerHour = salaryPerHour;
        this.workingDays = workingDays;
        this.maxWorkingHours = maxWorkingHours;

    }
    public void empWageCal()
    {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= maxWorkingHours &&
                totalWorkingDays < workingDays)
        {
            totalWorkingDays++;
            int checkEmp = (int) Math.floor(Math.random() * 10) % 3;
            switch (checkEmp)
            {
                case fullTime :
                    System.out.println("Employee is full time present");
                    empHrs = 8;
                    break;
                case partTime :
                    empHrs = 4;
                    System.out.println("Employee is part time present");
                    break;
                default :
                    System.out.println("Employee is absent");
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;

            System.out.println("Employee Working Days : " +totalWorkingDays +
                    "     Employee Working Hours : " +totalEmpHrs);
        }
        totalEmpWage = totalEmpHrs * salaryPerHour;
    }

    @Override
    public String toString()
    {
        return "Total Employee Wage for " +company+ " Company is : " +totalEmpWage;
    }
    public static void main(String[] args)
    {

        EmpWageComputation TCS = new EmpWageComputation("TCS", 20, 1, 10);
        EmpWageComputation Accenture = new EmpWageComputation("Accenture", 10, 2, 20);
        EmpWageComputation HCL = new EmpWageComputation("HCL", 10, 3, 20);
        EmpWageComputation Magic = new EmpWageComputation("Magic edTech", 20, 4, 10);
        TCS.empWageCal();
        System.out.println(TCS);
        Accenture.empWageCal();
        System.out.println(Accenture);
        HCL.empWageCal();
        System.out.println(HCL);
        Magic.empWageCal();
        System.out.println(Magic);

    }
}

