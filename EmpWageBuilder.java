package com.bridgelabz.employee;

public class EmpWageBuilder {
    public static void CalculateTotalWage() {


        final int Is_Part_Time = 1;
        final int Is_Full_Time = 2;
        final int EMP_RATE_PER_HOUR = 20;
        final int NUM_OF_WORKING_DAYS = 20;
        final int MAX_HRS_IN_MONTH = 100;

        //variables
        int empHrs = 0, totalEmpHrs= 0, totalWorkingDays = 0;
        //computation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
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
        int totalEmpWage=totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
    public static void main(String[] args){
        CalculateTotalWage();
    }
}
