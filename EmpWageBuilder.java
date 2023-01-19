package com.bridgelabz.employee;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation problem!!");
        int Is_Full_Time = 1;
        int EMP_RATE_PER_HOUR= 20;
        int empHrs=0;
        int empWage=0;
        double empCheck = Math.floor(Math.random()*10)%2;
        if(empCheck == Is_Full_Time)
            empHrs=8;
        else
            empHrs=0;
        empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
    }
}
