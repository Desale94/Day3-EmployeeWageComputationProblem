//UC9-Ability to save the total Wage for Each Company

package com.bridgelabz.employee;
public class EmpWageBuilderObject{
    public static final int Is_Part_Time=1;
    public static final int Is_Full_Time=2;

    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHrsPerMonth;
    private int totalEmpWage;
    public EmpWageBuilderObject(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth){
        this.company=company;
        this.empRatePerHr=empRatePerHr;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHrsPerMonth=maxHrsPerMonth;

    }

    public void computeEmpWage(){
        //variables
        int empHrs = 0, totalEmpHrs= 0, totalWorkingDays = 0;
        //computation
        while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case Is_Part_Time:
                    empHrs = 4;
                    break;
                case Is_Full_Time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays +"Emp Hrs: " + empHrs);

        }
        totalEmpWage=totalEmpHrs+empRatePerHr;
    }
    @Override
    public String toString(){
        return "Total employee wage for company: " + company + " is: " + totalEmpWage;

    }
    public static void main(String[] args){
        EmpWageBuilderObject dMart = new EmpWageBuilderObject("DMart",20,2,10);
        EmpWageBuilderObject reliance = new EmpWageBuilderObject("Reliance",10,4,20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}
