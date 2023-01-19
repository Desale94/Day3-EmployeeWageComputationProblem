package com.bridgelabz.employee;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation problem!!");
        int Is_Full_Time = 1;
        //constant
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Is_Full_Time)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
