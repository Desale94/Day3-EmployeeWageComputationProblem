package com.bridgelabz.employee;

public class CompanyEmpWage {
    public final String company;
    public final int empRatePerHr;
    public final int numOfWorkingDays;
    public final int maxHrsPerMonth;
    public int totalEmpWage;
    public CompanyEmpWage(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth){
        this.company=company;
        this.empRatePerHr=empRatePerHr;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHrsPerMonth=maxHrsPerMonth;

    }
    public void setTotalEmpWage(int computeEmpWage) {
        this.totalEmpWage=totalEmpWage;
    }

    @Override
    public String toString(){
        return "Total employee wage for company: " + company + " is: " + totalEmpWage;

    }


}
